/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    let cur = 1
    let nxt = 1
    for (let i =1; i<n; i++) {
        let tmp = nxt
        nxt = cur + tmp
        cur = tmp
    }
    return nxt;
    
};