class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        myMap = {}
        for n in s:
            if n in myMap:
                myMap[n] += 1
            else:
                myMap[n] = 1

        for n in t:
            if n in myMap:
                myMap[n] -= 1
                if myMap[n] < 0:
                    return False
            else:
                return False

        return True
