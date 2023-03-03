class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        l = 0
        r = int(c ** 0.5)
        while (l <= r):
            s = (l * l + r * r)
            if (s == c):
                return True
            if (s < c):
                l+=1
            else:
                r-=1

        