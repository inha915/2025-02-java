package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray= new int[3];

        for(int i=0; i<oldIntArray.length; i++){
            oldIntArray[i]=i+1;
        }
        int[] newIntArray = new int[oldIntArray.length];
        for (int i=0; i<newIntArray.length; i++){
            newIntArray[i]=oldIntArray[i];
        }
        System.out.println(Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntArray));

        oldIntArray[0]=10;
        System.out.println(Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntArray));

    }
}
