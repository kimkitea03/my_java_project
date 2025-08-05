package ch05_package_inheritance.mybeverage;

public class espersso04 extends beverage04 {
    private int shoutCount;


    public void drinkessopreso(){
        String message = "맛이 진하고 강렬한 "+super.getName()+"을(를) 마십니다.";
        System.out.println(message);
    }

    public espersso04( String name, double price, int shoutCount){
        super(name,price);
        this.shoutCount=shoutCount;
    }

    @Override
    public String toString() {
        String message = ", 샷 추가 : "+ this.shoutCount+ "번";
        return super.toString()+message;
    }
}
