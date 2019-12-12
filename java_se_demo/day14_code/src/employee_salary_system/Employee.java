package com.tdsson.employee_salary_system;
//定义一个Employee类，该类包含：
//	private成员变量number编号，姓名name,生日birthday，其中birthday 为MyDate类的对象；
//	abstract方法double earnings()；toString()方法输出对象的name,number和birthday。
public abstract class Employee {
    private String number;
    private String name;
    private MyDate birthday;

    public Employee(String number, String name, MyDate birthday) {
        this.number = number;
        this.name = name;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    abstract double earnings();

    @Override
    public String toString() {
        return " 姓名='" + name + '\'' +
                ",编号='" + number + '\'' +
                ", 生日=" + birthday;
    }
}
