package control.ioc;


import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker(Woofer woofer){
        this.woofer = woofer;
    }

    @Override
    public void speakSound() {
        System.out.println("JBLSpeaker: jbl사운드");
        this.woofer.baseSound();
    }
}
