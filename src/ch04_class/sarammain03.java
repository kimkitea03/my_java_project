package ch04_class;

public class sarammain03 {
    public static void main(String[] args) {
        saram03 yusin = new saram03();
        yusin.setName("김유신");
        yusin.setHeight(172.5);
        yusin.setWeight(75.0);
        yusin.setHobby("축구");
        yusin.setBlood("AB");

        saram03 soon = new saram03();
        soon.setName("유관순");
        soon.setHeight(165.5);
        soon.setWeight(55.0);
        soon.setHobby("야구");
        soon.setBlood("B");

        System.out.println("이름 : "+yusin.getName());
        System.out.println("키 : "+yusin.getHeight());
        System.out.println("몸무개 : "+yusin.getWeight());
        System.out.println("취미 : "+yusin.getHobby());
        System.out.println("혈액형 : "+yusin.getBlood());

        System.out.println("이름 : "+soon.getName());
        System.out.println("키 : "+soon.getHeight());
        System.out.println("몸무개 : "+soon.getWeight());
        System.out.println("취미 : "+soon.getHobby());
        System.out.println("혈액형 : "+soon.getBlood());
    }
}
