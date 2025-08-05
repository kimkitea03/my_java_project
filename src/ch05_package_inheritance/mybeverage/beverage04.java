package ch05_package_inheritance.mybeverage;

public class beverage04 {
    private String name;
    private double price;
    //메소드 은닉화 : 오버라이딩시 본의 아니게, 수퍼클래스의 메소드가 숨겨지는 현상을 일컫는 말입니다.
    //@으로 시작하는 항목들을 이노테이션(Annotation)이라고 부릅니다.
    @Override // 이 매소드는 오버라이딩 되었습니다.
    public String toString() {
        String message="품명 : "+this.name+", 단가 : " + this.price;
        return message;

    }

    public beverage04(){}

    public String getName() {
        return name;
    }


    protected void showInfo(){
        System.out.println("\n음료 이름 : "+this.name);
        System.out.println("단가 : "+this.price);
    }

    public beverage04(String name, double price) {
        this.name=name;
        this.price=price;
    }


}
