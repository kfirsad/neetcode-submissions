class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myMap = {}

        for i,n in enumerate(nums):
            check = target - n
            if check in myMap:
                return [myMap[check], i]
            
            myMap[n] = i

        return []