package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};


        System.out.println("season[0]: "+season[0]);

        int[] scores={83, 90, 87};

        int sum=0;

        for(int item : scores){
            sum+=item;

        }
        System.out.printf("총합: %d\n", sum);
        System.out.printf("평균: %f\n", (double)sum/scores.length);
    }
}
