package control.legacy;

import control.GenelecWoofer;
import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {
    //삼성 Tv는 스피커를 사용할 수 있다.
    //스피커는 HarmanSpeaker를 사용한다
    @Override
    public void sound() {

    }
   private Speaker speaker;

    public SamsungTv(){
        System.out.println("삼성티비소리");
        this.speaker = new HarmanSpeaker();
    }
}
