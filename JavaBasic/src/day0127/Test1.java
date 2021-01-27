package day0127;

public class Test1 {
    public static void main(String args[]){
        //1. 수학과 학생들의 기말고사 시험점수
        System.out.println("-------------1번 문제-------------");
        int[] score = new int[]{79, 88, 97, 54, 56, 95};
        int max = score[0];
        int min = score[0];

        for(int i=0; i<score.length; i++){///////삼항연산자 써봐라 **아
            if(max<score[i]){
                max=score[i];
            }
            if(min>score[i]){
                min=score[i];
            }
        }

        System.out.printf("max > %d , min > %d\n",max,min);


        //2. 10개의 방의값을 1~10까지 값으로 초기화
        System.out.println("-------------2번 문제-------------");
        int[] number = new int[10];
        for(int i=0; i<number.length;i++){
            number[i] = i+1;
        }
        for(int i: number){
            System.out.print(i+" ");
        }
        System.out.println();

        //3. 어느 학생의 기말고사 점수
        //   1. 총과목의 수
        //  2. 과목의 합
        //  3. 과목의 평균
        //  단, 2,3 문제는 하나의 for문으로 해결할 것
        System.out.println("-------------13 문제-------------");
        int sum=0;
        float average = 0f;
        int[] jumsu = {100,55,90,60,78};

        for(int i : jumsu){
            sum+=i;
        }
        for(int i : jumsu){
            average+=i;
        }
        average=average/ jumsu.length;

        System.out.println("1. 총 과목의 수 : "+jumsu.length);
        System.out.println("2. 과목의 합 : " + sum);
        System.out.println("3. 과목의 평균 : "+average);
    }
}
