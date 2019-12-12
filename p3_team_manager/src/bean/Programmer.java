package com.tdsson.bean;
/*
-memberId 用来记录成员加入开发团队后在团队中的ID
-status是项目自定义的枚举类型，表示成员的状态：
    FREE-空闲
    BUSY-已加入开发团队
    VOCATION-正在休假
-equipment 表示该成员领用的设备
 */
import com.tdsson.service.Status;

public class Programmer extends Employee{
    private int memberid;
    private Status status;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
        this.status = Status.FREE;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getInfo()+ "\t程序员\t"+ getStatus() + "\t\t\t\t" + getEquipment().getDescription();
    }

    public String memberInfo(){
        return "/"+getInfo()+ "\t程序员\t";
    }
}
