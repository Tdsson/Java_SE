package com.tdsson.exam;

//2、求1+2！+3！+...+20！的和
public class Test {
    public static void main(String[] args) {
//sum计算阶乘的总和
        long sum = 0;
        for(int i = 1;i<=20;i++){
            //temp计算每个数的阶乘
            long temp = 1;
            for(int j =  1;j<=i;j++){
                temp*=j;

            }
            System.out.println(i+"的阶乘为:"+temp);
            sum +=temp;
        }
        System.out.println(sum);
    }
}
