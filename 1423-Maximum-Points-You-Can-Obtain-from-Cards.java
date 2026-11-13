class Solution {
    static int func(int[] cardPoints,int k){
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        // Tc-O(k)
        // Calculate left sum
        for(int i =0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxsum = lsum;
        int rindex = cardPoints.length-1;
        //Tc-O(k)
        // calculate right sum 
        // we remove form left and add from right
        for(int i = k-1;i>=0;i--){
            lsum = lsum - cardPoints[i]; // remove from left sum
            rsum = rsum + cardPoints[rindex]; // add from right
            rindex-=1; // 
            maxsum = Math.max(maxsum,lsum+rsum); // find max
        }
        return maxsum;
    }
    public int maxScore(int[] cardPoints, int k) {
        return func(cardPoints,k);
    }
}
//Tc - O(2*k)
//Sc - O(1) we use only variables 