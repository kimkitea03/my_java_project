package ch06_adstract_interface.cartest;

public interface Speed {
    public static final int ALLOWED_MAX_SPEED=50;
    public abstract void speedup(int speed);//감속기
    public abstract void speeddoun(int speed);//감속기
}
