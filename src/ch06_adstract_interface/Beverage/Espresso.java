package ch06_adstract_interface.Beverage;

public class Espresso extends Beverage{
    private int shoutCount;

    public Espresso (String name, double price, int shotCount) {
        super(name,price);
        this.shoutCount=shotCount;
    }

    @Override
    public void drink() {
        String message="맛이 진하고 강렬한 "+super.name+"를 마십니다.";
        System.out.println(message);
    }

    @Override
    public void make() {
        System.out.println(super.name+"의 제조법================================");
        String message = "로스팅 된 원두를 곱게 갈아준 뒤 템퍼로 지긋이 평평해질 때까지 눌러줍니다.";
        System.out.println(message);
        message="포터 필터를 머신에 장착 후 25~30초 정도 "+shoutCount+"ml의 양을 추출해주면 완성입니다.";
    }
}
