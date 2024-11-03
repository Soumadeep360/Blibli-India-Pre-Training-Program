import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
    int l = scan.nextInt();   

    List<Integer> list = new ArrayList<>(l);
    for(int i = 0; i<l; i++){
        list.add(scan.nextInt());
    }

    int q = scan.nextInt();

    for(int i= 0; i<q; i++){
        String b = scan.next();
        if("Insert".equals(b)){
            int x = scan.nextInt();
            int y = scan.nextInt();  
            list.add(x, y);
        }
        if("Delete".equals(b)){
            int x = scan.nextInt();
            list.remove(x);
        }
    }
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    }
}
