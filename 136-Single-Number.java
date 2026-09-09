class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int find = 0;
        for(int i =0;i<n;i++){
           find = find ^ nums[i];
        }
        return find;
    }
}