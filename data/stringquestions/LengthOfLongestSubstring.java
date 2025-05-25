package data.stringquestions;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String str = "bbbbbb";
        List<Character> storageList = new ArrayList<>();
        int start = 0;
        int end=0;
        int maxLength = 0;
        while(end < str.length()){
            if(!storageList.contains(str.charAt(start))){
                storageList.add(str.charAt(start));
                maxLength = Math.max(maxLength, storageList.size());
            }else{
                storageList.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
            end++;
        }
        System.out.println("Max length string: "+ maxLength);
    }
}
