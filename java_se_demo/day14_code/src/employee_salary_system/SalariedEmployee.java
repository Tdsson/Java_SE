package com.tdsson.employee_salary_system;
//定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。该类包括：
//	private成员变量monthlySalary；//月薪
//private 成员变量 workingDay;//本月出勤天数
//private 成员变量 totalDays;//本月总工作日天数，除了周末和假期
//实现父类的抽象方法earnings(),该方法返回月薪*出勤天数/本月总工作日；
//toString()方法输出员工类型信息及员工的name，number,birthday。
public class SalariedEmployee extends Employee {
    private double monthlySaraly;
    private double workingDay;
    private double totalDays;

    public SalariedEmployee(String number, String name, MyDate birthday, double monthlySaraly, double workingDay,double totalDays) {
        super(number, name, birthday);
        this.monthlySaraly = monthlySaraly;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    public double getMonthlySaraly() {
        return monthlySaraly;
    }

    public void setMonthlySaraly(double monthlySaraly) {
        this.monthlySaraly = monthlySaraly;
    }

    public double getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(double workingDay) {
        this.workingDay = workingDay;
    }

    public double getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(double totalDays) {
        this.totalDays = totalDays;
    }

    @Override
    double earnings() {
        return monthlySaraly*workingDay/totalDays;
    }

    @Override
    public String toString() {
        return super.toString()+" 员工类型:正式员工";
    }
}
