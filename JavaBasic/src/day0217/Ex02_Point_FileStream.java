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
                System.out.println(data); //char�� ������ ��ȯ >> Ascii Code
                System.out.println("���� " + (char)data); //�ѱ��� �ȵ�
                fos.write(data); //write �Ϸ��� ������ ������ �����ϰ� ����
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
