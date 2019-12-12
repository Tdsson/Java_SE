package com.tdsson.enum_type.exer;

import java.util.Scanner;

public class TestPayment {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        int select =input.nextInt();

       Payment p =  Payment.getPaymentById(select);

        System.out.println(p);
    }
}
