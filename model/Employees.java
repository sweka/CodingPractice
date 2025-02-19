package model;

public class Employees {

    private Integer employeeId;
    private Double salary;
    private String name;
    private Integer age;

    public Employees(Integer employeeId, Double salary, String name, Integer age) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.name = name;
        this.age = age;
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
}
