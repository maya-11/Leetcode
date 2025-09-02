class Solution(object):
    def twoSum(self, nums, target):
        d = {}
        for i in range(len(nums)):
            d[nums[i]] = i  # store value:index

        for i in range(len(nums)):
            x = target - nums[i]
            if x in d and i != d[x]:
                return [i, d[x]]

        return None
