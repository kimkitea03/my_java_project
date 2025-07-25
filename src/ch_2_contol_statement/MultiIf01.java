package ch_2_contol_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 31;
        String C;

        if (temperature >= 35){
            C="폭염 경보";
        } else if (temperature >= 30) { // (temperature >= 30 && temaperature <35) 이렇게 해줘도 됨
            C="무더운 날씨";
        } else if (temperature >= 20) {// (temperature >= 20 && temaperature <30)
            C="퀘적한 날씨";
        }else if (temperature >= 10){// (temperature >= 10 && temaperature <20)
            C="쌀쌀한 날씨";
        }else {
            C="추운 날씨";
        }
        String message = temperature +"도는 "+C+"입니다.";
        System.out.println(message);
    }
}
