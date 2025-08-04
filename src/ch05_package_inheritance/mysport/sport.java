package ch05_package_inheritance.mysport;

public class sport {
    private String gameName;//경기 이름
    private String manName;//선수 이름
    private int entry;//선수 명수
    private int point;//최다 득점

    public sport(){

    }

    public sport(String gameName, int entry, String manName, int point) {
        this.gameName=gameName;
        this.entry=entry;
        this.manName=manName;
        this.point=point;
    }

    protected void showinfo() {
        System.out.println(this.gameName+"는 "+this.entry+"명이 경기를 뜁니다.");
        System.out.print(this.manName+" 선수는 "+this.point+"점을 득점했으며 ");
    }
}
