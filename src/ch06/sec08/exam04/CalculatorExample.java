package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        //한변의 길이가 40인 정사각형의 넓이를 구하시오
        double result = cal.areaRectangle(40);
        System.out.println("result: "+result);

        double rec = cal.areaRectangle(40,30);
        System.out.println("result: "+rec);
    }

}
