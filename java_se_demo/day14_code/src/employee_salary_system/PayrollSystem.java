package com.tdsson.employee_salary_system;
//定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
// 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象的实发工资。
// 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要体现增加工资信息。
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] all = new Employee[2];
        all[0] = new SalariedEmployee("001", "唐德松", new MyDate(1998, 9, 19), 1500, 24,24);
        all[1] = new HourlyEmployee("002", "宋梦雨", new MyDate(1998, 5, 30), 12, 9);

        Scanner input = new Scanner(System.in);
        System.out.print("请输入要查询的月份:_");
        int month = input.nextInt();

        for (Employee employee : all) {
            System.out.print(employee.toString());
            if (month == employee.getBirthday().getMonth()) {
                System.out.println(",当月薪资：" + (employee.earnings() + 100));
            }else{
                System.out.println(",当月薪资：" + employee.earnings());
            }
        }

    }
}
