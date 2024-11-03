import java.util.*;
class Solution{
        private static String open = "{[(";
        private static String close = "}])";
     static boolean isValid(String str)
    {
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            if (open.indexOf(c) == -1 && close.indexOf(c) == -1)
                {return false;}
            else if (open.indexOf(c) != -1) {st.push(c);}
            else
                {char opposite = open.charAt(close.indexOf(c));
                if (st.isEmpty() || st.pop() != opposite) return false;
                }
            }
        return st.isEmpty();   
    }
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s=sc.next();
            System.out.println(isValid(s));
        }
        
    }
}
