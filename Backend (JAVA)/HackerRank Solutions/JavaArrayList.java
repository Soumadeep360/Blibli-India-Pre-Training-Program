import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>(numberOfLines);

        for (int i = 0; i < numberOfLines; i++) {

            int listSize = scanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>(listSize);

            for (int j = 0; j < listSize; j++) {

                int num = scanner.nextInt();
                numbers.add(num);
            }

            lines.add(numbers);
        }

        int numberOfQueries = scanner.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {

            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            try {
                System.out.println(lines.get(x).get(y));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
