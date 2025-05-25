package model;

import java.util.List;

public class Employees {

    private Integer employeeId;
    private Double salary;
    private String name;
    private Integer age;
    private String gender;

    public Employees(Integer employeeId, Double salary, String name, Integer age, String gender) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static List<Employees> getEmployees(){
        return List.of(new Employees(1,20000.00,"EmpOne",21, "male"),
                new Employees(2, 30000.00,"EmpTwo", 22, "male"),
                new Employees(3, 40000.00, "EmpThree", 23,  "female"));
    }
}
