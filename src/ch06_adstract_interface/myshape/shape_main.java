package ch06_adstract_interface.myshape;

public class shape_main {
    public static void main(String[] args) {
        shape [] shapes = {
                new triangle("yellow","black",15.0,10.0),
                new rectangle("red","green",20.0,10.0),
                new circle("pink","bule",5.0,3.0,4.0)
        };

        for (int i = 0; i <shapes.length ; i++) {
            shapes[i].display();
            shapes[i].draw();
            System.out.println();

        }
        System.out.println("=========================================");
        System.out.println("추상 클래스는 불완전 클래스이므로 객체 생성이 불가능합니다.");
        System.out.println("즉 new 키워드 오른쪽에 올 수 없습니다.");
//        shape myshape = new shape();

        //Anonymous Inner Type은 불완전 메서드를 구체화 시키는 조건으로 객체 생성을 허락해주는 방식
        shape sample01 = new shape() {
            @Override
            public double calcAree() {
                return 0;
            }

            @Override
            public double calcperimeter() {
                return 0;
            }

            @Override
            public void display() {
                System.out.println("호호");
            }
        };

        for (int i = 0; i <3 ; i++) {
            sample01.display();

        }

        //추상 클래스는 참조 변수로는 사용 사능합니다.
        //추상 클래스 개체 = new 구현클래스()
        shape sample02 = new rectangle("blue","pink",10.0,15.0);
        sample02.draw();
    }
}
