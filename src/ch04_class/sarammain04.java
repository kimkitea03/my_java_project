package ch04_class;

public class sarammain04 {
    public static void main(String[] args) {
        saram04 soo = new saram04(); //김철수
        soo.display();
        saram04 hee = new saram04("박영희",162.5,52.5,"퀼트","AB");//박영희
        hee.display();

        //김유신에 대하여 생성자를 오버로딩하다
        //단, 입력하지 않는 취미의 기본값은 볼링이라고 가정한다.
        saram04 yusin = new saram04("김유신",175.5,70.5,"O");//박영희
        yusin.display();
        saram04 choi = new saram04("최유식",175.5,70.5,"B");//박영희
        choi.display();
    }
}
