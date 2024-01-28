package CP_Practice.Day_18;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] m = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }; // [1,3,5,7],[10,11,16,20],[23,30,34,60]
        System.out.println(searchMatrix(m, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0, ho = matrix.length - 1;
        while (lo <= ho) {
            int mo = (ho - lo) / 2;
            // System.out.println(mo + " " + lo + " " + ho);
            if (matrix[mo][0] < target) {
                lo = mo + 1;
            } else if (matrix[mo][matrix[0].length - 1] > target) {
                ho = mo - 1;
            } else {
                break;
            }
            // System.out.println(mo + " " + lo + " " + ho);
        }
        // System.out.println(ho + " " + lo);
        // if (!(lo <= ho)) {
        // System.out.println('h');
        // return false;
        // }
        int ro = (ho + lo) / 2;
        // System.out.println(ro);
        int hi = matrix[0].length - 1, li = 0;
        while (li <= hi) {
            int mi = li + (hi - li) / 2;
            // System.out.println(mi + " " + li + " " + hi);
            // System.out.println(matrix[ro][mi]);
            if (matrix[ro][mi] < target) {
                li = mi + 1;
            } else if (matrix[ro][mi] > target) {
                hi = mi - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}