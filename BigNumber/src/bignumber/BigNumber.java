package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * Raka Mahardika Maulana
 */
public class BigNumber {
    public static void main(String[] args) {
String a;
String b;

//membuat scanner
Scanner input = new Scanner(System.in);
a = input.next();
b = input.next();

        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    
}
}
