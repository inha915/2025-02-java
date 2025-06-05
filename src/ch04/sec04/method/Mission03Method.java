package ch04.sec04.method;

import ch02.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star= ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star: "+star);

        //콘솔에 출력
        //5였다면 *****(개행)
        //3였다면 ***(개행)
        printSingleLine(star);
        System.out.println("----------------------------");
        printMultiLine(star);
    }
    public static void printSingleLine(int star){
        for(int i=0; i<star; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printMultiLine(int star) {
        System.out.println("star: "+star);
        for (int k = 0; k < star; k++) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
