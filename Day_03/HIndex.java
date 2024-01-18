package CP_Practice.Day_03;

import java.util.Arrays;

class HIndex {
    public static void main(String[] args) {
        int[] a = { 0, 3, 11, 15 };
        int an = hIndex(a);
        System.out.println(an);
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max = (citations[0] == 0) ? 0 : 1;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <= citations.length - i) {
                max = citations[i];
                // System.out.println(max);
            }
            if (citations[i] > i) {
                max = Math.max(max, Math.min(citations[i], citations.length - i));
                // System.out.println(max);
            }
        }
        return max;
    }
}
