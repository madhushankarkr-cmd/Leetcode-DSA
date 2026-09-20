class Solution {
    static int totalsum(int[] nums){
        int ts = 0;
        for(int num: nums){
            ts = ts + num;
        }
        return ts;
    }
    static int pivotsum(int[] nums){
        int sum = totalsum(nums);
        int ls = 0;
        int n = nums.length;

        for(int i =0;i<n;i++){
            int rs = sum - ls - nums[i];
            if(ls == rs){
                return i;
            }
            ls = ls += nums[i];
        }
        return -1;
    }
    public int pivotIndex(int[] nums) {
        return pivotsum(nums);
    }
}