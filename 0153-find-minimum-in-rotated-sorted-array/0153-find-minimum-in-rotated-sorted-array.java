class Solution {
    public int findMin(int[] nums) {
        int low=0, high = nums.length-1;
        int min = nums[0];
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>=nums[low] && nums[low]>=nums[high]){
                low = mid+1;
                min = Math.min(min,nums[low]);
            }
            else{
                high = high-1;
                min = Math.min(min,nums[high]);
            }

        }
        return min;

    }
}