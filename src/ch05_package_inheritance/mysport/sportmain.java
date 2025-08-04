package ch05_package_inheritance.mysport;

public class sportmain {
    public static void main(String[] args) {
        football foot = new football("축구",11,"전진우",12,42,23);
        baseball base = new baseball("야구",9,"디아즈", 74,0.305,9);

        foot.printinfo();
        base.printinfo();


    }

}
