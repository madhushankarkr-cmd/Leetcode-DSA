class Solution {

    static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int p = -1;

        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }

        
        if (p == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        
        for (int i = n - 1; i > p; i--) {
            if (nums[i] > nums[p]) {
                swap(nums, i, p);
                break;
            }
        }

        
        reverse(nums, p + 1, n - 1);
    }
}