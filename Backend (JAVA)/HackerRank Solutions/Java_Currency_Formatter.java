import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // Write your code here.

    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    System.out.println("US: " + us.format(payment));
    System.out.println("India: " + india.format(payment));
    System.out.println("China: " + china.format(payment));
    System.out.println("France: " + france.format(payment));
        
    }
}
