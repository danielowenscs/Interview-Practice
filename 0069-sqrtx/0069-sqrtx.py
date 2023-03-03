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
            if (x / m == m):
                return m
            if (m > x / m):
                r = m -1
            else:
                l = m+1
        return r
            
        
# 1
# l = 0, r = 1 m = 0 => 0
# too small
# l = 1 r= 1 m = 1
# works

# 2 
# l = 0 r = 2 m = 1 -> 1
# too small
# l = 1 r = 2 m = 1 -> 1
# works

# 8
# l = 0 r = 8 m = 4 -> 16 too big
# l = 0 r = 3 m = 1 -> 1 too small
# l = 1 r = 3 m = 2 -> too small
# l = 2 r = 2 m = 2 - > 4
# l = 3 r = 3 m = 2
# works