package ch04.sec04.method;

public class Mission05Method {
    public static void main(String[] args) {
        int[] arr = {10, 70, 90, 110};
        int sum = addAllupArray(arr);
        System.out.println("sum: " + sum);

        int[] arr2 ={1, 2, 10, 80, 77};
        System.out.println("sum2: " + addAllupArray(arr2));
    }

    public static int addAllupArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];

        }
            return(sum);
    }

}
