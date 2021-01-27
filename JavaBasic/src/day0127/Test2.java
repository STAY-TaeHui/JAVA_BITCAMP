package day0127;

public class Test2 {
    public static void main(String args[]){
        int jumsu = ((int)(Math.random()*10)+1)*100;

        String Gift = new String("");
        switch (jumsu){/////////////////////////break; 없이 써봐라 **아
            case 1000 :{
                Gift+="TV ";
            }
            case 900 :{
                Gift+=",NotBook ";
            }
            case 800 :{
                Gift+=",Refrigerator ";
            }
            case 700 :{
                Gift+=",Beef Set ";
            }
            case 600 :{
                Gift += ",Tissue ";
                break;
            }
            default:{
                Gift+=",Tooth Brush ";
            }
        }
        System.out.println("점수는 : " + jumsu);
        System.out.print(Gift);
    }
}
