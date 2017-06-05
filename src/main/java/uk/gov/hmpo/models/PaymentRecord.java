package uk.gov.hmpo.models;

import java.util.Date;

public class PaymentRecord {

    // Payment initialization request properties
    private String automaticResponseUrl;
    private Short captureDay;
    private String captureMode;
    private String currencyCode;
    private String customerEmail;
    private String customerId;
    private String customerLanguage;
    private String requestVersion;
    private String merchantId;
    private String merchantSessionId;
    private Date merchantTransactionDateTime;
    private String merchantWalletId;
    private String normalReturnUrl;
    private long orderAmount;
    private String orderChannel;
    private String orderId;
    private String paymentMeans;
    private String returnContext;
    private String templateFile;
    private String transactionReference;
    private String userId;

    // Mock Service generated properties
    private String redirectionData;
    private String redirectionStatusCode;
    private String redirectionStatusMessage;
    private String redirectionUrl;
    private String redirectionVersion;

    // User defined payment properties
    private long cardNumber;
    private int expiryMonth;
    private int expiryYear;
    private int securityCode;

    // Internal service tracking properties
    private boolean paymentProcessed = false;

    public PaymentRecord(String automaticResponseUrl, Short captureDay, String captureMode, String currencyCode, String customerEmail, String customerId, String customerLanguage, String requestVersion, String merchantId, String merchantSessionId, Date merchantTransactionDateTime, String merchantWalletId, String normalReturnUrl, long orderAmount, String orderChannel, String orderId, String paymentMeans, String returnContext, String templateFile, String transactionReference, String userId) {
        this.automaticResponseUrl = automaticResponseUrl;
        this.captureDay = captureDay;
        this.captureMode = captureMode;
        this.currencyCode = currencyCode;
        this.customerEmail = customerEmail;
        this.customerId = customerId;
        this.customerLanguage = customerLanguage;
        this.requestVersion = requestVersion;
        this.merchantId = merchantId;
        this.merchantSessionId = merchantSessionId;
        this.merchantTransactionDateTime = merchantTransactionDateTime;
        this.merchantWalletId = merchantWalletId;
        this.normalReturnUrl = normalReturnUrl;
        this.orderAmount = orderAmount;
        this.orderChannel = orderChannel;
        this.orderId = orderId;
        this.paymentMeans = paymentMeans;
        this.returnContext = returnContext;
        this.templateFile = templateFile;
        this.transactionReference = transactionReference;
        this.userId = userId;
    }

    public String getAutomaticResponseUrl() {
        return automaticResponseUrl;
    }

    public void setAutomaticResponseUrl(String automaticResponseUrl) {
        this.automaticResponseUrl = automaticResponseUrl;
    }

    public Short getCaptureDay() {
        return captureDay;
    }

    public void setCaptureDay(Short captureDay) {
        this.captureDay = captureDay;
    }

    public String getCaptureMode() {
        return captureMode;
    }

    public void setCaptureMode(String captureMode) {
        this.captureMode = captureMode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerLanguage() {
        return customerLanguage;
    }

    public void setCustomerLanguage(String customerLanguage) {
        this.customerLanguage = customerLanguage;
    }

    public String getRequestVersion() {
        return requestVersion;
    }

    public void setRequestVersion(String requestVersion) {
        this.requestVersion = requestVersion;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantSessionId() {
        return merchantSessionId;
    }

    public void setMerchantSessionId(String merchantSessionId) {
        this.merchantSessionId = merchantSessionId;
    }

    public Date getMerchantTransactionDateTime() {
        return merchantTransactionDateTime;
    }

    public void setMerchantTransactionDateTime(Date merchantTransactionDateTime) {
        this.merchantTransactionDateTime = merchantTransactionDateTime;
    }

    public String getMerchantWalletId() {
        return merchantWalletId;
    }

    public void setMerchantWalletId(String merchantWalletId) {
        this.merchantWalletId = merchantWalletId;
    }

    public String getNormalReturnUrl() {
        return normalReturnUrl;
    }

    public void setNormalReturnUrl(String normalReturnUrl) {
        this.normalReturnUrl = normalReturnUrl;
    }

    public long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentMeans() {
        return paymentMeans;
    }

    public void setPaymentMeans(String paymentMeans) {
        this.paymentMeans = paymentMeans;
    }

    public String getReturnContext() {
        return returnContext;
    }

    public void setReturnContext(String returnContext) {
        this.returnContext = returnContext;
    }

    public String getTemplateFile() {
        return templateFile;
    }

    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRedirectionData() {
        return redirectionData;
    }

    public void setRedirectionData(String redirectionData) {
        this.redirectionData = redirectionData;
    }

    public String getRedirectionStatusCode() {
        return redirectionStatusCode;
    }

    public void setRedirectionStatusCode(String redirectionStatusCode) {
        this.redirectionStatusCode = redirectionStatusCode;
    }

    public String getRedirectionStatusMessage() {
        return redirectionStatusMessage;
    }

    public void setRedirectionStatusMessage(String redirectionStatusMessage) {
        this.redirectionStatusMessage = redirectionStatusMessage;
    }

    public String getRedirectionUrl() {
        return redirectionUrl;
    }

    public void setRedirectionUrl(String redirectionUrl) {
        this.redirectionUrl = redirectionUrl;
    }

    public String getRedirectionVersion() {
        return redirectionVersion;
    }

    public void setRedirectionVersion(String redirectionVersion) {
        this.redirectionVersion = redirectionVersion;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public boolean isPaymentProcessed() {
        return paymentProcessed;
    }

    public void setPaymentProcessed(boolean paymentProcessed) {
        this.paymentProcessed = paymentProcessed;
    }

    @Override
    public String toString() {
        return "PaymentRecord{" +
                "automaticResponseUrl='" + automaticResponseUrl + '\'' +
                ", captureDay=" + captureDay +
                ", captureMode='" + captureMode + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerLanguage='" + customerLanguage + '\'' +
                ", requestVersion='" + requestVersion + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", merchantSessionId='" + merchantSessionId + '\'' +
                ", merchantTransactionDateTime=" + merchantTransactionDateTime +
                ", merchantWalletId='" + merchantWalletId + '\'' +
                ", normalReturnUrl='" + normalReturnUrl + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderChannel='" + orderChannel + '\'' +
                ", orderId='" + orderId + '\'' +
                ", paymentMeans='" + paymentMeans + '\'' +
                ", returnContext='" + returnContext + '\'' +
                ", templateFile='" + templateFile + '\'' +
                ", transactionReference='" + transactionReference + '\'' +
                ", userId='" + userId + '\'' +
                ", redirectionData='" + redirectionData + '\'' +
                ", redirectionStatusCode='" + redirectionStatusCode + '\'' +
                ", redirectionStatusMessage='" + redirectionStatusMessage + '\'' +
                ", redirectionUrl='" + redirectionUrl + '\'' +
                ", redirectionVersion='" + redirectionVersion + '\'' +
                ", cardNumber=" + cardNumber +
                ", expiryMonth=" + expiryMonth +
                ", expiryYear=" + expiryYear +
                ", securityCode=" + securityCode +
                ", paymentProcessed=" + paymentProcessed +
                '}';
    }
}
