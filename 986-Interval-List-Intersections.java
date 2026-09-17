class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

    List<int[]> res = new ArrayList<>();
    int n = firstList.length;
    int m = secondList.length;
    int i = 0;
    int j = 0;
    while(i<n && j<m){
           
        int st1 = firstList[i][0];
        int ed1 = firstList[i][1];

        int st2 = secondList[j][0];
        int ed2 = secondList[j][1];
            
        int start = Math.max(st1,st2);
        int end = Math.min(ed1,ed2);
                
        if(start<=end){
            res.add(new int[]{start, end});
        }
              
        
        if(ed1<ed2){
            i++;
        } else {
            j++;
        }
    }
     return res.toArray(new int[res.size()][]);
        
    }
}