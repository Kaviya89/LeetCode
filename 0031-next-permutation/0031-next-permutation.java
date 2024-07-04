class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i= n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1)  reverse(nums, 0, n-1);
        else{
            for(int i= n-1; i>=index; i--){
                if(nums[i]>nums[index]){
                    swap(nums,i , index);
                    break;
                }
            }
            reverse(nums, index+1, n-1);
        }
    }
    public void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public void reverse(int[] a, int i, int j){
        while(i<=j)
            swap(a,i++,j--);
    }
}