package data.stringquestions;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String s1 = "peek";
        String s2 = "keep";
        leetCodeSolution(s1,s2);
    }

    static void leetCodeSolution(String s1, String s2){
        if(s1.length() == s2.length()){
            char[] s1Sorted =s1.toCharArray();
            char[] s2Sorted =s2.toCharArray();
            Arrays.sort(s1Sorted);
            Arrays.sort(s2Sorted);
            if(Arrays.equals(s1Sorted, s2Sorted)){
                System.out.println("Strings are anagrams");
            }
        }else {
            System.out.println("Strings are not anagrams");
        }
    }
}
