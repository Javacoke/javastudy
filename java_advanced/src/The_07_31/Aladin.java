package The_07_31;

public class Aladin {

    public static void main(String[] args) {
        Book 전지적독자시점 = new Book();
        System.out.println(전지적독자시점);
        전지적독자시점.title = "전지적독자시점";
        전지적독자시점.author = "싱숑";
        전지적독자시점.company = "전지적독자시점";
        전지적독자시점.price = 13500;



        Book 견우와선녀 = new Book();
        System.out.println(견우와선녀);
        전지적독자시점.title = "견우와선녀";
        전지적독자시점.author = "안수민";
        전지적독자시점.company = "아르페탑";
        전지적독자시점.price = 18800;






        System.out.println(전지적독자시점.title);
        System.out.println(전지적독자시점.author);
        System.out.println(전지적독자시점.company);
        System.out.println(전지적독자시점.price);

        Book[] 판타지 = new Book[2];
        판타지[0] = 전지적독자시점;
        판타지[1] = 견우와선녀;

        System.out.println(판타지[1].title);
        System.out.println(판타지[1].author);
        System.out.println(판타지[1].price);


    }


}
