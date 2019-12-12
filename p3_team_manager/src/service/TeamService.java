package com.tdsson.service;

import com.tdsson.bean.*;

public class TeamService {
    private  final int MAX_MENMBER = 5;//开发团队最大成员数
    Programmer[] team = new Programmer[MAX_MENMBER];//保存团队各成员对象
    private  int total = 0;//记录团队成员实际人数

    //返回当前团队所有对象
    public  Programmer[] getTeam(){
        return team;
    }

    //向团队中添加成员 异常添加失败
    public  void addMember(Employee e) throws TeamException{
        //判断已满成员
       if(total >= team.length){
           throw new TeamException("添加失败，原因：成员已满，无法添加\n");
       }
       //判断非开发人员剩下的就是开发人员可以进行强转
       if(!(e instanceof Programmer)){
           throw new TeamException("添加失败，原因：该成员不是开发人员，无法添加\n");
       }
       Programmer p = (Programmer)e;
       //判断 休假人员/是否已经存在
        switch (p.getStatus()){
            case VOCATION:
                throw new TeamException("添加失败，原因：该员正在休假，无法添加\n");
            case BUSY:
                throw new TeamException("添加失败，原因：该员工已是团队成员\n");
        }

        //统计职位人数
       int architect = 0;
       int designer = 0;
       int programmer = 0;

        for(int i = 0;i<total;i++){
            if(team[i] instanceof Architect){
                architect++;
            }else if(team[i] instanceof Designer){
                designer++;
            }else if(team[i] instanceof Programmer){
                programmer++;
            }
        }

       if(p instanceof Architect & architect >= 1) {
           throw new TeamException("添加失败，原因：团队中只能有一名架构师\n");
       }else if(p instanceof Designer & designer >= 3) {
           throw new TeamException("添加失败，原因：团队中只能有二名设计师\n");
       }else if(p instanceof Programmer & programmer >= 4){
           throw new TeamException("添加失败，原因：团队中只能有三名程序员\n");
       }
        team[total] = p;
        total ++;
        p.setStatus(Status.BUSY);
    }


    //从团队中删除成员 异常删除失败
    public  void removeMember(int id) throws TeamException{
        int i = 0;
        for(;i< total;i++){
            if(team[i].getId() == id){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //不存在的话i会一直+到i=total
        if(i == total){
            throw new TeamException("删除失败，失败原因：找不到ID");
        }
        //用数组后一位赋值给前一位，最后一位赋值为null
        for (int n = i+1; n < total; n++) {
            team[n-1] = team[n];
        }
        team[--total] = null;
    }
}
