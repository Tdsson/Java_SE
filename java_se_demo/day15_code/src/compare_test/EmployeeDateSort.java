package com.tdsson.compare_test;

import java.util.Comparator;

public class EmployeeDateSort implements Comparator{
        public EmployeeDateSort(){
         }
        @Override
        public int compare(Object o1, Object o2) {
            Employee emp1 = (Employee) o1;
            Employee emp2 = (Employee) o2;

            if(emp1.getHiredate().compareTo(emp2.getHiredate())<0){
                return -1;
            }else if (emp1.getHiredate().compareTo(emp2.getHiredate())> 0){
                return 1;
            }
            return 0;
        }
    }
