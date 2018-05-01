package algorithm;

public class Fibonacci {

    private Fibonacci() {
    }

    public static int[] generateFibonacci(int length) {
        int a = 1, b = 1;
        int[] fib = new int[length];

        if (length > 2) {
            add(a, b);
        }


        return null;
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
