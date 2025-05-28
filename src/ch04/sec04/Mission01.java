package ch04.sec04;

public class Mission01 {
    // 20~30 까지 모두 더한 값을 출력해주세요
    // for문 사용
    public static void main(String[] args) {
        int sum=0;

        for(int value =20; value<=30; value++){
            sum=sum+value;
        }
        System.out.println(sum);
    }
}
