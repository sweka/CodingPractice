package collections;

import model.Employees;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static model.Employees.getEmployees;

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


}
