package day0119;

public class Ex06Operator3 {
    public static void main(String args[]) {
        String str = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        
        System.out.println(str==str2);
        System.out.println(str2==str3);    
        
        System.out.println(str.equals(str3));
    }
    
}
