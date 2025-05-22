package ch02.sec01;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; //2진수
        int var2 = 0206; //2진수
        int var3 = 365; //2진수
        int var4 = 0xB3; //2진수

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

        System.out.println("var3 - 2진수: " +Integer.toBinaryString(var3));
        System.out.println("var3 - 8진수: " +Integer.toOctalString(var3));
        System.out.println("var3 - 16진수: " +Integer.toHexString(var3));
    }
}
