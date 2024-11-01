import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            try{
            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");            
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }   
        }
    }   

}
