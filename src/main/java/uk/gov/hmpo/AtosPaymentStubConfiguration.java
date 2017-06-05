package uk.gov.hmpo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class AtosPaymentStubConfiguration extends Configuration {

    @JsonProperty
    private SoapServerConfig soapServer;

    @JsonProperty
    private SoapClientConfig soapClient;

    @JsonProperty
    private String redirectionBaseUrl;

    public SoapServerConfig getSoapServer() {
        return soapServer;
    }

    public void setSoapServer(SoapServerConfig soapServer) {
        this.soapServer = soapServer;
    }

    public SoapClientConfig getSoapClient() {
        return soapClient;
    }

    public void setSoapClient(SoapClientConfig soapClient) {
        this.soapClient = soapClient;
    }

    public String getRedirectionBaseUrl() {
        return redirectionBaseUrl;
    }

    public void setRedirectionBaseUrl(String redirectionBaseUrl) {
        this.redirectionBaseUrl = redirectionBaseUrl;
    }
}