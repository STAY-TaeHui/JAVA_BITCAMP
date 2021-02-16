package day0216;

import java.util.HashSet;
import java.util.Iterator;

class Myclass{
    private int id;
    private String name;

    public Myclass() {
    }

    public Myclass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Myclass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("학번 : " + this.id);
        System.out.println("이름 : " + this.name);
    }
}
public class Ex10_Set_Object {
    public static void main(String args[]){
        HashSet<Myclass> hset = new HashSet<Myclass>();
        hset.add(new Myclass(1,"홍길동"));
        hset.add(new Myclass(2,"김길동"));
        hset.add(new Myclass(3,"고길동"));
        hset.add(new Myclass(2,"김길동"));
        for(Myclass m : hset){
            m.displayInfo();
        }
        Iterator<Myclass> imy = hset.iterator();
        while(imy.hasNext()){
            imy.next().displayInfo();
        }
    }
}
