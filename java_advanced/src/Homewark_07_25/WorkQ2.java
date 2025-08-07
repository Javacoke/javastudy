package Homewark_07_25;

import java.util.Scanner;

public class WorkQ2 {

    //연산자 연습문제 2-1
    //5개의 정수를 입력 받아 각각의 수에 + 3, - 3, × 3, / 3, % 3의 연산을 실행하여 그 값을 저장한 후
    // 차례대로 출력하는 프로그램을 작성하시오
    // 입력:5개의 수를 입력하시오. 10 5 7 9 10
    // 출력:13 2 21 3 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 수를 입력하시오. 10 5 7 9 10");
        int nu1 = sc.nextInt();
        int nu2 = sc.nextInt();
        int nu3 = sc.nextInt();
        int nu4 = sc.nextInt();
        int nu5 = sc.nextInt();
        int a = 3;
        System.out.println((nu1+a)+" "+(nu2-a)+" "+(nu3*a)+" "+(nu4/a)+" "+(nu5%a));







    }
}
