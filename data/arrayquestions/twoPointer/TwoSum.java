package data.arrayquestions.twoPointer;

import java.util.Arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,1};
        int target = 6;
        System.out.println(Arrays.toString(findSubArraySum(nums, target)));
    }

    private static int[] findSubArraySum(int[] nums, int target) {
        int i = 0;
        int[] ans = new int[2];
        while(i < nums.length-1){
            if(nums[i] + nums[i+1] == target){
                ans[0] = i;
                ans[1] = i+1;
            }
            i++;
        }
        return ans;
    }
}
