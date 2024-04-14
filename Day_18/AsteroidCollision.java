package CP_Practice.Day_18;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        int[] res;
        Stack<Integer> a = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (a.isEmpty() || asteroids[i] > 0) {
                a.push(asteroids[i]);
            } else {
                while (true) {
                    if (a.peek() < 0) {
                        a.push(asteroids[i]);
                        break;
                    } else if (a.peek() == -asteroids[i]) {
                        a.pop();
                        break;
                    } else if (a.peek() > -asteroids[i]) {
                        break;
                    } else {
                        a.pop();
                        if (a.isEmpty()) {
                            a.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        res = new int[a.size()];
        for (int i = a.size() - 1; i >= 0; i--) {
            res[i] = a.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 10, 2, -5 };
        asteroidCollision(a);
    }
}
