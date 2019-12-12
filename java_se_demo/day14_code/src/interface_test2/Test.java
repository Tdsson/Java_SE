package com.tdsson.interface_test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("1.注册");
            System.out.println("2.登陆");
            System.out.println("选择业务:_");
            char select = input.next().charAt(0);
            String sc = input.nextLine();
            switch (select) {
                case '1':
                    System.out.print("请输入用户名:");
                    String username= input.nextLine();
                    System.out.print("请输入密码:");
                    String password = input.nextLine();
                    System.out.print("请输入邮箱:");
                    String email = input.nextLine();
                    System.out.print("请输入电话:");
                    String tell = input.nextLine();

                    boolean ack = userService.regist(new User(username, password, email, tell));

                    if (ack == true) {
                        System.out.println("注册成功");
                    } else {
                        System.out.println("注册失败");
                    }
                    break;
                case '2':

                    System.out.print("请输入用户名：");
                    String user = input.nextLine();
                    System.out.print("请输入密码：");
                    String pwd = input.nextLine();
                    User acks = userService.login(user,pwd);
                    if(acks==null){
                        System.out.println("登陆失败（用户名或密码错误）");
                    }else{
                        System.out.println("登陆成功！");
                    }
                    break;
            }
        }
    }
}
