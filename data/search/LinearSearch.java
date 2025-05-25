package data.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums= {4,5,2,6,1,9};
        int searchElement = 5;
        System.out.println("Element found at index: "+linearSearch(nums, searchElement));
    }

    private static int linearSearch(int[] nums, int searchElement) {
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == searchElement){
                return i;
            }
        }
        return -1;
    }
}
