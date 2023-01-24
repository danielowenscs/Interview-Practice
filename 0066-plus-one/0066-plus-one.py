class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        length = len(digits)
        num = 0
        i = 0
        for digit in digits:
            num += digit * (10 ** (length - i-1))
            i = i + 1
        num += 1
        return [int(x) for x in str(num)]
            
        