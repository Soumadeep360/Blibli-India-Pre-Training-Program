import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int n = a.length();
        int m = b.length();

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (n != m)
            return false;

        int freq[] = new int[26];
        for (int i = 0; i < n; i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
