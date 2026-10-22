class Solution {
    static void func(int i,List<Integer> a,int[] nums,int n,List<List<Integer>> ans){
        //base case
        if(i==n){
            ans.add(new ArrayList<>(a));
            return;
        }

        a.add(nums[i]);
        func(i+1,a,nums,n,ans);
        a.remove(a.size()-1);
        func(i+1,a,nums,n,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        func(0,a,nums,nums.length,ans);
        return ans;
        
    }
}