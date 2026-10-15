class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:

        hashmap = {} # value: index

        for i, n in enumerate(nums):
            diff = target - n
            if diff in hashmap:
                return [i, hashmap[diff]]
            hashmap[n] = i
        return 