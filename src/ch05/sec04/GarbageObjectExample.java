package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby ="여행"; //String 객체의 주소값이 hobby 변수에 대입
        hobby = null; //여행문자열을 가지고 있는 String 객체는 쓸수없음
        
        String kind1 ="자동차";
        String kind2 =kind1;
        kind1 = null;

    }
}
