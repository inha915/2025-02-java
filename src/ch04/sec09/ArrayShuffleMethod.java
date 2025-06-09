package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr =makeArrayFromTo(5,8);
        int[] arr2 =makeArrayFromTo(15,20);
        System.out.println(Arrays.toString(arr));

        shuffleArray(arr);
        shuffleArray(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] makeArrayFromTo(int min, int max){
        int[]arr= new int[max-min];
        for(int i =0; i< arr.length; i++){
            arr[i]=min+i;
        }
        return arr;

    }
    public static void shuffleArray(int[] arr){
        int ran =(int)(Math.random()*arr.length);
        for(int i=0; i<arr.length; i++){
            int temp =arr[ran];
            arr[ran] =arr[i];
            arr[i]=temp;
        }
    }
}
