package com.example.prcatice.DataStructure.Array;

import java.util.Arrays;

public class AlternateCondition {

    public static void main(String[] args) {
        int[] arr= { 1, 3, 2, 2, 5 };
        int[] result= rearrange(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rearrange(int[] arr) {

        for (int i=1;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]<arr[i-1]){
                    int temp =arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1]= temp;
                }
            }else {
                if(arr[i]>arr[i-1]){
                    int temp =arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1]= temp;
                }
            }
        }
        return arr;
    }
}
