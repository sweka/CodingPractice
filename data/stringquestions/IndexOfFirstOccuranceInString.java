package data.stringquestions;

public class IndexOfFirstOccuranceInString {
    public static void main(String[] args) {
        String haystack = "happyLifehappy";
        String needle = "fe";
        //Simple solution
        System.out.println("Index is: "+haystack.indexOf(needle));
        System.out.println("Index is: "+leetCodeSolution(haystack, needle));
    }

    static int leetCodeSolution(String haystack,String needle){
        for(int i = 0; i< (haystack.length() - needle.length()) +1; i++){
            if(haystack.charAt(i) == needle.charAt(0) && needle.equalsIgnoreCase(haystack.substring(i,i+needle.length()))){
                return i;
            }
        }
        return -1;
    }
}
