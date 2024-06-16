class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        int n = nums.length;
        if(nums[0]<nums[n-1]){
            c++;
        }
        for(int i=1; i<n;i++){
            if(nums[i-1]>nums[i]){
                c++;
            }
            if(c>1) return false;
        }
        return true;
    }
}