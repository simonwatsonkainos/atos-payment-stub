/* package uk.gov.hmpo.jaxws.client;

import uk.gov.hmpo.helpers.ConfigurationHelper;
import uk.gov.hmpo.jaxws.services.IThingService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ThingClient {

    private static ThingClient instance;
    private static IThingService thingService;

    private ThingClient (){}

    private void initialise () {
        try {
            URL url = new URL(ConfigurationHelper.getConfiguration().getSoapClient().getBaseUrl());
            QName qname = new QName("http://services.jaxws.example.kainos.com/", "ThingServiceService");
            Service service = Service.create(url, qname);
            thingService = service.getPort(IThingService.class);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
            System.out.println("Failed to initialise ThingClient");
        }
    }

    public static ThingClient getInstance () {
        if (instance == null) {
            instance = new ThingClient();
            instance.initialise();
        }
        return instance;
    }

    public String getThing(int id) {
        return thingService.getThing(id);
    }

    public void addThing(String description) {
        thingService.addThing(description);
    }
} */
