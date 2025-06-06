import model.Employees;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        System.out.println(Employees.getEmployees().stream().collect(Collectors.groupingBy(Employees::getGender, Collectors.counting())));
        int[] nums = {1,2,3,11,4,5,6,7,8,19,9,8,7};
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.partitioningBy(i -> i%2==0, Collectors.summingInt(Integer::intValue))));
        Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().
                filter(i -> i.getValue()>1).forEach(i -> System.out.println(i.getKey()));
        Integer number = 7;
        System.out.println(Arrays.stream(nums).boxed().filter(i -> i!=number).collect(Collectors.toList()));
        String specialCharStr= "abc$%^&";
        specialCharStr.chars().mapToObj(i -> (char)i).filter(i -> !Character.isLetterOrDigit(i)).forEach(System.out::print);
        Arrays.stream(nums).boxed().map(String::valueOf).filter(i -> i.startsWith("1")).forEach(System.out::print);
        Employees.getEmployees().stream().max(Comparator.comparingDouble(Employees::getSalary)).ifPresent( i -> System.out.println(i.getName()));
        System.out.println(Arrays.asList("Apple","Banana", "Cherry").stream().collect(Collectors.joining(",")));
        System.out.println("aapple".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue()==1).map(Map.Entry::getKey).findFirst().orElseGet(() -> 'z'));
        Map<String, Integer> map= new HashMap<>();
        for(char c: "applr".toCharArray()){
            map.put(String.valueOf(c),map.getOrDefault(String.valueOf(c), 0)+1);
        }
        System.out.println(map);
        System.out.println(Arrays.asList("Apple","Banana", "Cherry").stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(Arrays.stream(nums).boxed().filter(i -> i >10).mapToDouble(Double::valueOf).average());
        System.out.println(Arrays.asList("Apple","Banana", "Cherry").stream().collect(Collectors.toMap(Function.identity(), String::length)));
        Employees.getEmployees().stream().sorted(Comparator.comparingDouble(Employees::getSalary).reversed()).limit(2).
                forEach(i -> System.out.println(i.getName()));
        char[] s1= "apple".toCharArray();
        for(int i=0; i<s1.length/2; i++){
            s1[i] = (char) (s1[i] + s1[s1.length-1-i]);
            s1[s1.length-1-i] = (char) (s1[i] -s1[s1.length-1-i]);
            s1[i] = (char) (s1[i] -s1[s1.length-1-i]);
        }
        System.out.println(s1);
        int largest =0;
        int secondLargest=-1;
        for(int i =0; i<nums.length; i++){

            if(nums[i]>=largest){
                secondLargest = largest;
                largest=nums[i];
            }else if(nums[i]>secondLargest){
                secondLargest = nums[i];
            }
        }
        System.out.println(largest+": "+secondLargest);
    }
}
