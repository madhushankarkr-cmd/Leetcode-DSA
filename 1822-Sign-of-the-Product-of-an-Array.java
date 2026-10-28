class Solution {
     public int sign(int[] nums, int i) {
        if (i == nums.length) {
            return 1;
        }

        if (nums[i] == 0) {
            return 0;
        }

        int ans = sign(nums, i + 1);

        if (nums[i] < 0) {
            return -ans;
        }

        return ans;
    }
    public int arraySign(int[] nums) {
        return sign(nums,0);
   
    }
}