package day0216;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap<String, String>
HashMap<String, Emp>
HashMap<Integer, String> >> values 여러개의 값을 가진다.

 */
class Student{
    int kor;
    int math;
    int eng;
    String name;

    public Student(int kor, int math, int eng, String name) {
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kor=" + kor +
                ", math=" + math +
                ", eng=" + eng +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Ex14_HashMap {
    public static void main(String[] args) {
        //학생마다 ID
        HashMap<String, Student> sts = new HashMap<String, Student>();
        sts.put("kim", new Student(100, 99, 88, "홍길동"));
        sts.put("hong", new Student(100, 100, 100, "서태희"));
        Student std = sts.get("hong");
        System.out.println(std);


        //Tip 1.
        //Map key, value 관리
        Set set = sts.entrySet(); //entrySet() >> return Set >> key + "=" + value  >> 하나의 문자열로 만들어 관리
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Tip 2.
        //분리된 key, value 획특특
        for(Map.Entry m: sts.entrySet()){ //entrySet()을 Set에 담으면 key value가 합쳐지는데
                                            //이렇게 하면 key 와 value 를 따로 뽑을 수 있다.
            System.out.println(m.getValue());

        }
    }

}