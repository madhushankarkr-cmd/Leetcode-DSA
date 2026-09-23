class Solution {
    static int Totalsum(int[] nums){
        int ts = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            ts +=nums[i];
        }
        return ts;
    }
    static int pivotsum(int[] nums){
        int ls = 0;
        int sum = Totalsum(nums);

        int n = nums.length;
        for(int i =0;i<n;i++){
            int rs = sum - ls - nums[i];
            if(ls == rs){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
    
    public int pivotIndex(int[] nums) {
        return pivotsum(nums);

    }
}