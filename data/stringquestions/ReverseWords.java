package data.stringquestions;

public class ReverseWords {

    public static void main(String[] args) {
        String s = " the sun   is bright ";
        leetCodeSolution(s);
    }

    static void leetCodeSolution(String s){
        StringBuilder newStr = new StringBuilder();
        String[] splitStr = s.split(" +");
        for(int i=splitStr.length-1; i>=0; i--){
            newStr.append(splitStr[i]).append(" ");
        }
        System.out.println("Reversed string is: "+ newStr.toString().trim());
    }
}
