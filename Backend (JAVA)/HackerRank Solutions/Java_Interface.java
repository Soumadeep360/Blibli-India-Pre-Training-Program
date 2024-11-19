import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCalculator my_calculator = new MyCalculator();
        System.out.println("I implemented: " + AdvancedArithmetic.class.getSimpleName());
        int sum = my_calculator.divisor_sum(n);
        System.out.println(sum);
    }
}
