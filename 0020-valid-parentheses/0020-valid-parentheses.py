class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = ''
        for char in s:
            if (char == '('):
                stack += ')'
            elif (char == '['):
                stack += ']'
            elif (char == '{'):
                stack += '}'
            elif (len(stack) == 0 or char != stack[-1]):
                return False
            else:
                stack = stack[:-1]
        return (len(stack) == 0)
    
    

        