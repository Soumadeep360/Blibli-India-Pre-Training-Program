import java.util.Scanner;

class Add {
    public void add(int... numbers) {
        int sum = 0;
        StringBuilder exp = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            exp.append(numbers[i]);

            if (i < numbers.length - 1) {
                exp.append("+");
            }
        }

        exp.append("=").append(sum);
        System.out.println(exp);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();

        Add obj = new Add();

        obj.add(num1, num2);
        obj.add(num1, num2, num3);
        obj.add(num1, num2, num3, num4, num5);
        obj.add(num1, num2, num3, num4, num5, num6);

    }
}
