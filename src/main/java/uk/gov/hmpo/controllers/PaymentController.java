package uk.gov.hmpo.controllers;

import uk.gov.hmpo.models.PaymentRecord;
import uk.gov.hmpo.services.AutomaticResponseService;
import uk.gov.hmpo.services.FakeDb;
import uk.gov.hmpo.views.PaymentSuccessView;
import uk.gov.hmpo.views.PaymentView;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/payment")
public class PaymentController {

    private AutomaticResponseService automaticResponseService;

    public PaymentController() {
        automaticResponseService = new AutomaticResponseService();
    }

    @GET
    @Path("/{transactionReference}")
    @Produces({MediaType.TEXT_HTML})
    public PaymentView getPayment(@PathParam("transactionReference") String transactionReference) throws Exception {
        return new PaymentView(FakeDb.getPaymentRecord(transactionReference));
    }

    @GET
    @Path("/success")
    @Produces({MediaType.TEXT_HTML})
    public PaymentSuccessView paymentSuccess() throws Exception {
        return new PaymentSuccessView();
    }

    @POST
    @Path("/submit-payment/{transactionReference}")
    public Response submitPayment(
            @PathParam("transactionReference") String transactionReference,
            @FormParam("cardNumberField") long cardNumberField,
            @FormParam("expirydatefield-month") int expiryMonth,
            @FormParam("expirydatefield-year") int expiryYear,
            @FormParam("cvvfield") int cvv
    ) throws Exception {
        PaymentRecord record = FakeDb.updatePaymentRecord(transactionReference, cardNumberField, expiryMonth, expiryYear, cvv);
        automaticResponseService.sendAutomaticResponse(record);
        return Response.seeOther(new URI("/payment/success")).build();
    }
}
