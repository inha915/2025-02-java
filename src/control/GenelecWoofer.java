package control;

import control.legacy.HarmanSpeaker;

public class GenelecWoofer implements Woofer{

    //인터페이스를 상속받을때는 오버라이딩이 아니라 임플리먼트라고 한다
    @Override
    public void baseSound() {
        System.out.println("Genelec Woofer: 웅 ! 웅 ! 웅 !");
    }
}
