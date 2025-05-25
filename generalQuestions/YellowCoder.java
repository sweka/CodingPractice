package generalQuestions;

import model.Employees;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class YellowCoder {

    public static void main(String[] args) {
        no_of_MaleAndFemaleEmployees_Organization();
        find_sum_of_evenAndOddNumbers_InList();
        findDuplicateElementsInGivenList();
        removeAllOccurancesOfGivenCharacter();
        findSpecialCharactersInString();
        findOutAllNumbersStartingWithOne();
        findHighestSalariedEmployee();
        concatenateListOfStringsIntoSingleStringSeparatedByCommas();
        findTheFirstNonRepeatingCharacterInString();
        findFrequencyOfCharsInString();
        groupListOfStringByLength();
        countNumberOfOccurancesOfEachCharacterInString();
        filterNumbersGreaterThan10AndFindTheirAverage();
        listOfStringToMapKeyStringValueLength();
        flattenListOfListOfIntegersIntoSingleList();
        findTwoHighestSalariedEmployees();
        sortMapByKey();
        reverseArrayWithoutUsingThirdVariable();
    }


    private static void reverseArrayWithoutUsingThirdVariable() {
        String str = "Success";
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = charArr.length-1;
        while(start < end){
            charArr[start] = (char) (charArr[start] + charArr[end]);
            charArr[end] = (char) (charArr[start] - charArr[end]);
            charArr[start] = (char) (charArr[start] - charArr[end]);
            start++;
            end--;
        }
        System.out.print("Reverse string without third variable: "+ new String(charArr));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void sortMapByKey() {
        var map = Map.of("Python", 95,"JavaScript", 89,"C++", 92,"TypeScript", 85,"Swift", 80);
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(k -> System.out.print(k.getKey() + ": "+ k.getValue()));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void findTwoHighestSalariedEmployees() {
        Employees.getEmployees().stream().sorted(Comparator.comparingDouble(Employees::getSalary).reversed()).limit(2).forEach(i -> System.out.print(i.getName()+ ": "+ i.getSalary()));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void flattenListOfListOfIntegersIntoSingleList() {
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3),Arrays.asList(4, 5),Arrays.asList(6, 7, 8, 9));
        System.out.print("Flatten list of lists: " +listOfLists.stream().flatMap(i -> i.stream()).toList());
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void listOfStringToMapKeyStringValueLength() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        System.out.print("String to Map: "+strings.stream().collect(Collectors.toMap(Function.identity(), String::length)));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void filterNumbersGreaterThan10AndFindTheirAverage() {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        System.out.print("Numbers greater than 10 and average: "+ numbers.stream().filter(num -> num >10).collect(Collectors.averagingDouble(Integer::intValue)));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void countNumberOfOccurancesOfEachCharacterInString() {
        String s= "Hello World";
        System.out.print("Occurances of Each Char in String: "+ s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void groupListOfStringByLength() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "melon", "pear", "plum");
        System.out.print("Group List of String by Length: " + strings.stream().collect(Collectors.groupingBy(i -> i.length())));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void findFrequencyOfCharsInString() {
        String str = "aaabbbc";
        System.out.print( "Frequency of Chars: " + str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void findTheFirstNonRepeatingCharacterInString() {

        System.out.println("-----------------------------------------------------------------");
    }

    private static void concatenateListOfStringsIntoSingleStringSeparatedByCommas() {
        List<String> strList = Arrays.asList("apple","banana","cherry","dragon fruit");
        System.out.print("Concatenate into single List: "+ strList.stream().collect(Collectors.joining(",")));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void no_of_MaleAndFemaleEmployees_Organization() {
        System.out.println("Count of Male and Female Employees: " +
        Employees.getEmployees().stream().collect(Collectors.groupingBy(Employees::getGender,
                Collectors.counting())));
        System.out.println("-----------------------------------------------------------------");
    }

    private static void find_sum_of_evenAndOddNumbers_InList() {
        System.out.println(
        IntStream.rangeClosed(1,10).mapToObj(i -> (int)i).collect(
                Collectors.partitioningBy(i -> i%2==0, Collectors.summingInt(Integer::intValue))));
        System.out.println("-----------------------------------------------------------------");
    }

    private static void findDuplicateElementsInGivenList() {
        System.out.print("Duplicate Elements in List: ");
        List<String> duplicateStrList = Arrays.asList("apple","banana","carrot","banana","dragon fruit","apple");
        duplicateStrList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(i -> i.getValue()>1).forEach(j -> System.out.print(j.getKey() + " "));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void removeAllOccurancesOfGivenCharacter() {
        String str = "Java interview";
        String removeStr = "a";
        System.out.println("Remove all occurances using string method: " +str.replaceAll("a",""));
        System.out.println("Remove all occurances using Java 8: " + str.chars().mapToObj(c -> String.valueOf((char)c)).filter(i -> !removeStr.equalsIgnoreCase(i)).
                collect(Collectors.joining("")));
        System.out.println("-----------------------------------------------------------------");
    }

    private static void findSpecialCharactersInString() {
        String specialCharString = "Hello, World! 123 @#";
        specialCharString.chars().filter(c -> !Character.isLetterOrDigit(c)).
                mapToObj(i -> (char)i).
                forEach(System.out::print);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void findOutAllNumbersStartingWithOne() {
        System.out.println();
        List<Integer> intList = Arrays.asList(11, 18, 20, 24, 85, 66, 13);
        System.out.print("Numbers starting with One: ");
        intList.stream().filter(i -> String.valueOf(i).startsWith("1"))
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

    private static void findHighestSalariedEmployee() {
        Employees.getEmployees().stream().max(Comparator.comparingDouble(Employees::getSalary))
                .ifPresent(i -> System.out.print("Highest Salaried Employee: "+ i.getName()));
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

}
