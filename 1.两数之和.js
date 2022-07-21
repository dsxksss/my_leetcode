/*
 * @lc app=leetcode.cn id=1 lang=javascript
 *
 * [1] 两数之和
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  // for (var i = 0; i < nums.length; i++) {
  //   for (var j = 0; j < nums.length; j++) {
  //     if (i === j) {
  //       continue;
  //     } else if (nums[i] + nums[j] === target) {
  //       return [i, j];
  //     }
  //   }
  // }
  //[1,8,9,2,5,4]
  //target = 10; // [0,2]
  let map = new Map(); //{K=当前数组元素内容:V=i也就对应着当前循环中的数组下标}
  for (let i = 0; i < nums.length; i++) {
    // console.log("第", i + 1, "map值:", map);
    // console.log("i=", i);
    // console.log("x=", x);
    if (map.has(target - nums[i])) {
      return [map.get(target - nums[i]), i];
    }
    map.set(nums[i], i);
  }
};
// console.log(twoSum([7, 8, 9, 2, 5, 4], 11));
// @lc code=end
