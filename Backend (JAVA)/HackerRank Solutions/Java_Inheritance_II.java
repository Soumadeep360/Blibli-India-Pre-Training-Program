class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Inherits the add method from Arithmetic
}

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + Arithmetic.class.getSimpleName());

        System.out.print(adder.add(42, 0) + " " + adder.add(13, 0) + " " + adder.add(20, 0));
    }
}
