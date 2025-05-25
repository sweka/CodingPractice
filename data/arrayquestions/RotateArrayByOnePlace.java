package data.arrayquestions;

import java.util.Arrays;

public class RotateArrayByOnePlace {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotateArrayByOnePlace(nums);
        System.out.println("Array Rotated by One place: "+ Arrays.toString(nums));
    }

    private static void rotateArrayByOnePlace(int[] nums) {
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1]= temp;
    }
}
