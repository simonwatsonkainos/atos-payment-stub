package uk.gov.hmpo.models.builders;

import sips.en.contract.dvla.NotificationTransactionDTO;

import java.util.Date;

public class NotificationTransactionDTOBuilder {
    private String confirmationVersion;
    private String acquirerResponseCode;
    private String acquirerResponseDescription;
    private Long amount;
    private String authorisationId;
    private short captureDay;
    private String captureMode;
    private String cardCreditDebitIndicator;
    private String cardCSCResultCode;
    private String cardExpiryDate;
    private String cardScheme;
    private String cardSeqNumber;
    private Long chargeAmount;
    private String complementaryCode;
    private String complementaryInfo;
    private String currencyCode;
    private String customerEmail;
    private String customerId;
    private String customerIpAddress;
    private String maskedPan;
    private String merchantId;
    private String merchantSessionId;
    private Date merchantTransactionDateTime;
    private String merchantWalletId;
    private long orderAmount;
    private String orderChannel;
    private String orderId;
    private String responseCode;
    private String responseDescription;
    private String returnContext;
    private String threeDLiabilityShift;
    private String threeDRelegationCode;
    private String threeDStatusCode;
    private Date transactionDateTime;
    private String transactionReference;
    private String userId;

    public NotificationTransactionDTOBuilder setConfirmationVersion(String confirmationVersion) {
        this.confirmationVersion = confirmationVersion;
        return this;
    }

    public NotificationTransactionDTOBuilder setAcquirerResponseCode(String acquirerResponseCode) {
        this.acquirerResponseCode = acquirerResponseCode;
        return this;
    }

    public NotificationTransactionDTOBuilder setAcquirerResponseDescription(String acquirerResponseDescription) {
        this.acquirerResponseDescription = acquirerResponseDescription;
        return this;
    }

    public NotificationTransactionDTOBuilder setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public NotificationTransactionDTOBuilder setAuthorisationId(String authorisationId) {
        this.authorisationId = authorisationId;
        return this;
    }

    public NotificationTransactionDTOBuilder setCaptureDay(short captureDay) {
        this.captureDay = captureDay;
        return this;
    }

    public NotificationTransactionDTOBuilder setCaptureMode(String captureMode) {
        this.captureMode = captureMode;
        return this;
    }

    public NotificationTransactionDTOBuilder setCardCreditDebitIndicator(String cardCreditDebitIndicator) {
        this.cardCreditDebitIndicator = cardCreditDebitIndicator;
        return this;
    }

    public NotificationTransactionDTOBuilder setCardCSCResultCode(String cardCSCResultCode) {
        this.cardCSCResultCode = cardCSCResultCode;
        return this;
    }

    public NotificationTransactionDTOBuilder setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
        return this;
    }

    public NotificationTransactionDTOBuilder setCardScheme(String cardScheme) {
        this.cardScheme = cardScheme;
        return this;
    }

    public NotificationTransactionDTOBuilder setCardSeqNumber(String cardSeqNumber) {
        this.cardSeqNumber = cardSeqNumber;
        return this;
    }

    public NotificationTransactionDTOBuilder setChargeAmount(Long chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    public NotificationTransactionDTOBuilder setComplementaryCode(String complementaryCode) {
        this.complementaryCode = complementaryCode;
        return this;
    }

    public NotificationTransactionDTOBuilder setComplementaryInfo(String complementaryInfo) {
        this.complementaryInfo = complementaryInfo;
        return this;
    }

    public NotificationTransactionDTOBuilder setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public NotificationTransactionDTOBuilder setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public NotificationTransactionDTOBuilder setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public NotificationTransactionDTOBuilder setCustomerIpAddress(String customerIpAddress) {
        this.customerIpAddress = customerIpAddress;
        return this;
    }

    public NotificationTransactionDTOBuilder setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
        return this;
    }

    public NotificationTransactionDTOBuilder setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    public NotificationTransactionDTOBuilder setMerchantSessionId(String merchantSessionId) {
        this.merchantSessionId = merchantSessionId;
        return this;
    }

    public NotificationTransactionDTOBuilder setMerchantTransactionDateTime(Date merchantTransactionDateTime) {
        this.merchantTransactionDateTime = merchantTransactionDateTime;
        return this;
    }

    public NotificationTransactionDTOBuilder setMerchantWalletId(String merchantWalletId) {
        this.merchantWalletId = merchantWalletId;
        return this;
    }

    public NotificationTransactionDTOBuilder setOrderAmount(long orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    public NotificationTransactionDTOBuilder setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
        return this;
    }

    public NotificationTransactionDTOBuilder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public NotificationTransactionDTOBuilder setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public NotificationTransactionDTOBuilder setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }

    public NotificationTransactionDTOBuilder setReturnContext(String returnContext) {
        this.returnContext = returnContext;
        return this;
    }

    public NotificationTransactionDTOBuilder setThreeDLiabilityShift(String threeDLiabilityShift) {
        this.threeDLiabilityShift = threeDLiabilityShift;
        return this;
    }

    public NotificationTransactionDTOBuilder setThreeDRelegationCode(String threeDRelegationCode) {
        this.threeDRelegationCode = threeDRelegationCode;
        return this;
    }

    public NotificationTransactionDTOBuilder setThreeDStatusCode(String threeDStatusCode) {
        this.threeDStatusCode = threeDStatusCode;
        return this;
    }

    public NotificationTransactionDTOBuilder setTransactionDateTime(Date transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
        return this;
    }

    public NotificationTransactionDTOBuilder setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    public NotificationTransactionDTOBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public NotificationTransactionDTO createNotificationTransactionDTO() {
        return new NotificationTransactionDTO(confirmationVersion, acquirerResponseCode, acquirerResponseDescription, amount, authorisationId, captureDay, captureMode, cardCreditDebitIndicator, cardCSCResultCode, cardExpiryDate, cardScheme, cardSeqNumber, chargeAmount, complementaryCode, complementaryInfo, currencyCode, customerEmail, customerId, customerIpAddress, maskedPan, merchantId, merchantSessionId, merchantTransactionDateTime, merchantWalletId, orderAmount, orderChannel, orderId, responseCode, responseDescription, returnContext, threeDLiabilityShift, threeDRelegationCode, threeDStatusCode, transactionDateTime, transactionReference, userId);
    }
}