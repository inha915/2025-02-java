package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // 최우선 객채화 기본생성자함수 호출
        int result = cal.plus(1, 2);
        System.out.println("result : " + result);
        System.out.println("result2 : " + cal.plus(10, 20));
        System.out.println("result2: " + 30);

        for(int i=0; i<2000; i++){
            cal.powerOn();
        }
        cal.powerOn();
        System.out.println("끝");
    }
}
