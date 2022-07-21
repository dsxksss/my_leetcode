/*
 * @lc app=leetcode.cn id=14 lang=javascript
 *
 * [14] 最长公共前缀
 */

// @lc code=start
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
  let string = "";

  for (let i = 0; i < strs[0].length; i++) {
    const commonString = strs.every(str => str[i] === strs[0][i]);

    if (commonString === true) {
      string += strs[0][i];
    } else {
      break;
    }
  }

  return string;
};

longestCommonPrefix(["flower", "flow", "flight"]);

// @lc code=end
