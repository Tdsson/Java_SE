package day20_code.src;

import java.util.ArrayList;

import java.util.Scanner;

public class ListTest{
    @SuppressWarnings("ALL")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();

        while(true){
            System.out.println("输入员工编号");
            int id = input.nextInt();

            System.out.println("输入员工姓名");
            String name = input.next();

            System.out.println("输入员工薪资");
            double salary = input.nextDouble();


            list.add(new Employee(id,name,salary));

            System.out.println("是否录入所有员工(Y/N)");
            char select = input.next().charAt(0);
            if(select == 'y' || select == 'Y' ){
                break;
            }
        }

        for (Object object :list) {
            System.out.println(object);
        }

    }

}
