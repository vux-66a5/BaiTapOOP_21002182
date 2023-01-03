package lab11.designpatterns.strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface PayStrategy {
    final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}