import java.util.*;

public class Solution {

 static boolean find(int leap, int[] game, int x) {
        if (x < 0) {
            return false;
        }

        if (x > game.length - 1) {
            return true;
        }

        if (game[x] != 0) {
            return false;
        }

        game[x] = 5;

        if (find(leap, game, x + 1)) {
            return true;
        }
        if (find(leap, game, x + leap)) {
            return true;
        }
        if (find(leap, game, x - 1)) {
            return true;
        }

        game[x] = 0;

        return false;
    }

     static boolean check(int leap, int[] game) {
        return find(leap, game, 0);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            if(check(leap, game)){
                System.out.println("YES");
            }else{
            System.out.println("NO");        
            }
        }
        scan.close();
    }
}
