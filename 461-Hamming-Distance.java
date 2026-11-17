
class Solution {
    public int hammingDistance(int x, int y) {

        int ans = x ^ y;
        int count = 0;

        while (ans > 0) {

            count += ans & 1;

            ans = ans >> 1;
        }

        return count;
    }
}
// Time Complexity- O(log(max(x, y)))
// Space Complexity- O(1)