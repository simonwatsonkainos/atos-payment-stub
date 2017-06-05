package uk.gov.hmpo.views;

import io.dropwizard.views.View;
import uk.gov.hmpo.models.PaymentRecord;

public class PaymentView extends View {

    PaymentRecord paymentRecord;
    String orderDisplayAmount;

    public PaymentView(PaymentRecord paymentRecord) {
        super("payment.mustache");
        this.paymentRecord = paymentRecord;
        this.orderDisplayAmount = createDisplayAmount(paymentRecord.getOrderAmount());
    }

    public PaymentRecord getPaymentRecord() {
        return paymentRecord;
    }

    public String getOrderDisplayAmount() {
        return orderDisplayAmount;
    }

    private String createDisplayAmount(long valueInPence) {
        long pounds = valueInPence / 100;
        long pence = valueInPence % 100;
        return String.format("%s.%s", pounds, pence);
    }
}
