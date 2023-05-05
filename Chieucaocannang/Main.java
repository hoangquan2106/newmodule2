package Chieucaocannang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cannang, chieucao, bmi;
        System.out.print("cân nặng của bạn(kg)");
        cannang = sc.nextDouble();
        System.out.println("chiều cao của bạn(m)");
        chieucao = sc.nextDouble();
        bmi = cannang / Math.pow(chieucao, 2);
        System.out.printf("%-20%s","bmi","Interpretation\n");

        if (bmi <18)
            System.out.printf("%-20.2f%s", bmi, "thiếu cân");
            else if (bmi < 25.0)
                System.out.printf("%-20.2f%s", bmi, "bình thường");
            else if (bmi < 30.0)
                System.out.printf("%-20.2f%s", bmi, "thừa cân");
            else
                System.out.printf("%-20.2f%s", bmi, "béo phì");
        }
    }

