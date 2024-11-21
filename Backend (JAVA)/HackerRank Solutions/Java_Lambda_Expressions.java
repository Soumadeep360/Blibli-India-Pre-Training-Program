import java.io.*;
import java.util.*;
import java.math.BigInteger;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return number -> number % 2 != 0;
    }

    public PerformOperation isPrime() {
        return number -> BigInteger.valueOf(number).isProbablePrime(1);
    }

    public PerformOperation isPalindrome() {
        return number -> {
            String possiblePalindrome = String.valueOf(number);
            int j = possiblePalindrome.length() - 1;
            for (int i = 0; i < possiblePalindrome.length() / 2; i++) {
                if (possiblePalindrome.charAt(i) != possiblePalindrome.charAt(j)) {
                    return false;
                }
                j--;
            }
            return true;
        };
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
