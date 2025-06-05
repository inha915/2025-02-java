package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');

        int val = getCharToInt('c');
    }

    public static int getCharToInt(char c) {
        return 0;
    }
    //return 메소드, void 메소드

    public static void printCharToInt(char ch) {
        System.out.printf("%c: %d\n",ch,(int)ch);

    }
}
