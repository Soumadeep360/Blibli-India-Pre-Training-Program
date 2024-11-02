import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        char ch=A.charAt(0);
        ch=Character.toUpperCase(ch);
        char h=B.charAt(0);
        h=Character.toUpperCase(h);
        
        System.out.println(ch+A.substring(1)+" "+h+B.substring(1));;        
    }
}



