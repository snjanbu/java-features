package main.com.learning.modernjava.checkoutapp.factory;

import main.com.learning.modernjava.checkoutapp.enums.CardType;
import main.com.learning.modernjava.checkoutapp.service.CreditCardService;
import main.com.learning.modernjava.checkoutapp.service.DebitCardService;
import main.com.learning.modernjava.checkoutapp.service.PaymentService;
import main.com.learning.modernjava.checkoutapp.service.RewardCardService;

public class PaymentGateway {

    public static PaymentService getPaymentGateway(CardType cardType) {
        return switch (cardType) {
            case CREDIT -> new CreditCardService();
            case DEBIT -> new DebitCardService();
            case REWARDS -> new RewardCardService();
            case null -> throw new IllegalArgumentException("Invalid card type");
        };
    }
}
