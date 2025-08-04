package ch05_package_inheritance.general;

public class latte03 extends beverage03 {
    private String milkType;//우유의 타입

    public latte03(String name, double perice,  String milkType) {
        super(name,perice);
        this.milkType=milkType;
    }

    public void printinfo() {
        super.showinfo();
        System.out.println("우유 타입"+this.milkType);
    }
}
