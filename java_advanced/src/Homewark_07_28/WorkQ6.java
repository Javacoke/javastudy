package Homewark_07_28;

import java.util.Scanner;

public class WorkQ6 {
    public static void main(String[] args) {

        //Math.max()를 이용하여 풀어보세요 이게 뭐여


        System.out.println(" 세 수를 입력하세요");

        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int temp1 = Math.max(n1,n2);
        int temp2 = Math.max(n2,n3);
        int maxValue = Math.max(temp1,temp2);

        //System.out.println("입력 받은 수 중 가장 큰 수는 %d", maxValue); Math.max가 뭐여



    }

}
