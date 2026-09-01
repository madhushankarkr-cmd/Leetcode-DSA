class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cs = 0
        maxs = nums[0]
        for i in range(len(nums)):
            cs = cs + nums[i]
            if cs>maxs:
                maxs = cs
            if cs <=0:
                cs = 0
        return maxs
        