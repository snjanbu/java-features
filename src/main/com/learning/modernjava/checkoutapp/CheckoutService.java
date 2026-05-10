package main.com.learning.modernjava.checkoutapp;

import main.com.learning.modernjava.checkoutapp.enums.PaymentResponse;
import main.com.learning.modernjava.checkoutapp.factory.PaymentGateway;
import main.com.learning.modernjava.checkoutapp.model.OrderDetails;

public class CheckoutService {

    public PaymentResponse checkoutOrder(OrderDetails orderDetails) {

        System.out.println("Processing for " + orderDetails.orderId());
        var paymentGateway = PaymentGateway.getPaymentGateway(orderDetails.card());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.amount());
    }
}
