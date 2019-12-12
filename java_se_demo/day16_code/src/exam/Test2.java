package com.tdsson.exam;
//判断101-200之间有多少个素数，并输出所有素数
public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
       for(int i = 101;i<=200;i++){

           int temp = 0;
           for(int j = 1;j<=i;j++){
               if(i%j==0){
                   temp+=1;
               }
           }
           if(temp == 2){
               System.out.print(i+"、");

               sum+=1;
           }

       }
        System.out.println();
        System.out.println("101-200之间有"+sum+"个素数");
    }
}
