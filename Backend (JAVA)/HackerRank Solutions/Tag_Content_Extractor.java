import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numLines = Integer.parseInt(in.nextLine());

        String regex = "<(.+?)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < numLines; i++) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            // If no valid content is found, print "None"
            if (!found) {
                System.out.println("None");
            }
        }

        in.close();
    }
}
