class Solution {
    static void func(int i,int[] candidates,int target,List<List<Integer>> ans,List<Integer> a){
          if (target == 0) {
            ans.add(new ArrayList<>(a));
            return;
        }

        if (i == candidates.length) {
            return;
        }

        if (candidates[i] <= target) {
            a.add(candidates[i]);
            func(i, candidates, target - candidates[i], ans, a);
            a.remove(a.size() - 1);
        }

        func(i + 1, candidates, target, ans, a);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();

        func(0, candidates, target, ans, a);

        return ans;
    }
}