package Vonglap;

import java.util.Scanner;

public class Snt {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            boolean songuyento = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number% i == 0) {
                    songuyento = false;
                    break;
                }
            }
            if (songuyento) {
                System.out.print(number+ " ");
                count++;
            }
            number++;
        }
    }
}