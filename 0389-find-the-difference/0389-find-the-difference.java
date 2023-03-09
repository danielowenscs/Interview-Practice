class Solution {
    public char findTheDifference(String s, String t) {
        int val = 0;
        for (int i = 0; i<s.length(); i++) {
            val += (int) t.charAt(i) - (int) s.charAt(i);
        }
        return (char) ((int) t.charAt(t.length()-1) + val);
    }
}

// abc
// dcba
// 1 - 4 = -3
// 2 - 3 = -1
// 3 - 2 = 1
// a = 1 + 3 = 4 = d
