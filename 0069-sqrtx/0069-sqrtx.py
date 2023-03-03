class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        l = 1
        r = x
        while(l <= r):
            m = (l + r) //2
            if (m > x / m):
                r = m -1
            else:
                l = m+1
        return r
            
