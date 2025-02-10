class Solution(object):
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        def gcd(a, b):
            if b == 0:
                return a
            return gcd(b, a % b)
        
        if str1 + str2 != str2 + str1:
            return ""
        
        gcd_length = gcd(len(str1), len(str2))
        return str1[:gcd_length]
