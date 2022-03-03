package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[14];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int a;
        for (int i = 0; i < arr.length; i++) {
          for (int t = 0; t < arr.length-1; t++) {
                if (arr[t]<arr[t+1]) {
                    a = arr[t];
                    arr[t] = arr[t+1];
                    arr[t+1] = a;
                }
            }
        }
        System.out.println("Отсортированный массив: "+Arrays.toString(arr));
}
}

