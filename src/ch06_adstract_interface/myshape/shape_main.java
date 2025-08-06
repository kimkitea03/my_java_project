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
            System.out.println();
        }
    }
}
