class Solution {
    static int max(int[] piles){
        int max = 0;
        int n = piles.length;
        for(int i =0;i<n;i++){
            max = Math.max(max,piles[i]);
        }
        return max;
    }
    private boolean ts(int[] piles, int speed, int h) {
        long hours = 0;
 
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
            if (hours > h) {
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        while(low<=high){
            int mid = (low+high)/2;
            if(ts(piles,mid,h)){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}