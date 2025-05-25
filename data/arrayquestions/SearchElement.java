package data.arrayquestions;

public class SearchElement {

    public static void main(String[] args) {
        int[] nums = {1,3,3,4,5,6,6,7,8,9,9};
        int searchElement = 3;
        String index = "";
        for(int i=0; i< nums.length; i++){
            if(nums[i] == searchElement){
                index += String.join(",", String.valueOf(i));
            }
        }
        System.out.println("".equalsIgnoreCase(index)? "No Element found" : "Element found at indexes: " + index);
    }
}
