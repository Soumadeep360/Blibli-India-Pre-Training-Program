import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String str = scan.nextLine();
        
        scan.close();
        
        try {
 
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            byte[] messageDigest = md.digest(str.getBytes());
 
            BigInteger no = new BigInteger(1, messageDigest);
 
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            
            System.out.println(hashtext);
        }
 
        catch (Exception e) {
            throw new Exception(e);
        }
        
    }
}
