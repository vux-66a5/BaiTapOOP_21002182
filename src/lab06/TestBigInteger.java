package lab06;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(i1.add(i2));

    }
}
