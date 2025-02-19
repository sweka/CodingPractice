package collections;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a list of Integers find the duplicate numbers in the list
 */

public class FindDuplicateNumbersFromList {
    public static void main(String[] args) {
        List<Integer> integerList= List.of(1,2,2,3,4,3,4,6,8,9);
        Map<Integer, Long> groupedMap = integerList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(groupedMap.entrySet().stream().filter(i -> Integer.compare(i.getValue().intValue(), 1) != 0 )
                .map(Map.Entry::getKey).collect(Collectors.toList()));
    }
}
