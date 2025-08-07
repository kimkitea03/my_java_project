package ch06_adstract_interface.cartest;

public abstract class Car implements Speed,Radio,Desplay{
    //일반화) 모든 차들에게 공통적으로 적용 할 수 있는 변수들을 여기에 정의합니다.
    private String name;//차량 이름
    private int price;//단가
    private Key key;//열쇠의 종류

    protected int speed;

    @Override
    public String toString() {
        String message="이름 : "+this.name+"\n";
        message+= "단가 : "+this.price+"\n";
        message+= "열쇠 타입 : "+this.key+"\n";
        message+= "한글 이름 : "+this.key.getName()+"\n";
        return message;
    }

    public final void trunOn(){
        String message= this.key.getName()+"로 "+this.name+"의 시동을 킵니다.";
        System.out.println(message);
    }
    public final void trunOff(){
        String message=this.name+"의 시동을 끕니다.";
        System.out.println(message);
    }

    public Car(String name, int price, Key key) {
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public Car() { }

    public String getName() {
        return name;
    }

    // 최고 속도를 초과하면 허용 최고속도로 제한시키기
    protected int checkspeed() {
        int maxspeed =Speed.ALLOWED_MAX_SPEED;

        if (this.speed>=maxspeed){
            System.out.println(maxspeed+"km 이상 과속하지 마세요.");
            return maxspeed;

        }else{
            return this.speed;
        }
    }
}
