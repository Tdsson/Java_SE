package com.tdsson.exception.exer;

import java.util.Scanner;

public class UserView {
	private static Scanner input = new Scanner(System.in);
	private static UserService us = new UserService();

	public static void main(String[] args) {
		menu();

	}

	public static void menu(){
		while(true){
			System.out.println("--------异常练习----------");
			System.out.println("\t1、注册");
			System.out.println("\t2、登录");
			System.out.println("\t3、退出");
			System.out.print("请选择：");

			int select  = input.nextInt();
			input.nextLine();//为了读取那个回车键以防下面用nextLine()有问题
			switch(select){
				case 1:
					regist();
					break;
				case 2:
					login();
					break;
				case 3:
					System.out.print("确认是否退出");
					char confirm = input.nextLine().toUpperCase().charAt(0);
					if(confirm == 'Y'){
						return;
					}
			}
		}
	}

	private static void login() {
		System.out.println("---------登录---------");

		System.out.print("请输入用户名：");
		String username = input.nextLine();

		System.out.print("请输入密码：");
		String password = input.nextLine();

		try {
			User user = us.login(username, password);
			System.out.println("登录成功，欢迎" + user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("登录失败");
		}


		System.out.println("按回车键回到上一级....");
		String line = input.nextLine();
		return;
	}

	private static void regist() {
		System.out.println("--------注册--------");

		System.out.print("请输入用户名");
		String username = input.nextLine();

		System.out.print("请输入密码");
		String password = input.nextLine();

		System.out.print("请输入电话号码：");
		String tel = input.nextLine();

		System.out.print("请输入邮箱：");
		String email = input.nextLine();

		//注册用户
		User user = new User(username, password, tel, email);

		try {
			//添加用户
			us.addUser(user);
			System.out.println("注册成功");
		} catch (Exception e) {
			System.out.println("注册失败");
			System.out.println(e.getMessage());
		}

		System.out.println("按回车键回到上一级....");
		String line = input.nextLine();
		return;
	}

}
