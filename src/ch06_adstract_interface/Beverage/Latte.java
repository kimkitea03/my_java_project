package ch06_adstract_interface.Beverage;

public class Latte extends Beverage {
    private String milkType;

    public Latte(String name, double price, String milkType) {
        super(name,price);
        this.milkType=milkType;
    }


    @Override
    public void drink() {
        String message="부드럽고 크리미한 "+super.name+"를 마십니다.";
        System.out.println(message);
    }

    @Override
    public void make() {
        System.out.println(super.name+"의 제조법=====================================");
        String message = "추출된 에스프레소를 준비하고 "+milkType+"도 준비해줍니다.";
        System.out.println(message);
        message="컵에 에스프레소 2샷을 먼저 넣어주고 "+milkType+"를 250ml를 천천히 잔에 따라주면 됩니다.";
        System.out.println(message);
    }
}
