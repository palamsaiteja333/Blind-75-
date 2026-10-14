class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        # return sorted(s) == sorted (t)

        # return Counter(s) == Counter(t)  

        hashmapS, hashmapT = {}, {}

        if len(s) != len(t):
            return False
        for i in range(len(s)):
            hashmapS[s[i]] = 1 + hashmapS.get(s[i], 0)
            hashmapT[t[i]] = 1 + hashmapT.get(t[i], 0)

        for n in hashmapS:
            if hashmapS[n] != hashmapT.get(n, 0):
                return False
        return True


        