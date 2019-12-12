package day22_code.src;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    @SuppressWarnings("all")
    public static void main(String[] args) throws IOException {
        //建立IO流
        FileReader fr = new FileReader("C:\\Users\\D.E\\Desktop\\Items.txt");
        //读取文件
        char[] data  = new char[5];
        StringBuilder str = new StringBuilder();
        while(true){
            int len = fr.read(data);
            if(len ==  -1){
                break;
            }
            str.append(new String(data,0,len));
        }
        System.out.println(str);
        //关闭IO流
        fr.close();
    }
}
