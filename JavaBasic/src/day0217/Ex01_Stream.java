package day0217;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
Stream 중간 매개체 >> 바이트가 지나갈 수 있는 통로 (default : Byte)

추상클래스
 * inputStream , outputStream >> 입출력하는 대상에 따라 >> 두개의 클래스를 상속받아 >> 재정의 해서 써라
 1. Memory : ByteArrayInputStream ... , ByteArrayOutputStream
 2. File : FileInputStream... , FileOutputStream

 */
public class Ex01_Stream {
    public static void main(String[] args){
    //byte : -128 ~ 127
        byte[] inSrc = {0,1,2,3,4,5,6,7,8};
        byte[] outSrc = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc); //inSrc 배열(메모리)에 빨대를 꽂음 >> read
        output = new ByteArrayOutputStream(); //write

        System.out.println("outSrc befor " + Arrays.toString(outSrc));

        int data=0;
        while((data = input.read())!=-1){ // 더이상 read data가 없으면 -1
            System.out.println("data : " + data);

            //read한 데이터를 다른메모리에 write
            output.write(data);
            //write 대상이 data 가  아니고 data를 read한다음에
            //ByteArrayOutputStream 자신한테 write 한다.
        }
        outSrc = output.toByteArray();





    }
}
