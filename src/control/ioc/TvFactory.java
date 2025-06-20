package control.ioc;

import control.*;

public class TvFactory {
    //싱글톤으로 만드시오
    private TvFactory(){

    }
    private static TvFactory tvFactory = null;

    public static TvFactory getInstance(){
        if(tvFactory == null){
            tvFactory = new TvFactory ();
        }
        return tvFactory;
    }
    public Tv factory(String speakName, String wooferName){
        Woofer woofer = switch (wooferName){
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakName){
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };
        return new SamsungTv(speaker);
    }
}
