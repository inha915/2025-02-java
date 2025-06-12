package ch07.sec02;

public class SmartPhone extends Phone{

    public boolean wifi;

    public SmartPhone(String model, String color){
        //부모의 기본 생성자 호출은 자동으로 들어감. super();
        //이때 부모 클래스에 기본 생성자가 없다면 오류가 발생하므로
        // 부모에게 존재하는 생성자를 직접 명시해서 호출.

        super(model, color);
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }

    @Override
    public void bell() {
        System.out.println("스마트폰이 울린다!!");
    }
}