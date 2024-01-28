package CP_Practice.Day_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarFleet {
    public static void main(String[] args) {
        int[] p = { 10, 8, 0, 5, 3 };
        int[] s = { 2, 4, 1, 1, 3 };
        System.out.println(carFleet(12, p, s));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int res = 0;
        ArrayList<ArrayList<Integer>> c = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            c.add(new ArrayList<>(List.of(position[i], speed[i])));
        }
        Collections.sort(c, Comparator.comparingInt(row -> row.get(0)));
        double curTime = 0;
        Collections.reverse(c);
        System.out.println(c);
        for (int i = 0; i < c.size(); i++) {
            double newTime = (target - (c.get(i).get(0))) / (c.get(i).get(1));
            System.out.println(newTime + " " + curTime);
            if (newTime > curTime) {
                curTime = newTime;
                res++;
            }
        }
        // System.out.println(c);
        return res;
    }
}
