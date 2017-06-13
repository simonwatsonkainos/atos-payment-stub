package uk.gov.hmpo;

import io.dropwizard.forms.MultiPartBundle;
import sips.cn.contract.PaymentServiceImpl;
import sips.en.contract.dvla.NotificationTransactionResponse;
import uk.gov.hmpo.controllers.PaymentController;
import uk.gov.hmpo.health.ApplicationHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import uk.gov.hmpo.helpers.ConfigurationHelper;
import uk.gov.hmpo.services.AutomaticResponseService;

import javax.xml.ws.Endpoint;
import java.net.MalformedURLException;

public class AtosPaymentStub extends Application<AtosPaymentStubConfiguration> {

    public static void main(String[] args) throws Exception {
        new AtosPaymentStub().run(args);
    }

    @Override
    public void initialize(Bootstrap<AtosPaymentStubConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle());
        bootstrap.addBundle(new MultiPartBundle());
        bootstrap.addBundle(new AssetsBundle("/assets/", "/assets/", null, "css"));
        bootstrap.addBundle(new AssetsBundle("/assets/", "/assets/", null, "js"));
    }

    @Override
    public void run(AtosPaymentStubConfiguration configuration, Environment environment) {

        ConfigurationHelper.setConfiguration(configuration);

        if(ConfigurationHelper.getConfiguration().getSoapServer().isAdditionalSoapServerLogging()) {
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        }

        final PaymentController paymentController = new PaymentController();

        JerseyEnvironment jerseyEnvironment = environment.jersey();
        jerseyEnvironment.register(paymentController);

        ApplicationHealthCheck applicationHealthCheck = new ApplicationHealthCheck();
        environment.healthChecks().register("alive", applicationHealthCheck);

        Endpoint.publish(configuration.getSoapServer().getBaseUrl(), new PaymentServiceImpl());
    }
}
