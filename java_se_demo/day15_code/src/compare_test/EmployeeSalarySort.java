package com.tdsson.compare_test;

import java.util.Comparator;

class EmployeeSalarySort implements Comparator {
    public EmployeeSalarySort() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;

        if(emp1.getSalary()-emp2.getSalary()<0){
            return 1;
        }else if (emp1.getSalary() - emp2.getSalary()> 0){
            return -1;
        }
        return 0;
    }
}
