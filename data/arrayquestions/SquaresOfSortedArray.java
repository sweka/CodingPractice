package data.arrayquestions;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquaresOfSortedArray {
    public static void main(String[] args) {
      //myLogic();
      twoPointerApproach();
    }

    private static void twoPointerApproach() {
        int[] input = {-4,-1,0,3,10};
        int[] output = new int[input.length];
        int j= input.length-1;
        for(int i=0; i< input.length; i++){
            if(Math.abs(input[i]) < Math.abs(input[j])){
                output[i] = input[i]*input[i];
            }

        }
        Arrays.stream(output).forEach(System.out::println);
    }

    public static void myLogic(){
        int[] input = {-4,-1,0,3,10};
        for(int i=0; i < input.length; i++){
            input[i] = input[i] * input[i];
        }
        Arrays.sort(input);
        Arrays.stream(input).forEach(System.out::println);
    }
}
