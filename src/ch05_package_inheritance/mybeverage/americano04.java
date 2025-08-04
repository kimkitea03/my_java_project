package ch05_package_inheritance.mybeverage;

public class americano04 extends beverage04 {
    private double waterAmount;


//    public void sipAmericano(){
//        String message = "아메리카노를 홀짝 홀짝 마십니다";
//        System.out.println(message);
//    }

    public americano04(String name, double price,double waterAmount) {
        super(name,price);
        this.waterAmount=waterAmount;
    }
    public void sipAmericano() {
        System.out.println("들어가는 물의 양 : "+this.waterAmount);
    }

}
