package main.com.learning.modernjava.checkoutapp.service;

import main.com.learning.modernjava.checkoutapp.enums.CardType;
import main.com.learning.modernjava.checkoutapp.enums.PaymentResponse;

public final class CreditCardService implements PaymentService {

    @Override
    public PaymentResponse makePayment(CardType card, double amount) {
        System.out.println("Accepted " + amount + " from " + card);
        return PaymentResponse.SUCCESS;
    }
}
