package com.tdsson.compare_test;

import java.util.Arrays;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Employee[] all = new Employee[4];

        all[0] = new Employee(2,"宋梦雨",new Date(1998-1900,5,30),3000);
        all[1] = new Employee(3,"袁杨",new Date(1997-1900,9,21),5000);
        all[2] = new Employee(1,"唐德松",new Date(1998-1900,9,19),10000);
        all[3] = new Employee(4,"冯树荣",new Date(1974-1900,4,24),4000);

        //按照日期从早到晚进行排序
        Arrays.sort(all);
        for (Employee employee:all){
            System.out.println(employee.toString());
        }
        System.out.println("-----------------------------------");
        //按照编号自然排序升序
        Arrays.sort(all);

        for (Employee employee:all){
            System.out.println(employee.toString());
        }
        System.out.println("-----------------------------------");

        //按照薪资定制排序降序
        all[0] = new Employee(2,"宋梦雨",new Date(1998-1900,5,30),3000);
        all[1] = new Employee(3,"袁杨",new Date(1997-1900,9,21),5000);
        all[2] = new Employee(1,"唐德松",new Date(1998-1900,9,19),10000);
        all[3] = new Employee(4,"冯树荣",new Date(1974-1900,4,24),4000);

        Arrays.sort(all,new EmployeeSalarySort());

        for (Employee employee:all){
            System.out.println(employee.toString());
        }
    }

}

