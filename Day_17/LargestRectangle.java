package CP_Practice.Day_17;

import java.util.*;

public class LargestRectangle {
    public static int largestRectangleArea(int[] heights) {
        Stack<List<Integer>> s = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!s.isEmpty() && s.peek().get(1) > heights[i]) {
                int h = s.peek().get(1);
                int in = s.peek().get(0);
                start = in;
                s.pop();
                maxArea = Math.max(maxArea, h * (i - in));
            }
            s.push(Arrays.asList(start, heights[i]));
        }
        System.out.println(s);
        while (!s.isEmpty()) {
            // System.out.println(heights.length - s.peek().get(0) + " " + s.peek().get(1));
            maxArea = Math.max(maxArea, (heights.length - s.peek().get(0)) * s.peek().get(1));
            s.pop();
        }
        System.out.println(maxArea);
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 5, 4, 1, 2 };
        largestRectangleArea(heights);
    }
}
