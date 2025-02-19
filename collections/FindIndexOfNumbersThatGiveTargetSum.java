package collections;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers find the index of the numbers that
 * give the target sum.
 *
 * Example: Input : 2,7,11,15
 * Target: 9
 * Output: [0,1]
 * number at index 0 ie, 2 and number at index 1 ie 7 gives target Sum 9
 */
public class FindIndexOfNumbersThatGiveTargetSum {


        public static void main(String[] args) {
            List<Integer> integerList = Arrays.asList(2,7,11,15);
            Integer targetSum = 9;
            for(int i=0; i <integerList.size()-1; i++){
                if(targetSum.equals(integerList.get(i)+ integerList.get(i+1))){
                    System.out.println("Index is: "+ Arrays.asList(i,i+1));
                }
            }
        }
}

