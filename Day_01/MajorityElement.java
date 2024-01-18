package CP_Practice.Day_01;
class MajorityElement {
    public int majorityElement(int[] nums) {
        int res=0, count=0;
        for(int i : nums){
            if(count == 0){
                res = i;
            }
            if(res == i){
                count++;
            }
            else{
                count--;
            }
        }
        return res;
    }
}
