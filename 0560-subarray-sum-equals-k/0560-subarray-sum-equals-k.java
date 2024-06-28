class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        long sum = 0;
        int n = nums.length;
        
        for(int i=0; i<nums.length; i++){
            sum = 0 ;
            for(int j = i; j<nums.length; j++){
                sum += nums[j];
                if(sum==k){
                    c++;
                }
            }
        }
        return c;
    }
}