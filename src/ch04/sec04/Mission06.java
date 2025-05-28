package ch04.sec04;

public class Mission06 {
    public static void main(String[] args) {
        /*
        1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰수가 무엇인지 알아내기

         */
        int sum=0;
        for(int i=1; ; i++){
            if(i+sum>100){
                System.out.println(i-1);
                break;
            }
               sum+=i;
        }
    }
}
