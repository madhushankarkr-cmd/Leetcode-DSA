class Solution {
    static void func(int[] nums,int i,List<List<Integer>> ans,List<Integer> a){

        ans.add(new ArrayList<>(a));
        for(int j = i;j<nums.length;j++){
            if(j>i && nums[j] == nums[j-1]) continue;
            a.add(nums[j]);
            func(nums,j+1,ans,a);
            a.remove(a.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        func(nums,0,ans,new ArrayList<>());
        return ans;
        
    }
}