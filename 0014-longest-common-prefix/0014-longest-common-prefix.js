/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let prefix = ""
    let minLength = 0
    
    for (let i=0; i<strs.length; i++) {
        if (minLength < strs[i].length) {
            minLength = strs[i].length
        }
    }
    for (let i=0; i<minLength; i++) {
        let hasCommon = true;
        currChar = strs[0][i]
        
        for (let j = 1; j<strs.length; j++) {
            if (currChar != strs[j][i]) {
                hasCommon = false;
                break;
            }
        }
        if (hasCommon) {
            prefix+=currChar
        }
        else {
            return prefix
        }
    }
    return prefix
};