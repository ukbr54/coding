package com.example.array.twoPointer;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Time Complexity: O(nlogn)
 * Space Complexity: o(1)
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left] + nums[right] == target){
                 return new int[]{nums[left],nums[right]};
            }else if(nums[left] + nums[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
