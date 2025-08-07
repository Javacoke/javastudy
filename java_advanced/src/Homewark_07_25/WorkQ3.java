package Homewark_07_25;

public class WorkQ3 {
    public static void main(String[] args) {

        // 연산자 연습문제3
        // 정수형 변수 a와 b를 만들고 각각 10으로 초기화한 후 다음과 같이 출력하는 프로그램을 작성하시오.
        // 출력
        // 최초값 a = 10, b = 10
        //a++ = 10, ++b =
        //11 실행후 a =  11, b = 11
        //
        //a-- = 11, --b =
        //10 실행후 a =  10, b = 10
        int a = 10;
        int b = 10;

        System.out.println("최초값 a = " + a + ", b = " + b + ' '); //%1$d ,%2$d 1번째 값을 넣으세요, 2번째 값을 넣으세요
        System.out.println("\n");
        System.out.printf("a++ = " + a++ + ", ++b = \n" + ++b + ' ');
        System.out.printf("실행후 a =  " + a + ", b = " + b + ' ');

        System.out.println("\n");
        System.out.printf("a-- = " + a-- + ", --b = \n" + --b + ' ');
        System.out.printf("실행후 a =  " + a + ", b = " + b + ' ');


    }
}
