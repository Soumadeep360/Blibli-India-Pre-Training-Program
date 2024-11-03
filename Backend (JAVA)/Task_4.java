/*
Write code that throws a custom exception if the given number has more than one digit. 
Catch the exception and print an appropriate message.
*/

//Solution:

import java.util.*;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class NumberCheck {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number =sc.nextInt();
        try {
            checkSingleDigit(number);
        } catch (InvalidNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkSingleDigit(int number) throws InvalidNumberException {
        if (number < -9 || number > 9) {
            throw new InvalidNumberException("The number has more than one digit.");
        }
        System.out.println("The number is a single-digit number.");
    }
}
