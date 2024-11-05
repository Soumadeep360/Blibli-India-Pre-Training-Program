import java.io.*;
import java.util.*;
import java.security.*;
import java.nio.charset.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(
                originalString.getBytes(StandardCharsets.UTF_8));
            System.out.println(bytesToHex(encodedhash));
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
