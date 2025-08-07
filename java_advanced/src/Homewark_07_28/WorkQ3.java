package Homewark_07_28;

import java.util.Scanner;

public class WorkQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("점수를 입력하세요");

        int score = in.nextInt();

        if (score >= 80) {
            System.out.println("축하합니다. 합격입니다.");
        }

        if (score < 80) {
            System.out.println("불합격입니다.");
        }


    }

}
