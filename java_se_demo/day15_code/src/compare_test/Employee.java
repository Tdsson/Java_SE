package com.tdsson.compare_test;

import java.util.Date;

public class Employee implements Comparable{
    private int eid;
    private String ename;
    private Date hiredate;
    private double salary;

    public Employee() {
    }

    public Employee(int eid, String ename, Date hiredate, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.hiredate = hiredate;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        return this.eid-emp.eid;
    }
}
