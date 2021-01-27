package day0119;
import java.util.*;
public class task_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a,b;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("A : ");
        a = sc.nextInt();
        System.out.println("B : ");
        b= sc.nextInt();
        
        System.out.printf("A + B = %d\n",a+b);
        System.out.printf("A - B = %d\n",a-b);
        System.out.printf("A * B = %d\n",a*b);
        System.out.printf("A / B = %d\n",(a/b));
        System.out.printf("A %% B = %d\n",a%b);
        
        sc.close();
        
    }

}
