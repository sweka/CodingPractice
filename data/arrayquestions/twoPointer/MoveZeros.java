package data.arrayquestions.twoPointer;

import java.util.Arrays;

// Given array of integers move the zeros to the end of the array
public class MoveZeros {

    public static void main(String[] args) {
        myLogic(new int[]{1,0,0,3,12});
        System.out.println("---------------");
        snowBallMethod( new int[]{0,1,0,3,12});
        System.out.println("---------------");
        twoPointerMethod(new int[]{0,1,0,3,12});

    }

    private static void twoPointerMethod(int[] nums) {
         int j = -1;
         for(int i=0; i<nums.length; i++){
             if(nums[i] == 0){
                 j=i;
                 break;
             }
         }

         if(j != -1) {
             for (int i = j+1; i < nums.length; i++) {
                 if (nums[i] != 0) {
                     nums[i] = nums[i] + nums[j];
                     nums[j] = nums[i] - nums[j];
                     nums[i] = nums[i] - nums[j];
                     j++;
                 }
             }
         }
        System.out.println(Arrays.toString(nums));
    }

    private static void snowBallMethod(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }
        Arrays.stream(nums).forEach(System.out::print);
    }

    private static void myLogic(int[] nums) {
        int[] newNums = new int[nums.length];
        int index =0;
        int zeroCount = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                zeroCount++;
                continue;
            }else{
                newNums[index] = nums[i];
                index++;
            }
        }
        for(int i=0; i<zeroCount;i++){
            newNums[index+1] = 0;
        }
        Arrays.stream(newNums).forEach(System.out::print);
    }
}
