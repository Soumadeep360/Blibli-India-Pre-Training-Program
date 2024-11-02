import java.io.*;
import java.util.*;
class MyRegex {

    String pattern = "^(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]))$";
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String IP = sc.next();
            MyRegex ob=new MyRegex();
            System.out.println(IP.matches(ob.pattern));
        }
    }
}
