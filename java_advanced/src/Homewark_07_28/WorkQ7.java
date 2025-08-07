package Homewark_07_28;

import java.util.Scanner;

public class WorkQ7 {

    public static void main(String[] args) {

        System.out.println("숫자를 선택하세요.");

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("숫자를 선택하세요");
        number = in.nextInt();//이거 왜또 넣어?

        if (number==1) System.out.println("1. 삽입");
        else if (number==2) System.out.println("2. 출력");
        else if (number==3) System.out.println("3. 삭제");
        else System.out.println("숫자를 입력하세요");//이거 왜써어

        }


    }

