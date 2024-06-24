class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> ans = new ArrayList();
        int i = 0;
        int k = nums[0];
        int b = nums[0];
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
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
               k = nums[j];
               b = j+1;
               break;
            }
        }
        return new int[]{k,b};
    }
}