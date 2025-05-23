package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {

        String name = "홍길동";
        String job ="프로그래머";
        System.out.println(name);
        System.out.println(job);

        name = job; // 주소값 복사 : 샬로우 카피(Shallow Copy), 얕은 복사
        System.out.println("1. " + name); // 1. 프로그래머
        System.out.println("2. " + job); // 2. 프로그래머

        String str ="나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        String str2 ="번호\t이름\t직업 ";
        System.out.println(str2);
        System.out.println("안녕하세요\t반가워요\t하하하하");

        String str3 = "나는\n자바를\n배웁니다.";
        System.out.println(str3);
    }
}
