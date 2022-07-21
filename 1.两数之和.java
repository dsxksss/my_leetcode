import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

/*
  
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

示例 1：
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

示例 2：
输入：nums = [3,2,4], target = 6
输出：[1,2]

示例 3：
输入：nums = [3,3], target = 6
输出：[0,1]
 */

// @lc code=start
class Solution {

  // twoSum([2,5,5,11],10); //[1,1] //[1,2]
  //  i  0 1 2 3
  //  j  0 1 2 3
  // [2,5,5,11] 10 //[1,1] //[1,2]
  /*
   * Accepted
    57/57 cases passed (112 ms)
    Your runtime beats 5.19 % of java submissions
    Your memory usage beats 9.86 % of java submissions (42 MB)
   * 
   * Accepted
   * 57/57 cases passed (114 ms)
   * Your runtime beats 5.19 % of java submissions
   * Your memory usage beats 63.43 % of java submissions (41.4 MB)
   * 
   * Accepted
   * 57/57 cases passed (1 ms)
   * Your runtime beats 99.36 % of java submissions
   * Your memory usage beats 59.66 % of java submissions (41.5 MB)
   * 
   */
  public int[] twoSum(int[] nums, int target) {
    // for (int i = 0; i < nums.length; i++) {
    //   for (int j = 1; j < nums.length; j++) {
    //     if (i == j) continue;
    //     if (nums[i] + nums[j] == target) {
    //       return new int[] { i, j };
    //     }
    //   }
    // }
    // return new int[] {}
    // ---------------[5,6,9,3,5] 10 -> [0,4]---------------- -------------
    // 进入for循环前
    // hashtable = key:null,value:null
    // 进入for循环后
    // //key = 当前nums[i]内容 , value = 当前这个内容的位置
    // 1:target - nums[i] = 5   //key = 5 , value = 0 if = false
    // 2:target - nums[i] = 4   //key = 6 , value = 1 if = false
    // 3:target - nums[i] = 1   //key = 9 , value = 2 if = false
    // 4:target - nums[i] = 8   //key = 3 , value = 3 if = false
    // 5:target - nums[i] = 5   //key = 5 , value = 4 if = true
    Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
    //1、hashtable(key:5,value:0)
    //2、hashtable(key:6,value:1)
    //3、hashtable(key:9,value:2)
    //4、hashtable(key:3,value:3)
    //5、hashtable(key:5,value:4) xxx
    for (int i = 0; i < nums.length; ++i) {
      //containsKey查找已有的数据里面的key如果和传来的值相同的话返回true,否则返回false
      if (hashtable.containsKey(target - nums[i])) { //
        return new int[] { hashtable.get(target - nums[i]), i }; //[0,4]
      }
      hashtable.put(nums[i], i); //
    }
    return new int[0];
  }
}
// @lc code=end
/*
 * 
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。
 
示例 1：

输入：x = 121
输出：true
示例 2：

输入：x = -121
输出：false
解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
示例 3：

输入：x = 10
输出：false
解释：从右向左读, 为 01 。因此它不是一个回文数。
 * 
 * 
 */
