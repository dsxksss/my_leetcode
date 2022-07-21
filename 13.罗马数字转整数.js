/*
 * @lc app=leetcode.cn id=13 lang=javascript
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
  // let map = new Map();
  // map.set("I", 1);
  // map.set("V", 5);
  // map.set("X", 10);
  // map.set("L", 50);
  // map.set("C", 100);
  // map.set("D", 500);
  // map.set("M", 1000);
  // console.log(map);
  let n = [];
  const getValue = s => {
    switch (s) {
      case "I":
        return 1;
      case "V":
        return 5;
      case "X":
        return 10;
      case "L":
        return 50;
      case "C":
        return 100;
      case "D":
        return 500;
      case "M":
        return 1000;
      default:
        return 0;
    }
  };
  let reuslt = 0;
  // for (x of s) {
  //   if (map.has(x)) n.push(map.get(x));
  // }
  for (let i = 0; i < s.length; ++i) {
    reuslt +=
      getValue(s[i + 1]) > getValue(s[i]) ? -getValue(s[i]) : getValue(s[i]);
  }
  // console.log(n);
  // console.log(reuslt);
  return reuslt;
};
// romanToInt("MCMXCIV");
// @lc code=end
