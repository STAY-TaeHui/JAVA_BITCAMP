package day0217;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
Stream �߰� �Ű�ü >> ����Ʈ�� ������ �� �ִ� ��� (default : Byte)

�߻�Ŭ����
 * inputStream , outputStream >> ������ϴ� ��� ���� >> �ΰ��� Ŭ������ ��ӹ޾� >> ������ �ؼ� ���
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

        input = new ByteArrayInputStream(inSrc); //inSrc �迭(�޸�)�� ���븦 ���� >> read
        output = new ByteArrayOutputStream(); //write

        System.out.println("outSrc befor " + Arrays.toString(outSrc));

        int data=0;
        while((data = input.read())!=-1){ // ���̻� read data�� ������ -1
            System.out.println("data : " + data);

            //read�� �����͸� �ٸ��޸𸮿� write
            output.write(data);
            //write ����� data ��  �ƴϰ� data�� read�Ѵ�����
            //ByteArrayOutputStream �ڽ����� write �Ѵ�.
        }
        outSrc = output.toByteArray();





    }
}
