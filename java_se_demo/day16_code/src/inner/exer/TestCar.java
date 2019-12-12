package com.tdsson.inner.exer;

public class TestCar {
    public static void main(String[] args) {
        test(new Car() {
            @Override
            public void run() {
                System.out.println("匿名内部类实参");
            }
        });
    }
    public static void test(Car car){
        car.run();
    }
}
