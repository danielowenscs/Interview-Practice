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
        

    
# 0 0 0

# 0 1 1

# 0 2 2
# 0 + 4 too big
# 0 + 1 too small
# 1 + 1 works

# 0 3 3
# 0 + 9 too big
# 0 + 4 too big
# 0 + 1 too small
# 1 + 1 stop


        