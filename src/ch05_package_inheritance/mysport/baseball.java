package ch05_package_inheritance.mysport;

public class baseball extends sport {
    private int innings;//이닝
    private double hitrate;//타율

    public baseball(String gameName, int entry, String manName, int point, double hitrate, int innings) {
        super(gameName,entry,manName,point);
        this.hitrate=hitrate;
        this.innings=innings;
    }


    public void printinfo() {
        super.showinfo();
        System.out.print(this.hitrate+"%라는 타율을 갖고  매번 "+this.innings+"개의 이닝을 소화 하였습니다.");
    }
}
