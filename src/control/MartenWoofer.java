package control;

public class MartenWoofer implements Woofer{

    //추상 메소드는 무조건 구현해야한다(=오버라이딩해야 한다)
    @Override
    public void baseSound(){
        System.out.println("Marten Woofer: 웅웅우");

    }
}
