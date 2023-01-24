class Solution {
    public boolean isPalindrome(int x) {
        String xAsStr = String.valueOf(x);
        int length = xAsStr.length();
        for (int i = 0; i<length/2; i++) {
            if (xAsStr.charAt(i) != xAsStr.charAt(length-1-i)) {
                return false;
            }
        }
        return true;
    }
}