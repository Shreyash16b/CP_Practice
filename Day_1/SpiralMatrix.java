package CP_Practice.Day_1;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a = {{2, 5, 8}, {4, 0, -1}};
        List<Integer> res = spiral(a);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static List<Integer> spiral(int[][] arr) {
        int top = 0, left = 0, right = arr[0].length, bottom = arr.length;
        List<Integer> res = new ArrayList<>();
        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                res.add(arr[top][i]);
            }
            top++;

            for (int i = top; i < bottom; i++) {
                res.add(arr[i][right - 1]);
            }
            right--;

            if (!(left < right && top < bottom)) {
                break;
            }

            for (int i = right - 1; i >= left; i--) {
                res.add(arr[bottom - 1][i]);
            }
            bottom--;

            for (int i = bottom - 1; i >= top; i--) {
                res.add(arr[i][left]);
            }
            left++;

        }
        return res;
    }
}
