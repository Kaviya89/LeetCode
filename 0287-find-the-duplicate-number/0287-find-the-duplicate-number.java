class Solution {
    public int findDuplicate(int[] nums) {
       int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                if(correct < nums.length){
                 int temp  = nums[i];
                 nums[i] = nums[correct];
                 nums[correct] = temp; 
                }
            }else{
                i++;
            }
        }
        int c = nums[nums.length-1];
        return c;
    }
}