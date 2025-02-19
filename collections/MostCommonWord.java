package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a String paragraph and  a string array of Banned words
 * return the most frequent word that is not banned. It is guaranteed that
 * atleast one word that is not banned and the answer is unique. The words in the paragraph
 * case-insensitive and the answer should be returned in lowercase.
 *
 * Example1: Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * Explanation: "hit" occurs three times but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent
 * non-banned word in the paragraph. Note that words in the paragraph are not case
 * sensitive, that punctuation is ignored (even if adjacent to words, such as "ball,") and
 * that "hit" isn't the answer even though it occurs more because it is banned.
 *
 * Example2:
 * Input:
 * paragraph ="a."
 * banned=[]
 * Output: a
 *
 * Constraints:
 * 1<=paragraph.length<=1000
 * paragraph consists of English letters, space ' ', or one of the symbols "!?',;."
 * 0<= banned.length<=100
 * 1<=banned[i].length<=10
 * banned[i] contains only lowercase English letters
 *
 */
public class MostCommonWord {

    public static void main(String[] args) {
        String paragraph = "a.";
        String[] banned ={""};
        Map<String, Long> frequencyMap = Arrays.stream(paragraph.toLowerCase().replaceAll("[.,!?';\"]","").split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequencyMap.entrySet().stream().filter(i -> !Arrays.stream(banned).toList().contains(i.getKey())).max(Comparator.comparingLong(Map.Entry::getValue)).get());

    }
}
