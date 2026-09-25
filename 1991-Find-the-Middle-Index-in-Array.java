class Solution {
    static int totalsum(int[] nums){
        int n = nums.length;
        int ts=0;
        for(int num:nums){
            ts+=num;
        }
        return ts;
    }
    static int middleindex(int[] nums){
        int n = nums.length;
        int left =0;
        int sum = totalsum(nums);
        for(int i =0;i<n;i++){
            int right = sum - left - nums[i];
            if(left == right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
    public int findMiddleIndex(int[] nums) {
        return middleindex(nums);
    }
}