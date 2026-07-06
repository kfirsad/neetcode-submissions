class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        myMap = {}
        
        for n in nums:
            if n in myMap:
                myMap[n] += 1
            else:
                myMap[n] = 1

        sorted_map = sorted(myMap.items(), key=lambda item:item[1], reverse=True)
        return [num for num, count in sorted_map[:k]]
