package CP_Practice.Day_03;

import java.util.*;

public class SmallerElements {

    int[] count;

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        count = new int[nums.length];
        int[] ind = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ind[i] = i;
        }

        mergesort(nums, ind, 0, nums.length - 1);
        for(int i:count){
            res.add(i);
        }
        return res;
    }

    public void mergesort(int[] nums, int[] ind, int start, int end) {

        if (end <= start) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergesort(nums, ind, start, mid);
        mergesort(nums, ind, mid + 1, end);

        merge(nums, ind, start, end);
    }

    public void merge(int[] nums, int[] ind, int s, int e) {

        int mid = s + (e - s) / 2;
        int l = s;
        int r = mid + 1;
        int c = 0;

        int[] newArr = new int[e - s + 1];
        int arrIndex = 0;

        while (l <= mid && r <= e) {
            if (nums[ind[r]] < nums[ind[l]]) {
                newArr[arrIndex] = ind[r];
                r++;
                c++;
            } else {
                newArr[arrIndex] = ind[l];
                count[ind[l]] += c;
                l++;
            }
            arrIndex++;
        }

        while (l <= mid) {
            newArr[arrIndex] = ind[l];
            count[ind[l]] += c;
            l++;
            arrIndex++;
        }
        while (r <= e) {
            newArr[arrIndex] = ind[r];
            arrIndex++;
            r++;
        }

        for(int i = s; i <= e; i++){
            ind[i] = newArr[i - s];
        }

    }

}
