package data.stringquestions;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        mySolution(s);
        leetCodeSolution(s);
    }

    private static void mySolution(String s) {
        String[] sArray = s.split(" ");
        System.out.println("Length of last word: " +sArray[sArray.length-1].length());
    }


    private static void leetCodeSolution(String s) {
        String trimmedString = s.trim();
        int count = 0;
        for(int i= trimmedString.length()-1; i>=0; i--){
            if(trimmedString.charAt(i) != ' '){
                count ++;
            }else{
                break;
            }
        }
        System.out.println("Length of last word: "+ count);
    }

}
