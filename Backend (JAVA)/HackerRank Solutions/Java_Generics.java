import java.util.*;

public class Solution {
    public static <T> void printArray(T[] array) {
        for (T el : array) {
            System.out.println(el);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}
