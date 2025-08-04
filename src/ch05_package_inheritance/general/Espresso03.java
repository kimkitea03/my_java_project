package ch05_package_inheritance.general;

public class Espresso03 extends beverage03 {
    private int soutCount; // 샷 추가 개수

    public Espresso03(String name, double price, int soutCount) {
        super(name,price);
        this.soutCount=soutCount;
    }


    public void printinfo() {
        super.showinfo();
        System.out.println("샷 추가 개수" + this.soutCount);
        System.out.println();
    }
}
