import java.io.*; 
import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Object[] instances = new Object[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (name.equals("Student")) {
                instances[i] = new Student();
            } else if (name.equals("Rockstar")) {
                instances[i] = new Rockstar();
            } else if (name.equals("Hacker")) {
                instances[i] = new Hacker();
            }
        }

        int S_count = 0;
        int R_count = 0;
        int H_count = 0;

        for (Object instance : instances) {
            if (instance instanceof Student) {
                S_count++;
            } else if (instance instanceof Rockstar) {
                R_count++;
            } else if (instance instanceof Hacker) {
                H_count++;
            }
        }

        System.out.println(S_count + " " + R_count + " " + H_count);
        sc.close();
    }
}
