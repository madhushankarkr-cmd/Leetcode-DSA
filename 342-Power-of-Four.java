class Solution {
    static boolean func(int n){
        if(n ==1){
            return true;
        }
        if(n <= 0 || n % 4 != 0){
            return false;
        }
        return func(n/4);
    }
    public boolean isPowerOfFour(int n) {
        return func(n);
    }
}