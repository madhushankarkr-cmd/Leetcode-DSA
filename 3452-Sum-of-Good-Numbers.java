class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int totalSum = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            boolean found = true;
            
            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                found = false;
            }
            
            if (i + k < n && nums[i] <= nums[i + k]) {
                found = false;
            }
            
            if (found) {
                totalSum += nums[i];
            }
        }
        
        return totalSum;
    }
}
