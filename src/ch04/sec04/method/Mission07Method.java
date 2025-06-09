package ch04.sec04.method;

public class Mission07Method {
    public static void main(String[] args) {
        int[] scores = {90,88,100,70,60,90};

        double avg = getAverage(scores);
        System.out.printf("%f",avg);


    }

    public static double getAverage(int[] score){
        int sum = Mission05Method.addAllupArray(score);
        return ((double)sum) / score.length;
    }

}