package day0215;

import kr.or.bit.Emp;
import kr.or.bit.Emp_Array;

import java.util.ArrayList;

public class Ex03_ArrayList_Object {
    public static void main(String [] args){
        Emp_Array emp = new Emp_Array(100, "김유신", "군인");
        System.out.println(emp.toString());

        //사원 2명을 만드세요.
        Emp_Array[] emplist = {new Emp_Array(101,"김씨","일반"), new Emp_Array(200, "빡씨", "학생")};
        for(Emp_Array e : emplist){
            System.out.println(e.toString());
        }

        //사원 1명 추가해주세요!!
        ArrayList elist = new ArrayList();
        elist.add(new Emp_Array(1,"강","IT"));
        elist.add(new Emp_Array(2,"김","IT"));
        elist.add(new Emp_Array(3,"박","IT"));
        for(int i=0; i<elist.size(); i++){
            System.out.println(elist.get(i));
//            Emp_Array e = elist.get(i); >> elist.get()은 Object타입을 반환하기때문에  타입변환 필요 - 제너릭
            Object obj = elist.get(i);
            Emp_Array e = (Emp_Array)obj;
        }
        for(Object e : elist){
            //목적에 따라서 다운캐스팅이 필요할 수 도 있다.

          Emp_Array e2 = (Emp_Array)e;
            System.out.println(e2.toString());
        }

        //Generic 타입 >> 객체 생성 타입 강제
        ArrayList<Emp_Array> list2 = new ArrayList<Emp_Array>();
        list2.add(new Emp_Array(1,"a","IT"));

        for(Emp_Array e : list2){
            System.out.println(e.getEmpno());
            System.out.println(e.getEname());
            System.out.println(e.getJob());
        }

    }
}
