import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String str1 = sc.nextLine();
            set.add(str1);
            System.out.println(set.size());
        }

    }
}
