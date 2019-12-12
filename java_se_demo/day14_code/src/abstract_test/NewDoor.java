package com.tdsson.abstract_test;

public class NewDoor extends Door implements Method {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void guard() {
        System.out.println("防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }

    @Override
    public void bulletproof() {
        System.out.println("防弹");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void rustproof() {
        System.out.println("防锈");
    }
}
