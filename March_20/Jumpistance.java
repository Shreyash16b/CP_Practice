package CP_Practice.March_20;

public class Jumpistance {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1;

        for(int i=nums.length - 1; i>=0; i--){
            if(nums[i] + i >= n){
                n = i;
            }
        }
        return (n==0);
    }
}
