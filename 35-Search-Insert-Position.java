class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == target){
                return i;
            }
            if(target<nums[i]){
               return i;
            }
        }
        return n;
        
    }
}