package ch02.sec01;

public class VariableInitExample {
    public static void main(String[] args) {

        int hour = 3;
        int min = 5;

        System.out.printf("%d시간 %d분\n", hour, min);
        System.out.printf("총 %d분", hour * 60 + min);
    }

}
