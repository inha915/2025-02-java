package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        gugudan(4);
        printNumberFromTo(4, 9);
        printNumberFromTo(2, 4);
    }
    public static void gugudan(int dan){
        for(int i=1; i<=9; i++){
            System.out.printf("%d x %d = %d\n",dan,i,dan*i);
        }
    }
    public static void printNumberFromTo(int sum, int sum2){
        for(int i=sum; i<sum2; i++) {
          gugudan(i);
        }
    }
}
