import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s=new String[n+2];
    for(int i=0;i<n;i++){
        s[i]=sc.next();
    }
    sc.close();

    Arrays.sort(s, 0, n, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        BigDecimal Biga = new BigDecimal(a);
        BigDecimal Bigb = new BigDecimal(b);
        return Bigb.compareTo(Biga);
    }
});

    for(int i=0;i<n;i++)
    {
        System.out.println(s[i]);
    }
    }
}
