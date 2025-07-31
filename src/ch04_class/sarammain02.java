package ch04_class;

public class sarammain02 {
    public static void main(String[] args) {
        System.out.println(saram02.nationality);

        saram02 yusin = new saram02();
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 70.0;
        yusin.hobby = "축구";
        yusin.blood = "AB";

        saram02 soon = new saram02();
        soon.name = "유관순";
        soon.height = 165.5;
        soon.weight = 70.0;
        soon.hobby = "야구";
        soon.blood = "B";

        yusin.nationality = "한국";
        //스테틱 변수를 이렇게 인위적으로 바꿀경우 이 시점 이후로는 전부 이 값으로 나옴. 따라서 잘쓰는 경우에는 좋지만 이걸 확인 못 한다면 값이 매우 이상해진다.
        System.out.println(soon.nationality);
        System.out.println(saram02.nationality);
        yusin.display();//메소드를 호출한다
        soon.display();

    }
}
