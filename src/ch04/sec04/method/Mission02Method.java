package ch04.sec04.method;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(2, 6); //[2, 3, 4, 5, 6]
        printNumberFromTo(12, 16);//[12, 13, 14, 15, 16]
    }
    public static void printNumberFromTo(int n1, int n2){
        System.out.print("[" + n1);
        for(int i = n1; i < n2; i++){
            System.out.print(", " + (i + 1));
        }
        System.out.println("]");
    }
}
