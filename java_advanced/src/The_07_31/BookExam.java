package The_07_31;

public class BookExam {

                //실행클래스


    public static void main(String[] args) {
        Book book1 = new Book();
        book1.price = 10000;
        book1.title = "자바의 정석";
        book1.company = "KK";
        book1.isbn = "123456";
        book1.author = "남궁성";
        book1.page = 500;



        // 속성 출력
        System.out.printf("\"%s\"의 가격은 %d 이고 저자는 %s입니다.");

    }

}
