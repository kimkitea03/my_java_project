package ch05_package_inheritance.animaltest;

public class unicon extends animal implements bird,horse {
    private String name;
    private String gender;
    private String feed;//사료

    private int inispeed;//속도

    public unicon(String name, String gender, String feed) {
        this.name = name;
        this.gender = gender;
        this.feed = feed;

        if (this.gender=="M"){
            this.inispeed=bird.speed;
        }else {
            this.inispeed=horse.speed;
        }
    }

    @Override
    public void flutter() {
        String message= this.name+"이(가) 화려하게 날개를 퍼덕입니다.";

//        bird.super.flutter();
        System.out.println(message);
    }

    @Override // 구현체/구현 메서드
    public void fly() {
        String message=this.name+"이(가) 시속 "+bird.speed+"의 속도로 날아 갑니다.";
        System.out.println(message);
    }

    @Override
    public void run() {
        String message=this.name+"이(가) 시속 "+horse.speed+"의 속도로 달려 갑니다.";
        System.out.println(message);
    }


    @Override
    public void eat() {
        String message=this.name+"이(가) 좋아하는 "+this.feed+"을(를) 먹습니다.";
        System.out.println(message);
    }

    public void display() {
        String message=this.name+"의 초기 속도는 "+this.inispeed+"입니다.";
        System.out.println(message);
        this.run();
        this.eat();
        this.fly();
    }

}
