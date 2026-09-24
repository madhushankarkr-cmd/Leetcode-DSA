class Solution {
    public int removeElement(int[] nums, int val) {
        
    int n = nums.length;
    int i = 0;
    int count = 0;
    int res = 0;

        for(int h =0;h<nums.length;h++){
            if(nums[h] == val){
            } else {
            nums[i] = nums[h];
            res++;
            i++;
            }
        
        
        }
        return res;
    }
}