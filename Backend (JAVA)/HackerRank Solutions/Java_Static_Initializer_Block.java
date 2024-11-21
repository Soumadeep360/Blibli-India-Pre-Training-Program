import java.io.*;
import java.util.*;

public class Solution {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);

        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        if (flag) {
            System.out.println(H * B);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
