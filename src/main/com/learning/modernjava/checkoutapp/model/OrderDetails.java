package main.com.learning.modernjava.checkoutapp.model;


import main.com.learning.modernjava.checkoutapp.enums.CardType;

public record OrderDetails(String orderId, CardType card, double amount) {
}
