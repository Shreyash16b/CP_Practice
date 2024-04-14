package CP_Practice.Day_25;

public class Powxn {
    public static void main(String[] args) {
        System.out.println(myPow(34.00515, -3));
    }

    public static double myPow(double x, int n) {
        double res = 1;
        if (x == 0)
            return 0;
        if (n == 1)
            return x;
        if (n == 0)
            return 1;

        res = myPow(x, Math.abs(n) / 2);
        res = (n % 2 == 1) ? res * res * x : res * res;
        return (n < 0) ? 1 / res : res;
    }
}
