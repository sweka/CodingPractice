package collections;

import model.Employees;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Get Average and Total Salary of Employees in an Organization
 * Get Employee names whose age are below 22 and whose age are above 22
 */
public class AverageAndTotalSalaryOfOrganization {

    public static void main(String[] args) {
        System.out.println("Avg of sal: "+getEmployees().stream().collect(Collectors.averagingDouble(Employees::getSalary)));
        System.out.println("Sum of sal: "+getEmployees().stream().mapToDouble(Employees::getSalary).sum());
        DoubleSummaryStatistics doubleSummaryStatistics = getEmployees().stream().collect(Collectors.summarizingDouble(Employees::getSalary));
        System.out.println("Sum of Sal:"+ doubleSummaryStatistics.getSum() + "Avg of Sal: "+ doubleSummaryStatistics.getAverage()+
                "Max of Sal: "+doubleSummaryStatistics.getMax()+ "Count: "+ doubleSummaryStatistics.getCount());
        Map<Boolean, List<Employees>> partitionedMap = getEmployees().stream().collect(Collectors.partitioningBy(i -> i.getAge()>21));
        System.out.println(partitionedMap.get(true).stream().map(Employees::getName).collect(Collectors.toList()));
    }

    public static List<Employees> getEmployees(){
        return List.of(new Employees(1,20000.00,"EmpOne",21),
                new Employees(2, 30000.00,"EmpTwo", 22),
                new Employees(3, 40000.00, "EmpThree", 23));
    }
}
