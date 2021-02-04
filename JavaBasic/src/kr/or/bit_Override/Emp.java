package kr.or.bit_Override;

public class Emp {
    private int empno;
    private String ename;

    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                '}';
    }
    //Object toString() 이거 원하면 재정의해서 써~
    //멤버필드의 값을 검증하려고 많이 썻음
}
