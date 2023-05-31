package org.ctac.java103;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10,2,31,14,55,16};
        int n = 6;

        // before sorting
        System.out.println(Arrays.toString(arr));



        // after sorting
        System.out.println(Arrays.toString(bubbleSort(arr, n)));


        String input = "ctacdetroit";
        n = 11;


        //before counting sort
        System.out.println(input);


        //after counting sort
        System.out.println(sort(input));





    }

    static int[] bubbleSort(int arr[], int n)
    {
        int i, j, placeHolder;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    placeHolder = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = placeHolder;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
        return arr;
    }

    static String sort(String arr)
    {
        int n = arr.length();


        char[] output = new char[n];

        int[] count = new int[26];


        for (int i = 0; i < n; ++i)
            count[arr.charAt(i) - 'a']++;

        int idx = 0;
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < count[i]; ++j) {
                output[idx++] = (char) ('a' + i);
            }
        }

        return new String(output);
    }
}