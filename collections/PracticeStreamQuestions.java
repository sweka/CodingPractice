package collections;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamQuestions {
    public static void main(String[] args) {
        System.out.println("abcda".chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining()));
        System.out.println("abcda".chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() ==1).map(Map.Entry::getKey).findFirst().get());
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //System.out.println(integerList.set(0,11));
        List<Integer> unsortedList = List.of(12,4,59,10,89,76,23);
        //System.out.println(unsortedList.set(0,11));
        List<String> stringList = List.of("apple","ericcson","cat","banana","dog");
        String[] stringArray = {"apple","ericcson","cat","banana","dog"};
        //1. find sum of all numbers
        sumOfAllNumbers(integerList);
        //2. Given a list of integers, write a program to find and print the maximum element using Java Stream API
        findMaximumElement(unsortedList);
        //3. Write a program to filter out all the even numbers from a list using Java Stream API
        System.out.println("Even elements are: "+ unsortedList.stream().filter(i -> i%2 ==0).toList());
        //4. Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
        countNumberOfStringsContainingSpecificCharacter(stringList);
        //5. Write a program to convert a list of strings to uppercase using Java Stream API.
        System.out.println("Strings to uppercase: "+ stringList.stream().map(String::toUpperCase).toList());
        //6. Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API.
        System.out.println("Average of numbers: "+ integerList.stream().mapToInt(Integer::intValue).average());
        //7. Write a program to sort a list of strings in alphabetical order using Java Stream API.
        sortStringInAlphabeticalOrder(stringList, stringArray);
        //8. Given a list of strings, write a program to concatenate all the strings using Java Stream API.
        System.out.println("Concatenate all strings: "+stringList.stream().collect(Collectors.joining()));
        //9. Given a list of strings, write a program to concatenate all the strings without using Java Stream API.
        System.out.println("Concatenate strings without java 8: "+ String.join("",stringList));
        System.out.println("Concatenate Arrays without java 8: "+ String.join("",stringArray));
        //10. Write a program to find the longest string in a list of strings using Java Stream API.
        System.out.println("Longest string in list: "+stringList.stream().max(Comparator.comparing(String::length)).get());
        //11. Given a list of integers, write a program to find and print the second largest number using Java Stream API.
        System.out.println("Second largest number: "+ unsortedList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
        Stream.of( "Java", "Python", "C#", "Java", "Kotlin", "Python").distinct().sorted().forEach(System.out::println);
        stringList.stream().filter(i -> true).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        add(Integer.valueOf(10));
    }

    static int add(int a){
        System.out.println("from primitive type");
        return a;
    }

    static Integer add(Integer a){
        System.out.println("from object");
        return a;
    }

    private static void sortStringInAlphabeticalOrder(List<String> stringList, String[] stringArray) {
        //With java 8
        System.out.println("With java 8: Sorted string list: " + stringList.stream().sorted().toList());
        //Without java 8
        List<String> sortedString =new ArrayList<>(stringList);
        for (int i = 0; i < sortedString.size() - 1; i++) {
            for (int j = 0; j < sortedString.size() - 1 - i; j++) {
                if (sortedString.get(j).compareTo(sortedString.get(j + 1)) > 0) {
                    String temp = sortedString.get(j);
                    sortedString.set(j, sortedString.get(j + 1));
                    sortedString.set(j + 1, temp);
                }
            }
        }
        System.out.println("Without java 8: Sorted string list: "+sortedString);
    }

    private static void countNumberOfStringsContainingSpecificCharacter(List<String> stringList) {
        //With java 8
        System.out.println("With java 8: Number of words having a: " + stringList.stream().filter(c -> c.contains("a")).toList());
        //Without java 8
        List<String> finalList = new ArrayList<>();
        ListIterator iterator = stringList.listIterator();
        while(iterator.hasNext()){
            String element = String.valueOf(iterator.next());
            if(element.contains("a")){
                finalList.add(element);
            }
        }
        System.out.println("Without java 8: Number of words having a: "+ finalList);
    }

    private static void findMaximumElement(List<Integer> unsortedList) {
        //With java 8
        System.out.println("With java 8: Max element is: "+ unsortedList.stream().max(Comparator.comparingInt(Integer::intValue)).get());
        //Without java 8
        int i = 1;
        int max = unsortedList.get(0);
        while(i < unsortedList.size()){
            if(max < unsortedList.get(i)){
                max = unsortedList.get(i);
            }
            i++;
        }
        System.out.println("Without java 8: Max element is: "+ max);
    }

    private static void sumOfAllNumbers(List<Integer> integerList) {
        //Using java 8
        System.out.println("With java 8: Sum is: " + integerList.stream().mapToInt(Integer::intValue).sum());
        //Without using java 8
        int i = 0;
        int sum = 0;
        while(i < integerList.size()){
            sum += integerList.get(i);
            i++;
        }
        System.out.println("Without java 8: Sum: "+ sum);
    }
}
