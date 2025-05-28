package ch04.sec09;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr =new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));

        int temp;


        for(int i=0; i<arr.length; i++){
            int ran =(int)(Math.random()*10.0);
           temp=arr[i];
           arr[i]=arr[ran];
           arr[ran]=temp;
            System.out.println(ran + " " +i + Arrays.toString(arr));
        }

    }
}
