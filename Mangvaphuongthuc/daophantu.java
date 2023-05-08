package Mangvaphuongthuc;

import java.util.Scanner;

public class daophantu {
    public static void main(String[] args) {
        int a;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập kích thước");
            a = sc.nextInt();
            if (a > 20)
                System.out.println("kích thước không vượt quá 20");
        } while (a > 20);
        array = new int[a];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhập phần tử " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%20s%s", "các phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int b = array[j];
            array[j] = array[a - 1 - j];
            array[a - 1 - j] = b;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
