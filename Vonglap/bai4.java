package Vonglap;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("hình tam giác");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hình chữ nhật");
        hinhvuong();
    }

    public static void hinhvuong() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
