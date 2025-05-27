package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    /*
    커맨드창으로 값을 입력받고
    점수를 입력해주세요 > 60  (입력후 엔터)

    (점수가 60점 이상이면) "합격입니다"
    (아니다) "불합격입니다"

    출력되도록
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요> ");

        int score = scan.nextInt();


        String result="D";
        if(score < 0 || score > 100){
            result="잘못된 점수입니다";
        }else if(score>=90) {
            result="A";
        }else if(score>=80) {
            result="B";
        }else if(score>=70) {
            result="C";
        }
        System.out.println(result);
    }
}
