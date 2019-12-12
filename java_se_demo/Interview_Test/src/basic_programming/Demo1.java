package com.tdsson.basic_programming;


public class Demo1 {

    //1、用循环控制语句打印输出：1+3+5+...+99=?的结果
    public static void demo1(){
        int sum = 0;
        for(int i = 1;i<=99;i+=2){
            sum += i ;
        }
        System.out.println(sum);
    }

    //2、请写一个冒泡排序，实现{5,7,3,9,2}从小到大排序
    public static void demo2(){
        int[] arr = {5,7,3,9,2};

    }
}
