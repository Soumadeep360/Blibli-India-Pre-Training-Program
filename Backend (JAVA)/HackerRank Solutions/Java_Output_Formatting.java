import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            s1 = s1 + " ".repeat(15 - s1.length());
            System.out.print(s1);
            if (x < 100)
                System.out.print(0);
            if (x < 10)
                System.out.print(0);
            System.out.print(x);
            System.out.println();

        }
        System.out.println("================================");

    }
}
