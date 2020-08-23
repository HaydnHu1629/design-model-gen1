package com.haydn.practice.designmodelgen1.composite.concreteMod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author haydn
 * @create 2020/8/23 12:41
 */
public class Employee {

    private String name;
    private int id;
    private float salary;
    private List<Employee> subEmps = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", subEmps=" + subEmps +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public List<Employee> getSubEmps() {
        return subEmps;
    }

    //为当前员工添加直接下属
    public void addEmployee(Employee temp){
        this.subEmps.add(temp);
    }
    //为当前员工移除直接下属
    public void removeEmployee(Employee temp){
        this.subEmps.remove(temp);
    }
}
