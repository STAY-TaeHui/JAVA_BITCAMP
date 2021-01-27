package day0119;
//이름,나이,국어,영어,수학
//총점,평균,졸업여부에 해당한느 변수를 만들고
//전부다 출력하는 프로그램을 작성
public class Ex08Gradebook {
    public static void main(String args[]) {
        String name = "Taehui";
        int age = 26;
        int koreanGrade = 90;
        int english = 100;
        int math = 95;
        int total = koreanGrade+english+math;
        double avg = total/3;
        boolean grade = false;
        
        System.out.println("이름 : "+name);
        System.out.println("AGE : "+age);
        System.out.println("KOREAN GRADE : "+ koreanGrade);
        System.out.println("ENGLISH : " + english);
        System.out.println("MATH : " + math);
        System.out.println("TOTAL POINT : " + total);
        System.out.println("AVG POINT : " + avg);
    }
}
