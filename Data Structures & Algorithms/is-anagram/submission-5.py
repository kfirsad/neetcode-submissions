class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        myMap = {}

        for s in s:
            if s in myMap:
                myMap[s] += 1
            else:
                myMap[s] = 1
        
        for s in t:
            if s in myMap:
                myMap[s] -= 1
                if myMap[s] < 0:
                    return False
            else:
                return False

        return True