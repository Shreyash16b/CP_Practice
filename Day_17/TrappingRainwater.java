package CP_Practice.Day_17;

public class TrappingRainwater {
    public static int trap(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;
        int lmax = 0, rmax = 0;
        while (l < r) {
            if (height[l] <= height[r]) {
                if (height[l] >= lmax)
                    lmax = height[l];
                else {
                    res += lmax - height[l];
                }
                l++;
            } else {
                if (height[r] >= rmax)
                    rmax = height[r];
                else {
                    res += rmax - height[r];
                }
                r--;
            }
        }
        // System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        trap(height);
    }
}
