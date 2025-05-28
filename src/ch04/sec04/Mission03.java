package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star =(int)(Math.random()*6.0)+3;

        System.out.printf("star: %d\n",star);
        for(int a=0; a<star; a++){
            for(int b=0; b<star; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
