class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        l = 1
        r = num
        while(l <= r):
            m = (l + r) //2
            print(m, l, r)
            if (num / m == m and num % m == 0):
                return True
            if (m > num / m):
                r = m -1
            else:
                l = m+1
        return False
            

        