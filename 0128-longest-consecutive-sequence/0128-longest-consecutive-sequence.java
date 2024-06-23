class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        nums=Arrays.stream(nums).distinct().toArray();
        int c = 1;
        int max = 1;
        for(int i =1;i<nums.length; i++){
            if(nums[i] - 1 == nums[i-1]){
                c++;
                max = Math.max(c, max);
            }
            else{
                c=1;
            }
        }
        return max;
    }
}