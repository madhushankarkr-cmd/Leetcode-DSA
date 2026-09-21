class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = 0;
        int low = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           if (i - low + 1 > k) {
                map.put(nums[low],
                map.get(nums[low]) - 1);

            if (map.get(nums[low]) == 0) {
                map.remove(nums[low]);
            }
           
           sum-=nums[low];
           low++;
           }
             if (i- low + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}