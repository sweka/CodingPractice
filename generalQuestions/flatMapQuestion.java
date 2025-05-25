package generalQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class flatMapQuestion {
    public static void main(String[] args) {
        List<Map<String, String>> input = Arrays.asList(
               Map.of("c1","100","c2","20","c3","500"),
               Map.of("c4","80","c5","50"));
       input.stream().flatMap(list -> list.entrySet().stream()).toList()
               .stream().sorted(Comparator.comparing(entry -> Integer.valueOf(entry.getValue()), Comparator.reverseOrder())).
       forEach(i -> System.out.println("Key: "+ i.getKey() + " Value: "+i.getValue()));
    }
}
