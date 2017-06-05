package uk.gov.hmpo.models.builders;

import sips.cn.contract.Response2;

public class Response2Builder {
    private String redirectionData;
    private String redirectionStatusCode;
    private String redirectionStatusMessage;
    private String redirectionUrl;
    private String redirectionVersion;

    public Response2Builder setRedirectionData(String redirectionData) {
        this.redirectionData = redirectionData;
        return this;
    }

    public Response2Builder setRedirectionStatusCode(String redirectionStatusCode) {
        this.redirectionStatusCode = redirectionStatusCode;
        return this;
    }

    public Response2Builder setRedirectionStatusMessage(String redirectionStatusMessage) {
        this.redirectionStatusMessage = redirectionStatusMessage;
        return this;
    }

    public Response2Builder setRedirectionUrl(String redirectionUrl) {
        this.redirectionUrl = redirectionUrl;
        return this;
    }

    public Response2Builder setRedirectionVersion(String redirectionVersion) {
        this.redirectionVersion = redirectionVersion;
        return this;
    }

    public Response2 create() {
        return new Response2(redirectionData, redirectionStatusCode, redirectionStatusMessage, redirectionUrl, redirectionVersion);
    }
}