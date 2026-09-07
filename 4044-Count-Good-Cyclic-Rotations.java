class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int h = n / 2;

        long t = 0;
        long f = 0;

   
        for (int i = 0; i < n; i++) {
            t += nums[i];

            if (i < h) {
                f += nums[i];
            }
        }

        int ans = 0;

        
        for (int i = 0; i < n; i++) {
            if (f> t - f) {
                ans++;
            }

      
            f -= nums[i];
            f += nums[(i + h) % n];
        }

        return ans;
    }
}