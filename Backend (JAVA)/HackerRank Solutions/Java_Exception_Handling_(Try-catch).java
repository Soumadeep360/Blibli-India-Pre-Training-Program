import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
int a,b;
try{
    a=in.nextInt();
    b=in.nextInt();
    System.out.println(a/b);
}
catch(InputMismatchException e){
    System.out.println("java.util.InputMismatchException");
}
  catch(ArithmeticException e)
{
    System.out.println(e);
}

    }
}
