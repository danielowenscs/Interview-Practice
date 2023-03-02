class Solution {
public:
    bool isPalindrome(int x) {
        string xAsStr = to_string(x);
        for (int i=0; i<xAsStr.length()/2; i++) {
           if (xAsStr[i] != xAsStr[xAsStr.length()-i-1]) {
                return false;
            }
        }
        return true;
    }
};