package com.algorithm.homework.weekseven.p55;


/**
 * @author qiuch
 * 贪心，每次能跳到最远的距离，包含了之前所有的可能性
 * Time complexity : O(n)
 * Space complexity : O(1)
 */
class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            //max 更新不到i的位置，肯定有中断
            if (i > maxIndex) {
                return false;
            }
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if (maxIndex >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(new Solution().canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
