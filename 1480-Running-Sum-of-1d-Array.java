class Solution {
    static int[] prefix(int[] nums){
        int n = nums.length;
        for(int i = 1;i<n;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
    public int[] runningSum(int[] nums) {
       return  prefix(nums);
    }
}