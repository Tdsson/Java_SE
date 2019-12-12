package com.tdsson.test;

import com.tdsson.service.ItemService;
import com.tdsson.view.ExamView;


public class Exam {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        ExamView examView = new ExamView();

        examView.testExam();


//          getUserAction()方法测试
//
//        while(true){
//            System.out.println(examView.getUserAction());
//        }

//          getItem方法测试
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("输入考试题目(1-12):_");
//        int select = input.nextInt();
//        System.out.println(itemService.getItem(select));

//          saveAnswer方法测试
//        char[] answer ={'A','B','C','A','D','B','A','C','D','B','A'};
//        itemService.saveAnswer(answer);
    }
}
