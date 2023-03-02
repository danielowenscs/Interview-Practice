// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (!isBadVersion(l)) {
           int m = l +(r-l)/2;
           isBadVersion(m) ?  r = m - 1: l = m + 1;
        }
        return l;
    }
};

// [1, 2, 3]
// min = 1
// max = 3
// guess = 2

