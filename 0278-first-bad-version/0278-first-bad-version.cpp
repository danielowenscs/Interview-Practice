// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int min = 1;
        int max = n;
        int guess;
        
        while (!isBadVersion(min)) {
           guess = min +(max-min)/2;
            cout << guess;
           isBadVersion(guess) ?  max = guess - 1: min = guess + 1;
        }
        return min;
    }
};

// [1, 2, 3]
// min = 1
// max = 3
// guess = 2

