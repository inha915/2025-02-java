package ch06.sec08.exam03;
/*
     접근 제어자 (Access Modifier)
     private - 같은 클래스 안에서만 접근 가능
     default - private + 같은 패키지는 접근 가능 (잘 사용 안함)
     protected - default + 상속 관계는 접근 가능
     public - 무조건 접근 가능

     private 멤버 필드에 값 대입 방법 두가지
     - 생성자
     - (setter) 메소드

     private 멤버 필드에 값 읽기 방법 한가지
     = (getter) 메소드
 */
public class Car {
    private int gas; //private 멤버 필드
    private int oil;

    public Car(){

    }
    public Car(int gas, int oil){
        this.gas = gas;
        this.oil = oil;
    }


    public  void setGas(int i) {
        System.out.println(i);
    }
    public void setOil(int i){
        System.out.println(i);
    }

    public int getGas() {
        return gas;
    }
    public int getOil() {
        return oil;
    }
}
