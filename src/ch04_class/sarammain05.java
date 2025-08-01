package ch04_class;

public class sarammain05 {
    public static void main(String[] args) {
        //타입[] 배열명 = new 타입[요소개수];
        int[]arr=new int[3];
        saram05[] saram = new saram05[2];//배열 정의

        saram[0]=new saram05("이순신",180.5,75.0,"농구","AB");//0번째 객체 생성

        saram[1]=new saram05("김유신",180.2,70.0,"O");

        for (int i = 0; i <saram.length ; i++) {
            saram[i].display();


        }
        saram05[] my_list = {
                new saram05("박영희",150.5,55.0,"수영","B"),
                new saram05("최진철",180.2,66.0,"A")
        };
        for (int i = 0; i <my_list.length ; i++) {
            my_list[i].display();
        }
    }
}
