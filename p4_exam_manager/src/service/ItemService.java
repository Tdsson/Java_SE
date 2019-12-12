package com.tdsson.service;

import com.tdsson.domain.Item;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ItemService {
    //该数组用来存储数据
    private Item[] items;
    //该方法获取对象存储到items数组中
    public ItemService() {
        List<Item> list = readTextFile("Items.txt");
        items = new Item[list.size()];
        for(int i = 0;i<items.length;i++){
            items[i] = list.get(i);
        }
    }

   //该方法创建answer.dat二进制文件，并将数组中的内容以对象形式写入到文件中保存；
   //	提示：使用对象序列化机制
    public void saveAnswer(char[] answer) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("answer.dat",true);
            oos= new ObjectOutputStream(fos);

            oos.writeObject(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos != null){
                    oos.close();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //该方法返回 ItemService中保存的由参数no指定的 Item对象
    public  Item getItem(int no){
       return items[no-1];
    }

    //该方法使用流的链接，以文本行的方式读取参数指定的文本文件内容，并放置到集合中以作为该方法的返回值；
    private List<Item> readTextFile(String filename) {
        FileReader fr = null;
        BufferedReader bufReader = null;
        List<Item> items = new ArrayList<Item>();

         try {
             //打开流
             fr = new FileReader(filename);
             bufReader = new BufferedReader(fr);
             //处理数据
             while(true){

                 //7行为一个对象，每次循环处理一个对象
                 String line1 = bufReader.readLine();//题目
                 String line2 = bufReader.readLine();//A
                 String line3 = bufReader.readLine();//B
                 String line4 = bufReader.readLine();//C
                 String line5 = bufReader.readLine();//D
                 String line6 = bufReader.readLine();//答案
                 String line7 = bufReader.readLine();//这一行要读,但是读到值其实没有什么用.
                 if(line1 == null){
                     break;
                 }
                 items.add(new Item(line1,line2,line3,line4,line5,line6.charAt(0)));
             }
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             if(bufReader != null){
                 try {
                     bufReader.close();
                     fr.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }
         return items;
     }

     //该方法获取当前题库数目
    public int getlength(){
        return items.length;
    }

}

