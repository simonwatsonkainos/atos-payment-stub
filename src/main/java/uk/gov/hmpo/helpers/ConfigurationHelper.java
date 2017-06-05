package uk.gov.hmpo.helpers;

import uk.gov.hmpo.AtosPaymentStubConfiguration;

public class ConfigurationHelper {

    private static AtosPaymentStubConfiguration configuration;

    public static AtosPaymentStubConfiguration getConfiguration() {
        return configuration;
    }

    public static void setConfiguration(AtosPaymentStubConfiguration configuration) {
        ConfigurationHelper.configuration = configuration;
    }
}
