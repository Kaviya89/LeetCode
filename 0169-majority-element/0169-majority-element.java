class Solution {
    public int majorityElement(int[] nums) {
        int c = 1;
        int f = nums[0];
        if(nums.length==1) return nums[0];
        for(int i=1;i<nums.length;i++){
            if(f == nums[i]){
                c++;
            }
            else{
                c--;
            }
            if(c==0){
                f = nums[i+1];
            }
        }
        return f;
    }
}