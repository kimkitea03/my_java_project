package ch04_class;

public class saram03 {
    private String name;
    //public 반환타입 메소드이름 (매개변수){}
    public void setName(String name){//()에 타입 (스페이스) 매개변수 이렇게 넣어야함
        this.name= name;
    }
    //public 반환타입 메소드이름(매개변수){}
    public String getName(){//반환타입이 void가 아니라서 return을 해줘야함
        return name;
    }

    private double height;
    public void setHeight(double height){
        this.height= height;
    }
    public double getHeight(){
        return height;
    }

    private double weight;
    public void setWeight(double weight){
        this.weight= weight;
    }
    public double getWeight(){
        return weight;
    }
    private String hobby;


    private String blood;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
