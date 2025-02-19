package collections;

import java.util.List;
import java.util.stream.Collectors;

public class FindMissingNumbersFromBelowList {
    public static void main(String[] args) {
        List<Integer> listOne = List.of(1,2,3,4,6,8,9);
        List<Integer> listTwo = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(listTwo.stream().filter(i -> !listOne.contains(i)).collect(Collectors.toList()));
    }
}
