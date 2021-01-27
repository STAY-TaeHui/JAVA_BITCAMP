package day0119;
import java.util.*;
public class task_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double height;
        double weight;
        double BMI;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("HEIGHT : ");
        height = sc.nextDouble();
        
        System.out.println("WEIGHT : ");
        weight = sc.nextDouble();
        
        BMI = (weight /(height*height)*10000);
        
        System.out.printf("BMI : %.2f",BMI);
        
    }

}
