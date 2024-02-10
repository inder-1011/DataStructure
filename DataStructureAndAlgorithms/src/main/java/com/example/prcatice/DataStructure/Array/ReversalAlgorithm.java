package com.example.prcatice.DataStructure.Array;

import java.util.Arrays;

public class ReversalAlgorithm {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d=2;
        int[] result = reverseArray(arr,d);
        System.out.println(Arrays.toString(result));
    }

    private static int[] reverseArray(int[] arr, int d) {

        if(d==0){
            return arr;
        }
        int n= arr.length;
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
