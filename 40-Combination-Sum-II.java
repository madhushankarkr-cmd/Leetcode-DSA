class Solution {
    static void func(int i,int[] candidates,int target,List<List<Integer>> ans,List<Integer> a){
        if (target == 0) {
            ans.add(new ArrayList<>(a));
            return;
        }

        for(int j = i;j<candidates.length;j++){
            if (j>i && candidates[j] == candidates[j-1])
                continue;
            if(candidates[j]>target) break;
            a.add(candidates[j]);
            func(j+1, candidates, target - candidates[j], ans, a);
            a.remove(a.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        Arrays.sort(candidates);

        func(0, candidates, target, ans, a);

        return ans;
    }
}