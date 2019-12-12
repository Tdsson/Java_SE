package day20_code.src;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet set = new HashSet();

        while(true){
            System.out.println("输入员工编号");
            int id = input.nextInt();

            System.out.println("输入员工姓名");
            String name = input.next();

            System.out.println("输入员工薪资");
            double salary = input.nextDouble();


            set.add(new Employee(id,name,salary));

            System.out.println("是否录入所有员工(Y/N)");
            char select = input.next().charAt(0);
            if(select == 'y' || select == 'Y' ){
                break;
            }
        }

        for (Object object :set) {
            System.out.println(object);
        }
    }
}
