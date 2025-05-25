package data.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {9,7,4,5,1,8};
        mergeSort(nums, 0, nums.length-1);
        System.out.println("Merge sort: "+ Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, right, mid);
        }
    }

    private static void merge(int[] nums, int left, int right, int mid) {

        int s1 = mid - left +1 ;
        int s2 = right - mid;

        int[] lArr = new int[s1];
        int[] rArr = new int[s1];

        for(int i=0; i< s1; i++){
            lArr[i] = nums[left+i];
        }

        for(int j=0; j < s2; j++){
            rArr[j] = nums[mid+1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < s1 && j < s2){
            if(lArr[i] <= rArr[j]){
                nums[k++] = lArr[i++];
            }else{
                nums[k++] = rArr[j++];
            }
        }

        while(i< s1){
            nums[k++] = lArr[i++];
        }

        while(j< s2){
            nums[k++] = rArr[j++];
        }
    }
}
