class Solution {
    static void func(int open,int close,int n,String s,List<String> a){
        if(s.length() == 2*n){
            a.add(s);
            return;
        }
        if(open<n){
            func(open+1,close,n,s+"(",a);
        }
        if(close<open){
            func(open,close+1,n,s+")",a);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> a = new ArrayList<>();
        func(0,0,n,"",a);
        return a;
        
    }
}