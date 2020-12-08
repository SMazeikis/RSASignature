package com.company;

import java.math.BigInteger;
import java.math.*;
import java.io.*;
import javax.crypto.*;
import java.util.*;
import java.security.*;


public class Assignment2 {

    public static void main(String[] args) {
	// write your code here
    }

//    Generate two distinct 512-bit probable primes p and q, Miller-Rabin and Lucas-Lehmer algorithms to test primality.
//    https://www.tutorialspoint.com/java/math/biginteger_probableprime.htm
    BigInteger p = BigInteger.probablePrime(512, new Random());
    BigInteger q = BigInteger.probablePrime(512, new Random());

//    Calculate the product of these two primes n = pq

    BigInteger n = p.multiply(q);

//    Calculate the Euler totient function phi(n)

//    You will be using an encryption exponent e = 65537
    BigInteger e = new BigInteger("65537");
//, so you will need to ensure that this is relatively prime to phi(n). If it is not, go back to step 1 and generate new values for p and q

//    Compute the value for the decryption exponent d, which is the multiplicative inverse of e (mod phi(n)).
//    This should use your own implementation of the extended Euclidean GCD algorithm to calculate the inverse rather than using a library method for this purpose.


}
