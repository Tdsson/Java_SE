package com.tdsson.service;

import com.tdsson.bean.*;

import static com.tdsson.service.Data.*;

public class NameListService {
    private static Employee[] all;

    static {
        all = new Employee[EMPLOYEES.length];

        for (int i = 0; i < EMPLOYEES.length; i++) {
            //每i行的第1列是每个对象的ID
            int id  = Integer.parseInt(EMPLOYEES[i][1]);
            //每i行的第2列是每个对象的name
            String name = EMPLOYEES[i][2];
            //每i行的第3列是每个对象的age
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            //每i行的第3列是每个对象的age
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            int type = Integer.parseInt(EMPLOYEES[i][0]);
            switch (type){
                case 10:
                    all[i] = new Employee(id,name,age,salary);
                    break;
                case 11:
                    all[i] = new Programmer(id,name,age,salary,getEquipment(i));
                    break;
                case 12:
                    double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    all[i] = new Designer(id,name,age,salary,getEquipment(i),bonus);
                    break;
                case 13:
                    double bonuss = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    all[i] = new Architect(id,name,age,salary,getEquipment(i),bonuss,stock);
                    break;
            }
        }
    }
        //根据每行第一列获取设备
        public static Equipment getEquipment(int i){
            int type = Integer.parseInt(EQIPMENTS[i][0]);

            switch (type){
                case 21:
                    String model = EQIPMENTS[i][1];
                    String display = EQIPMENTS[i][2];
                    return new PC(model,display);
                case 22:
                    String models = EQIPMENTS[i][1];
                    double price = Double.parseDouble(EQIPMENTS[i][2]);
                    return new NoteBook(models,price);
                case 23:
                    String types = EQIPMENTS[i][1];
                    String name = EQIPMENTS[i][2];
                    return new Printer(types,name);
                default:
                    return null;
            }
        }

        //获取当前所有员工 返回包含所以员工对象的数组
        public Employee[] getAllEmployees () {
            return all;
        }

        //获取指定ID的员工对象 返回指定员工 异常找不到指定员工
        public Employee getEmployee(int id) throws TeamException{
            for(int i= 0;i<all.length;i++){
                if(all[i].getId() == id){
                    return all[i];
                }
            }
            throw new TeamException("添加失败，原因：员工ID不存在\n") ;
    }
}
