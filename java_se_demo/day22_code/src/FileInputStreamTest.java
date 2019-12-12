package day22_code.src;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //1.建立连接
        FileInputStream fis = new FileInputStream("C:\\Users\\D.E\\Desktop\\Items.txt");

        //2.获取文件内容
        byte[] data = new byte[5];
        StringBuilder s = new StringBuilder();
        while(true){
            int len = fis.read(data);
            if(len == -1){
                break;
            }
            s.append(new String(data,0,len));
        }
        System.out.println(s);

        //3.关闭IO流
        fis.close();
    }
}
