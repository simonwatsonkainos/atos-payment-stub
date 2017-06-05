package uk.gov.hmpo.views;

import io.dropwizard.views.View;

public class PaymentSuccessView extends View {

    public PaymentSuccessView() {
        super("payment-success.mustache");
    }
}
