package uk.gov.hmpo.models.builders;

import uk.gov.hmpo.models.PaymentRecord;

import java.util.Date;

public class PaymentRecordBuilder {

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

    public PaymentRecordBuilder setAutomaticResponseUrl(String automaticResponseUrl) {
        this.automaticResponseUrl = automaticResponseUrl;
        return this;
    }

    public PaymentRecordBuilder setCaptureDay(Short captureDay) {
        this.captureDay = captureDay;
        return this;
    }

    public PaymentRecordBuilder setCaptureMode(String captureMode) {
        this.captureMode = captureMode;
        return this;
    }

    public PaymentRecordBuilder setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public PaymentRecordBuilder setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public PaymentRecordBuilder setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public PaymentRecordBuilder setCustomerLanguage(String customerLanguage) {
        this.customerLanguage = customerLanguage;
        return this;
    }

    public PaymentRecordBuilder setRequestVersion(String requestVersion) {
        this.requestVersion = requestVersion;
        return this;
    }

    public PaymentRecordBuilder setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    public PaymentRecordBuilder setMerchantSessionId(String merchantSessionId) {
        this.merchantSessionId = merchantSessionId;
        return this;
    }

    public PaymentRecordBuilder setMerchantTransactionDateTime(Date merchantTransactionDateTime) {
        this.merchantTransactionDateTime = merchantTransactionDateTime;
        return this;
    }

    public PaymentRecordBuilder setMerchantWalletId(String merchantWalletId) {
        this.merchantWalletId = merchantWalletId;
        return this;
    }

    public PaymentRecordBuilder setNormalReturnUrl(String normalReturnUrl) {
        this.normalReturnUrl = normalReturnUrl;
        return this;
    }

    public PaymentRecordBuilder setOrderAmount(long orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    public PaymentRecordBuilder setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
        return this;
    }

    public PaymentRecordBuilder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public PaymentRecordBuilder setPaymentMeans(String paymentMeans) {
        this.paymentMeans = paymentMeans;
        return this;
    }

    public PaymentRecordBuilder setReturnContext(String returnContext) {
        this.returnContext = returnContext;
        return this;
    }

    public PaymentRecordBuilder setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
        return this;
    }

    public PaymentRecordBuilder setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    public PaymentRecordBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public PaymentRecord create() {
        return new PaymentRecord(automaticResponseUrl, captureDay, captureMode, currencyCode, customerEmail, customerId, customerLanguage, requestVersion, merchantId, merchantSessionId, merchantTransactionDateTime, merchantWalletId, normalReturnUrl, orderAmount, orderChannel, orderId, paymentMeans, returnContext, templateFile, transactionReference, userId);
    }
}