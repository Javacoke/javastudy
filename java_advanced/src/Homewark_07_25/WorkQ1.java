package Homewark_07_25;

import java.util.Scanner;

public class WorkQ1 {
    public static void main(String[] args) {
        //연산자 연습문제1
        //두 개의 정수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
        //입력:두 개의 수를 입력하시오. 7 5
        //출력:
        //7 + 5 = 12
        //7 - 5 = 2
        //7 * 5 = 35
        //7 / 5 = 1
        //7 % 5 = 2
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 수를 입력하시오. 7 5");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.printf("%d + %d = %d \n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d \n", n1, n2, n1 - n2);
        System.out.printf("%d * %d = %d \n", n1, n2, n1 * n2);
        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        System.out.printf("%d %% %d = %d \n", n1, n2, n1 % n2);


    }
}












