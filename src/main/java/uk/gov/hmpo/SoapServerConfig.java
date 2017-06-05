package uk.gov.hmpo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class SoapServerConfig {

    @NotEmpty
    @JsonProperty
    private String baseUrl;

    @NotEmpty
    @JsonProperty
    private String paymentInitializePath;

    @NotEmpty
    @JsonProperty
    private boolean additionalSoapServerLogging;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getPaymentInitializePath() {
        return paymentInitializePath;
    }

    public void setPaymentInitializePath(String paymentInitializePath) {
        this.paymentInitializePath = paymentInitializePath;
    }

    public boolean isAdditionalSoapServerLogging() {
        return additionalSoapServerLogging;
    }

    public void setAdditionalSoapServerLogging(boolean additionalSoapServerLogging) {
        this.additionalSoapServerLogging = additionalSoapServerLogging;
    }
}
