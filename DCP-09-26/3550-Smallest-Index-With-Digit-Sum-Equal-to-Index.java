class Solution {
    public int smallestIndex(int[] nums) {
    int n = nums.length;
        for(int i = 0; i < n; i++) {

        int a = nums[i];
        int sum = 0;

            while(a > 0) {
                sum = sum + a % 10;
                a = a/ 10;
            }

            if(i == sum) {
                return i;
            }
        }

        return -1;
    }
}