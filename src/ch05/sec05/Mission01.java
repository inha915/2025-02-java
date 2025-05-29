package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    /*
    주민번호를 입력하시오.(xxxxxx-xxxxxxx) >
    (만약) 주민등록번호 길이가 다르면 "잘 못 입력하셨습니다"
    (길이가 맞다면) 8번째 자리의 값으로 "여성","남성"출력해주세요
    (8번째 자리가 1~4가 아니라면) "잘 못 입력하셨습니다"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("주민번호를 입력하시오.(xxxxxx-xxxxxxx) > ");
        Scanner scanner=new Scanner(System.in);
        String ssn=scanner.next();
        char genNum =ssn.charAt(7);
        String gender="";

        if(ssn.length() !=13){
        switch (genNum) {
            case '1', '3':
                System.out.println("남자");
                break;
            case '2', '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("잘 못 입력하셨습니다");
        }}else{
                System.out.println("잘 못 입력하셨습니다");
            }
        }
    }

