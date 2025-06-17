package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];


    public int size() {
        return arr.length;
    }
    public void add(String item){
        String[] temp = new String[arr.length+1];

        temp[arr.length] = item;
        //기존값 복사
        for(int i=0 ; i < size(); i++){
            temp[i] = arr[i];
        }
        this.arr = temp;


    }

    //점검용
    public void checkValues() {
        // 전체 배열에 뭐가 들어있는지 출력
        System.out.println(Arrays.toString(this.arr));
    }

    public String get(int num){
        return arr[num];
    }
    public String remove(){
        String[] temp = new String[arr.length-1];
        String etc = arr[temp.length];

        for(int i = 0; i <temp.length; i++){
            temp[i] = arr[i];
        }
        arr=temp;
        return etc;
    }

    public void add(int index, String item) {
        String[] temp = new String[size() +1];
        for(int i=0; i<size(); i++){
            if(i < index){
                temp[i] = arr[i];
            }else{
                temp[i+1] = arr[i];
            }
            temp[index]=item;
//            temp[i < index ? i : i +1] = arr[i];

        }
        this.arr=temp;

    }

    public String remove(int index) {
        String etc = arr[index];
        String[] temp = new String[size()-1];
        for(int i = 0; i <temp.length; i++){
            temp[i] = arr[i<index ? i : i+1];
        }
        arr=temp;
        return etc;
    }
}