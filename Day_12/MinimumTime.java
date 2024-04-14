package CP_Practice.Day_12;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumTime {

    public static int findMinimumTime(int[][] tasks) {
        Arrays.sort(tasks, Comparator.comparingInt(a -> a[1]));
        boolean[] timeOn = new boolean[2000];

        for (int[] task : tasks) {
            int start = task[0], end = task[1], duration = task[2];
            for (int i = start; i <= end; i++) {
                if (timeOn[i])
                    duration--;
            }
            for (int i = end; duration > 0; i--) {
                if (!timeOn[i]) {
                    duration--;
                    timeOn[i] = true;
                }
            }
        }
        int res = 0;

        for (int i = 0; i < timeOn.length; i++) {
            if (timeOn[i])
                res++;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 18, 5 }, { 3, 15, 1 }, { 2, 1, 1 } };
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // findMinimumTime(arr);
    }
}
