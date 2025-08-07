package Homewark_07_28;

import java.util.Scanner;

public class WorkQ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("주사위를 두 번 던진 결과를 입력하세요");
        int a = in.nextInt();
        int b = in.nextInt();

        if (a >= 4 && b >= 4) ;
        System.out.println("이겼습니다.");
            if (a >= 4 || b >= 4) ;
        System.out.println("비겼습니다.");
             if (a <= 4 || b <= 4) ;
        System.out.println("졌습니다.");


    }
}
