package data.arrayquestions.rotateArray;

import java.util.Arrays;

public class RotateArrayByKPlaces {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int rotation = 2;
        rotateArrayByKPlaces(nums, rotation);
        System.out.println("Rotated array: "+ Arrays.toString(nums));
    }

    private static void rotateArrayByKPlaces(int[] nums, int rotation) {
        if(rotation % nums.length  > 0) {
            int newRotation = rotation % nums.length;
            rotateArray(nums, 0, newRotation - 1); //3 2 1 4 5 6 7 8
            rotateArray(nums, newRotation, nums.length - 1); // 3 2 1 8 7 6 5 4
            rotateArray(nums, 0, nums.length - 1); // 4 5 6 7 8 1 2 3
        }
    }

    private static void rotateArray(int[] nums, int start, int end){
        int mid = start > 0 ? (start+ end)/2 : (end+1)/2;
        for(int i= start; i<mid; i++){
            nums[i] = nums[i] + nums[(start+end)-i];
            nums[(start+end)-i] = nums[i] - nums[(start+end)-i];
            nums[i] = nums[i] - nums[(start+end)-i];
        }
    }
}
