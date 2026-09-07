class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        if (n == 1) {
            return k == 0 ? 1 : 0;
        }

           int equal = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                equal++;
            }
        }

        int total = equal;

        if (k == total - 1) {
            return equal;
        }
        if (k == total) {
            return n - equal;
        }

        return 0;

    }
}