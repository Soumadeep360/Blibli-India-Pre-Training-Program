/*
Create a class named Bank and other classes such as ICICI and HDFC. 
The Bank class should have default transaction charges, which will serve as the base. 
Based on these default charges, the ICICI and HDFC classes will calculate their specific transaction charges. 
Ensure that proper access specifiers are used throughout the code.
*/

//Solution:

class Bank {
    protected double transactionCharges = 100.0;

    public double getTransactionCharges() {
        return transactionCharges;
    }
}

class ICICI extends Bank {
    private double additionalCharge = 20.0;

    public double getTransactionCharges() {
        return transactionCharges + additionalCharge;
    }
}

class HDFC extends Bank {
    private double additionalCharge = 35.0;

    public double getTransactionCharges() {
        return transactionCharges + additionalCharge;
    }
}

public class Solution {
    public static void main(String[] args) {
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();

        System.out.println("ICICI Transaction Charges: " + icici.getTransactionCharges());
        System.out.println("HDFC Transaction Charges: " + hdfc.getTransactionCharges());
    }
}
