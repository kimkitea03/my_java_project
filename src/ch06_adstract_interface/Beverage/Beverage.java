package ch06_adstract_interface.Beverage;

public abstract class Beverage {
    protected String name;
    public double price;

    public Beverage(){

    }

    public Beverage(String name, double price){
        this.name=name;
        this. price=price;
    }
        public abstract void drink();
        public abstract void make();

    protected final void showDate(){
        System.out.println("음료 "+this.name+"의 단가는 "+this.price+"원 입니다.");
    }


}
