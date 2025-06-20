package control.legacy;

import control.GenelecWoofer;
import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer;

    public HarmanSpeaker(){
        this.woofer = new GenelecWoofer();
    }

    @Override
    public void speakSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요.");
        woofer.baseSound();
    }
}
