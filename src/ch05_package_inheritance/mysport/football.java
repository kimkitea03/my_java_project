package ch05_package_inheritance.mysport;

public class football extends sport{
    private int halves;//하프타임
    private int shooting;//유효슈팅

    public football(String gameName, int entry, String manName, int point, int shooting, int halves) {
        super(gameName,entry,manName,point);
        this.shooting=shooting;
        this.halves=halves;
    }

    public void printinfo() {
        super.showinfo();
        System.out.print(this.shooting +"번의 슈팅을 했으며 한 게임당"+this.halves+"번의 경기를 하였습니다.");
        System.out.println();
    }
}
