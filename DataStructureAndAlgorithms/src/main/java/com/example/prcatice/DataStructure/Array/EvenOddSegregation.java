package com.example.prcatice.DataStructure.Array;

import java.util.Arrays;

public class EvenOddSegregation {

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 6, 1, 3, 8, 5};

        int[] result = evenOddSegregation(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] evenOddSegregation(int[] arr) {

        int odd=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                swap(arr,i,odd);
                odd++;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int odd) {
        int temp = arr[i];
        arr[i]= arr[odd];
        arr[odd]= temp;

    }

}
