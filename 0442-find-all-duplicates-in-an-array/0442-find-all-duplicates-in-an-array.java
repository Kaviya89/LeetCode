class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList();
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
        for(int j=nums.length-1; j>=0; j--){
            if(nums[j]!=j+1){
               ans.add(nums[j]);
            }
        }
        return ans;
    }
}