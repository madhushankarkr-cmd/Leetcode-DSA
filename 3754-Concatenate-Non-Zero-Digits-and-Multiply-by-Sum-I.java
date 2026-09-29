class Solution {
    public long sumAndMultiply(int n) {

        String str = String.valueOf(n);

        long x = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != '0') {
                int digit = ch - '0';
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }
}