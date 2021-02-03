package kr.or.bit;

import java.util.Scanner;

public class Lotto_LeeDong {
    private int[] computerNumbers;
    private Scanner scanner;

    public Lotto_LeeDong() {
        computerNumbers = new int[6];
        scanner = new Scanner(System.in);
    }

    // 난수 생성
    private void computerNumber() {
        for (int i = 0; i < this.computerNumbers.length; i++) {
            this.computerNumbers[i] = (int)(Math.random() * 45 + 1);
        }

        numberDel();
        numberSort();
    }

    // 중복제거
    private void numberDel() {
        for (int i = 0; i < this.computerNumbers.length; i++) {
            for(int j=i+1; j<this.computerNumbers.length;j++) {
                if (this.computerNumbers[i] == this.computerNumbers[j]) {
                    this.computerNumbers[j] = (int) (Math.random() * 45 + 1);
                    j += -1;
                }
            }
        }
    }

    // 정렬
    private void numberSort() {
        for (int i = 0; i < this.computerNumbers.length - 1; i++) {
            if (this.computerNumbers[i] > this.computerNumbers[i + 1]) {
                int temp = this.computerNumbers[i];
                this.computerNumbers[i] = this.computerNumbers[i + 1];
                this.computerNumbers[i + 1] = temp;
                i = -1;
            }
        }
    }

    public void selectLottoNumbers() {
        while (true) {
            System.out.println("******************");
            System.out.println("1.당첨 예상번호 확인");
            System.out.println("2. 프로그램 종료***");
            System.out.println("******************");

            System.out.println("원하는 번호를 선택하세요.");
            System.out.print(">>");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                computerNumber();
                System.out.println("평균 : ");
                System.out.println("[    선택한 Lotto 번호    ]");
                System.out.printf("[%d][%d][%d][%d][%d][%d]\n", this.computerNumbers[0], this.computerNumbers[1],
                        this.computerNumbers[2], this.computerNumbers[3], this.computerNumbers[4],
                        this.computerNumbers[5]);
            } else if (userChoice == 2) {
                System.out.println("GOOD Lucky ~");
                break;
            }
        }

        scanner.close();
    }
}
