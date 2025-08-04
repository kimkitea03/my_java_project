package ch05_package_inheritance.mybeverage;

public class beverage04 {
    private String name;
    private double price;
    public beverage04(){}

    protected void showInfo(){
        System.out.println("\n음료 이름 : "+this.name);
        System.out.println("단가 : "+this.price);
    }

    public beverage04(String name, double price) {
        this.name=name;
        this.price=price;
    }


}
