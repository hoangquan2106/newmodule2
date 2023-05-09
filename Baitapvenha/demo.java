package Baitapvenha;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 8, 2, 1, 2};
        int[] newArr = abc(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] abc(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 2) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}
