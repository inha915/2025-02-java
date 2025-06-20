package control.legacy;

import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker(){
        this.woofer = new MartenWoofer();
    }

    @Override
    public void speakSound() {
        System.out.println("JBLSpeaker: jbl사운드");
        this.woofer.baseSound();
    }
}
