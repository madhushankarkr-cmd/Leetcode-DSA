class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxsub = nums[0];

        for(int i = 1;i<nums.length;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxsub = Math.max(maxsub,currentSum);
        }
        return maxsub;

    }
}