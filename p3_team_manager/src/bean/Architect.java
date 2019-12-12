package com.tdsson.bean;

public class Architect extends Designer{
    private int stock;//股票数

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getInfo() + "\t架构师\t" + getStatus() + "\t" +getBonus()+"\t"+stock + getEquipment().getDescription();
    }

    public String memberInfo(){
        return "/"+getInfo()+ "\t架构师\t"+getBonus()+"\t"+stock;
    }
}
