package com.company;

import java.math.BigInteger;
import java.util.Random;

public class Assignment2 {

    public static void main(String[] args) {
	// write your code here
    }
    private String hexPrime = "b59dd79568817b4b9f6789822d22594f376e6a9abc0241846de426e5dd8f6edd" +
    "ef00b465f38f509b2b18351064704fe75f012fa346c5e2c442d7c99eac79b2bc" +
    "8a202c98327b96816cb8042698ed3734643c4c05164e739cb72fba24f6156b6f" +
    "47a7300ef778c378ea301e1141a6b25d48f1924268c62ee8dd3134745cdf7323";
    private BigInteger prime = new BigInteger(hexPrime, 16);

    private BigInteger generatePrivateKey(){
        // Generate a random object r
        Random r = new Random();
        // Use the constructor from BigInteger to create a randomly generated BigInteger between 0 and 2^n - 1
        // Where n is the number of bits in prime. Use a while to loop until it is less than the original prime.
        // i.e. compareTo returns -1 signifying it is less than prime
        BigInteger randomInt = new BigInteger(prime.bitLength(), r);
        while (randomInt.compareTo(prime) == 1) {
            randomInt = new BigInteger(prime.bitLength(), r);
        }
        return randomInt;
    }
}
