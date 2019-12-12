package com.tdsson.interface_test1;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(3);
        circles[1] = new Circle(2);

        GraphicTools graphicTools = new GraphicTools();

        graphicTools.sort(circles);

        for (Circle circle:circles) {
            System.out.println(circle.getRadius());
        }
    }
}
