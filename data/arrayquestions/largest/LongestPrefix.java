package data.arrayquestions.largest;

import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {
        String[] strArr = {"apple","appollo","ape"};
        System.out.println(findLongestPrefix(strArr));
    }

    private static String findLongestPrefix(String[] strArr) {
        String longestSubString = "";
        Arrays.sort(strArr);
        String firstWord = strArr[0];
        String lastWord = strArr[strArr.length-1];
        int index=0;
        for(int i= 0; i<firstWord.length(); i++){
            if(firstWord.charAt(i) == lastWord.charAt(i)){
                index = i;
            } else{
                break;
            }
        }

        return index > 0 ? firstWord.substring(0, index+1) : longestSubString;
    }
}
