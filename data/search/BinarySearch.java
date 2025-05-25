package data.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7,8,9};
        int searchElement = 6;
        System.out.println("Index is: "+binarySearch(nums, 0, nums.length-1, searchElement));
    }

     static int binarySearch(int[] nums, int start, int end, int searchElement) {
        int mid = start + (end-start)/2;

        if(nums[mid] == searchElement){
            return mid;
        }else if(nums[mid] < searchElement){
            return binarySearch(nums, mid+1, end, searchElement);
        }else{
            return binarySearch(nums, start, mid-1, searchElement);
        }
     }
}
