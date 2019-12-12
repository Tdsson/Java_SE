package com.tdsson.view;

import com.tdsson.service.ItemService;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExamView {
    int score = 0;
    char[] answers;

    ItemService itemService = new ItemService();

    //在方法中读取键盘键入值（每次只取键入序列的第一个键值），
    // 判断键值应为a、b、c、d、n、p键（包括大小写）值之一时，将其作为方法返回值，否则忽略不计；
    public char getUserAction() {
        char[] answers = {'A', 'B', 'C', 'D', 'N', 'P','F','Y'};
        Scanner input = new Scanner(System.in);
        char answer = input.next().toUpperCase().charAt(0);

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == answer) {
                return answer;
            }
        }
        return '0';
    }

    //该方法显示参数no指定的考题内容；
    public void displayItem(int no) {
        ItemService itemService = new ItemService();
        System.out.println(itemService.getItem(no));
    }

    //在方法中：
    //初始时，调用 displayItem显示考题第1题；
    //调用 getUserAction方法，判断当用户键入n时，显示下一题；当用户键入p时，显示上一题（如果当前不是第1题时）；
    @SuppressWarnings("all")
    public void testExam() {
        answers = new char[itemService.getlength()];
        Scanner input = new Scanner(System.in);
        int i = 1;
        boolean flag = true;
        do {
            System.out.println("--------------主菜单-------------");
            System.out.println("1.进入考试系统");
            System.out.println("2.查看上次考试成绩");
            System.out.print("请输入你的选择:_");
            int choose = input.nextInt();
            if(choose != 1 && choose != 2){
                System.out.print("输入有误请重新输入;_");
            }
            switch (choose) {
                case 1:
                    flag = false;
                    break;
                case 2:
                    int pscore = readScore();
                    System.out.println("-----------------------------");
                    System.out.println("上次考试成绩为:" + pscore);
                    System.out.print("输入N回到主菜单:_");
                    int choose1 = getUserAction();
                    if (choose1 == 'N') {
                        break;
                    }
            }
        } while(flag);

        System.out.println("---------欢迎进入考试系统----------");
        System.out.println("按键定义如下:");
        System.out.println("N 下一题  P 上一题  A,B,C,D 作出选择  F 退出考试并查看考试成绩");
        while (true) {
            System.out.println("请按N键开始考试:_");
            char select = getUserAction();
            if (select == 'N') {
                break;
            }
        }
        displayItem(i);
        System.out.print("请输入你的答案:_");
        while (true) {
            char select = getUserAction();
            if (select == 'A' || select == 'B' || select == 'C' || select == 'D') {
                answers[i - 1] = select;
                System.out.println("答案保存成功！");
                while (true) {
                    //第一题
                    if (i == 1) {
                        System.out.println("输入(n/N)进行下一题:_");
                        while (true) {
                            char service1 = getUserAction();
                            if (service1 == 'N') {
                                displayItem(++i);
                                if (answers[i - 1] == 'A' || answers[i - 1] == 'B' || answers[i - 1] == 'C' || answers[i - 1] == 'D') {
                                    System.out.println("之前的答案:" + answers[i - 1]);
                                }
                                System.out.print("请输入你的答案:_");
                                break;
                            } else if (service1 == 'F') {
                                calcScore();
                            } else {
                                System.out.print("输入有误请重新输入:_");
                            }
                        }
                        break;
                    }
                    //最后一题
                    if (i == itemService.getlength()) {
                        System.out.print("已达最后一题！");
                        System.out.print("输入(n/N)结束本次考试/输入(p/P)返回上一题:_");
                        while (true) {
                            char service2 = getUserAction();
                            if (service2 == 'N') {
                                calcScore();
                                System.exit(0);
                            } else if (service2 == 'P') {
                                displayItem(--i);
                                if (answers[i - 1] == 'A' || answers[i - 1] == 'B' || answers[i - 1] == 'C' || answers[i - 1] == 'D') {
                                    System.out.println("之前的答案:" + answers[i - 1]);
                                }
                                System.out.print("请输入你的答案:_");
                                break;
                            } else if (service2 == 'F') {
                                calcScore();
                            } else {
                                System.out.print("输入有误请重新输入:_");
                            }
                        }
                        break;
                    }

                    System.out.print("输入(n/N)进行下一题/输入(p/P)返回上一题:_");
                    while (true) {
                        char service3 = getUserAction();
                        if (service3 == 'F') {
                            calcScore();
                        } else if (service3 == 'N') {
                            displayItem(++i);
                            if (answers[i - 1] == 'A' || answers[i - 1] == 'B' || answers[i - 1] == 'C' || answers[i - 1] == 'D') {
                                System.out.println("之前的答案:" + answers[i - 1]);
                            }
                            System.out.print("请输入你的答案:_");
                            break;
                        } else if (service3 == 'P') {
                            displayItem(--i);
                            if (answers[i - 1] == 'A' || answers[i - 1] == 'B' || answers[i - 1] == 'C' || answers[i - 1] == 'D') {
                                System.out.println("之前的答案:" + answers[i - 1]);
                            }
                            System.out.print("请输入你的答案:_");
                            break;
                        } else {
                            System.out.print("输入有误请重新输入:_");
                        }
                    }
                    break;
                }
            } else {
                System.out.print("输入有误请重新输入:_");
            }
        }
    }

    //该方法实现分数计算
    public void calcScore() {
        System.out.println("是否确认退出考试(Y/N)");
        char select1 = getUserAction();
        if (select1 == 'Y') {
            itemService.saveAnswer(answers);
            System.out.println("\t\t你的答案\t正确答案");
            for (int i = 0; i < itemService.getlength(); i++) {
                System.out.print("第" + (i + 1) + "题");
                System.out.print("\t\t"+answers[i]);
                System.out.println("\t\t\t"+itemService.getItem(i+1).getAnswer());
                if (answers[i] == itemService.getItem(i+1).getAnswer()) {
                    score += 10;
                }
            }
            saveScore();
            System.out.println("最终得分:_"+ score);
        }
        System.exit(0);
    }

    //该方法实现分数保存
    public void saveScore() {
        FileWriter fileWriter = null;
        try {
           fileWriter =  new FileWriter("score.txt");

           fileWriter.write(score);

           fileWriter.close();
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    //该方法实现读取分数
    public int readScore(){
        FileReader fileReader = null;
        int scores = 0;
        try {
            fileReader =  new FileReader("score.txt");

           scores = fileReader.read();

            fileReader.close();
        }catch (IOException e){
            e.getStackTrace();
        }

        return scores;
    }
}
