import java.io.*;
import java.util.*;

class MyRegex {
    // Pattern that matches a username starting with a letter, 8 to 30 characters in total
    String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        MyRegex ob = new MyRegex();
        
        while (q-- > 0) { 
            String user = sc.next();
            
            if (user.matches(ob.pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        
        sc.close(); // Close the scanner
    }
}
