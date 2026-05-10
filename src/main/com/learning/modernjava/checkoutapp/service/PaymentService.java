package main.com.learning.modernjava.checkoutapp.service;

import main.com.learning.modernjava.checkoutapp.enums.CardType;
import main.com.learning.modernjava.checkoutapp.enums.PaymentResponse;

public sealed interface PaymentService permits CreditCardService, DebitCardService, RewardCardService {

    PaymentResponse makePayment(CardType card, double amount);
}
