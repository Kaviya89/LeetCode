class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){ swap(nums, i , z++);
            }
        }
        for(int j = z; j<nums.length; j++){
            if(nums[j]==1) {
                swap(nums, j, z++);
            }
        }
    }
    void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}