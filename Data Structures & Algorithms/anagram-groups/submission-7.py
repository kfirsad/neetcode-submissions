class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        myMap = {}

        for s in strs:
            key = "".join(sorted(s))
            if key in myMap:
                myMap[key].append(s)
            else:
                myMap[key] = [s]

        return list(myMap.values())
