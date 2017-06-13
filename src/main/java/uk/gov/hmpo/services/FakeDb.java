package uk.gov.hmpo.services;

import uk.gov.hmpo.models.PaymentRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FakeDb {

    private static List<PaymentRecord> paymentRecords = new ArrayList<>();

    public static void addPaymentFromInitializationRequest(PaymentRecord record) {
        paymentRecords.add(record);
    }

    public static PaymentRecord getPaymentRecord(String transactionReference) throws Exception {

        PaymentRecord record = searchVerifyAndExtractPaymentRecord(transactionReference);

        if(record.isPaymentProcessed()) {
            // already processed
            throw new Exception(String.format("Record with transaction ID: %s already has a payment processed.", transactionReference));
        }

        return record;
    }

    public static PaymentRecord updatePaymentRecord(String transactionReference, long cardNumberField,
                                           int expiryMonth, int expiryYear, int cvv) throws Exception {

        PaymentRecord record = searchVerifyAndExtractPaymentRecord(transactionReference);
        paymentRecords.remove(record);

        record.setCardNumber(cardNumberField);
        record.setExpiryMonth(expiryMonth);
        record.setExpiryYear(expiryYear);
        record.setSecurityCode(cvv);
        record.setPaymentProcessed(true);
        record.setMerchantTransactionDateTime(new Date());

        paymentRecords.add(record);
        return record;
    }

    /*
     * Function for extracting a payment record from the static list, checks:
     * - if record is present
     * - record is not a duplicate
     * then returns if both of the above criteria pass
     */
    private static PaymentRecord searchVerifyAndExtractPaymentRecord(String transactionReference) throws Exception {

        List<PaymentRecord> searchHits = paymentRecords
                .stream()
                .filter(record -> record.getTransactionReference().equals(transactionReference))
                .collect(Collectors.toList());

        if(searchHits.size() == 0) {
            // not found
            throw new Exception(String.format("Payment record with ID: %s not found.", transactionReference));
        }

        if(searchHits.size() > 1) {
            // error
            throw new Exception(String.format("Payment record ID: %s returned more than one record.", transactionReference));
        }

        return searchHits.get(0);
    }
}
