package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); //"남자"리턴
        String gender2 = checkGender("900212-2998756");//"여자"리턴

        //8번째 문자가 '2', '4' > 여자 리턴
        //8번째 문자가 '1', '3' > 남자 리턴
        //8번째 문자가 '1','2','3','4'가 아니면 null return

    }
    public static String checkGender(String gen){
        String result=null;
        switch (gen.charAt(7)){
            case '1', '3'-> System.out.println("남자");
            case '2', '4'-> System.out.println("여자");
        }
        return gen;
    }
}
