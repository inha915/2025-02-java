package ch02.sec08;

public class CastingMethodExample {
    public static void main(String[] args) {
        double r1= division(10,3);
        System.out.println(r1);
    }
   public static double division(int i, int i1){
        return (double)i/i1;
   }
}
