package sips.cn.contract;

import uk.gov.hmpo.helpers.ConfigurationHelper;
import uk.gov.hmpo.models.PaymentRecord;

import uk.gov.hmpo.models.builders.PaymentRecordBuilder;
import uk.gov.hmpo.models.builders.Response2Builder;
import uk.gov.hmpo.services.FakeDb;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.UUID;

import static uk.gov.hmpo.helpers.Constants.*;

@WebService(endpointInterface = "sips.cn.contract.PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @Override
    public sips.cn.contract.PaymentWebInitOutput processPaymentWebInitInput(
            @WebParam(name = "input", targetNamespace = "urn:sips:cn:contract")
            sips.cn.contract.PaymentWebInitInput input
    ) {
        PaymentRecord record = generatePaymentRecordFromRequest(input.getRequest());

        String redirectionData = UUID.randomUUID().toString();
        String redirectionUrl = ConfigurationHelper.getConfiguration().getRedirectionBaseUrl() + record.getTransactionReference();

        record.setRedirectionData(redirectionData);
        record.setRedirectionStatusCode(ATOS_REDIRECTION_SUCCESS_STATUS_CODE);
        record.setRedirectionStatusMessage(ATOS_STATUS_MESSAGE);
        record.setRedirectionUrl(redirectionUrl);
        record.setRedirectionVersion(ATOS_REDIRECT_VERSION);

        FakeDb.addPaymentFromInitializationRequest(record);

        return new PaymentWebInitOutput(generateSuccessResponse(record));
    }

    public sips.cn.contract.WalletManagementInitOutput processWalletManagementInit(
            @WebParam(name = "input", targetNamespace = "urn:sips:cn:contract")
            sips.cn.contract.WalletManagementInitInput input
    ) {
        throw new RuntimeException("Not yet implemented");
    }

    private PaymentRecord generatePaymentRecordFromRequest(Request2 initializePaymentRequest) {
        return new PaymentRecordBuilder()
                .setAutomaticResponseUrl(initializePaymentRequest.getAutomaticResponseUrl())
                .setCaptureDay(initializePaymentRequest.getCaptureDay())
                .setCaptureMode(initializePaymentRequest.getCaptureMode())
                .setCurrencyCode(initializePaymentRequest.getCurrencyCode())
                .setCustomerEmail(initializePaymentRequest.getCustomerEmail())
                .setCustomerId(initializePaymentRequest.getCustomerId())
                .setCustomerLanguage(initializePaymentRequest.getCustomerLanguage())
                .setRequestVersion(initializePaymentRequest.getRequestVersion())
                .setMerchantId(initializePaymentRequest.getMerchantId())
                .setMerchantSessionId(initializePaymentRequest.getMerchantSessionId())
                .setMerchantTransactionDateTime(initializePaymentRequest.getMerchantTransactionDateTime())
                .setMerchantWalletId(initializePaymentRequest.getMerchantWalletId())
                .setNormalReturnUrl(initializePaymentRequest.getNormalReturnUrl())
                .setOrderAmount(initializePaymentRequest.getOrderAmount())
                .setOrderChannel(initializePaymentRequest.getOrderChannel())
                .setOrderId(initializePaymentRequest.getOrderId())
                .setPaymentMeans(initializePaymentRequest.getPaymentMeans())
                .setReturnContext(initializePaymentRequest.getReturnContext())
                .setTemplateFile(initializePaymentRequest.getTemplateFile())
                .setTransactionReference(initializePaymentRequest.getTransactionReference())
                .setUserId(initializePaymentRequest.getUserId())
                .create();
    }

    private Response2 generateSuccessResponse(PaymentRecord record) {
        return new Response2Builder()
                .setRedirectionVersion(record.getRedirectionVersion())
                .setRedirectionStatusMessage(record.getRedirectionStatusMessage())
                .setRedirectionUrl(record.getRedirectionUrl())
                .setRedirectionData(record.getRedirectionData())
                .setRedirectionStatusCode(record.getRedirectionStatusCode())
                .create();
    }
}
