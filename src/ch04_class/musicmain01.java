package ch04_class;

public class musicmain01 {
    public static void main(String[] args) {
        music01[] music = {
            new music01("스쳐가는 인연이 되지 마요", "먼데이 키즈", "2025.04.13", 37.7),
            new music01("그랬다면", "김나영", "2015.06.06", 387.8)
        };

        for (int i = 0; i < music.length; i++) {
            music[i].disaplay();
        }

    }
}
