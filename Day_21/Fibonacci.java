package CP_Practice.Day_21;

public class Fibonacci {
    public static int fib(int n) {
        int[] fib = new int[n];
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
