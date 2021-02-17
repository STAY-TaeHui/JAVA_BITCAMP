package day0217;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*

 */
public class Ex02_Point_FileStream {
    public static void main(String [] args){
        FileInputStream fs = null;
        FileOutputStream fos = null;
        String path = "C:\\Temp2\\a.txt";

        try{
            fs = new FileInputStream(path);
            fos = new FileOutputStream("C:\\Temp2\\new.txt");
            int data = 0;
            while((data=fs.read()) != -1){
                System.out.println(data); //char를 정수로 변환 >> Ascii Code
                System.out.println("문자 " + (char)data); //한글은 안됨
                fos.write(data); //write 하려는 파일이 없으면 생성하고 저장
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
