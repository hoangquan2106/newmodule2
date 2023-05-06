package Tinhlai;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tinhlai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double a = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền");
        money = sc.nextDouble();
        System.out.println("nhập số tháng");
        month = sc.nextInt();
        System.out.println("nhập lãi suất");
        a = sc.nextDouble();
        double laitong = 0;
        for (int i = 0; i < month; i++) {
            laitong += money * (a/100)/12*month;
            System.out.println("tổng tiền lãi: " +laitong);
        }
    }
}
