package The_07_31;

public class MemberTest {


    //실행클래스
    public static void main(String[] args) { //302동

        Member ss_health1 = new Member();//101호


        ss_health1.name = "홍길동";
        ss_health1.old = 30;
        ss_health1.phone = "010-1111-1111";
        ss_health1.email = "fc@naver.cm";
        ss_health1.home = "서울";
        ss_health1.kg = "57.6kg";


        Member ss_health2 = new Member();//102호

        ss_health2.name = "김진명";
        ss_health2.old = 23;
        ss_health2.phone = "010-2222-2222";
        ss_health2.email = "fc12@naver.cm";
        ss_health2.home = "부산";
        ss_health2.kg = "67.6kg";

        //삼성 지점 sshelth 헬스센터
        Member[] 삼성 = new Member[2];
        삼성[0] = ss_health1;
        삼성[1] = ss_health2;


        //삼성 지점 회원의 리스트 출력

        for (int i = 0; i < 삼성.length; i++) {
            Member member = 삼성[i];
            System.out.println(member.name);
        }


    }


}
