class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k = nums.length;
        int index = 0;
        int[] ans = new int[k];
        for(int i =0;i<n;i++){
         ans[index] = nums[i];
            index++;
        ans[index] = nums[i+n];
            index++;    
        }
        return ans;
    }
}