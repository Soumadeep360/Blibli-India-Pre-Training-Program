import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Inner inner = new Inner();
        Inner.Private innerPrivate = inner.new Private();

        System.out.println(innerPrivate.powerof2(num));
        System.out.println("An instance of class: " + innerPrivate.getClass().getCanonicalName() + " has been created");
    }

    public static class Inner {
        private class Private {
            public String powerof2(int num) {
                return ((num > 0) && (num & (num - 1)) == 0) ? num + " is power of 2" : num + " is not a power of 2";
            }
        }
    }
}
