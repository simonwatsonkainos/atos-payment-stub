package uk.gov.hmpo.services;

import sips.en.contract.dvla.*;

import uk.gov.hmpo.helpers.ConfigurationHelper;
import uk.gov.hmpo.models.PaymentRecord;
import uk.gov.hmpo.models.builders.NotificationTransactionDTOBuilder;

import javax.xml.ws.BindingProvider;

import static uk.gov.hmpo.helpers.Constants.*;

public class AutomaticResponseService {

    private Notification port;

    public AutomaticResponseService() {
        port = new NotificationService().getNotificationImplPort();
        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ConfigurationHelper.getConfiguration().getSoapClient().getBaseUrl());
    }

    public NotificationTransactionResponse sendAutomaticResponse(PaymentRecord record) {

        NotificationTransactionDTO notificationTransactionDTO = new NotificationTransactionDTOBuilder()
            .setConfirmationVersion(ATOS_CONFIRMATION_VERSION)
            .setAcquirerResponseCode(ATOS_ACQUIRER_RESPONSE_CODE)
            .setAcquirerResponseDescription(ATOS_ACQUIRER_RESPONSE_DESCRIPTION)
            .setResponseDescription(ATOS_RESPONSE_DESCRIPTION)
            .setAmount(record.getOrderAmount())
            .setAuthorisationId(ATOS_AUTHORISATION_ID)
            .setCaptureDay(ATOS_CAPTURE_DAY)
            .setCaptureMode(record.getCaptureMode())
            .setCardCreditDebitIndicator(ATOS_CREDIT_DEBIT_INDICATOR)
            .setCardCSCResultCode(ATOS_CARD_CSC_RESULT_CODE)
            .setCardExpiryDate(String.format("%s/%s", record.getExpiryMonth(), record.getExpiryYear()))
            .setCardScheme(ATOS_CARD_SCHEME)
            .setCardSeqNumber(ATOS_CARD_SEQ_NUMBER)
            .setChargeAmount(record.getOrderAmount())
            .setComplementaryCode(ATOS_COMPLEMENTARY_CODE)
            .setComplementaryInfo(ATOS_COMPLEMENTARY_INFO)
            .setCurrencyCode(record.getCurrencyCode())
            .setCustomerEmail(record.getCustomerEmail())
            .setCustomerId(record.getCustomerId())
            .setCustomerIpAddress(ATOS_CUSTOMER_IP_ADDRESS)
            .setMaskedPan(ATOS_MASKED_PAN)
            .setMerchantId(record.getMerchantId())
            .setMerchantSessionId(ATOS_MERCHANT_SESSION_ID)
            .setMerchantTransactionDateTime(record.getMerchantTransactionDateTime())
            .setMerchantWalletId(record.getMerchantId())
            .setOrderAmount(record.getOrderAmount())
            .setOrderChannel(record.getOrderChannel())
            .setOrderId(record.getOrderId())
            .setResponseCode(ATOS_RESPONSE_CODE)
            .setResponseDescription(ATOS_DESCRIPTION)
            .setReturnContext(record.getReturnContext())
            .setThreeDLiabilityShift(ATOS_THREE_D_LIABILITY_SHIFT)
            .setThreeDRelegationCode(ATOS_THREE_D_RELEGATION_CODE)
            .setThreeDStatusCode(ATOS_THREE_D_STATUS_CODE)
            .setTransactionDateTime(record.getMerchantTransactionDateTime())
            .setTransactionReference(record.getTransactionReference())
            .setUserId(record.getUserId())
            .createNotificationTransactionDTO();

        NotificationTransactionRequest notificationTransactionRequest = new NotificationTransactionRequest();
        notificationTransactionRequest.setNotification(notificationTransactionDTO);

        return port.notifyTransaction(notificationTransactionRequest);
    }
}
