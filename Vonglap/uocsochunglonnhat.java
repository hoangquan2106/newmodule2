package Vonglap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class uocsochunglonnhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        a = sc.nextInt();
        System.out.println("nhập b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("hông có ước chung lớn nhất");
        }
        while (a != b){
            if (a > b)
                a = a - b;
            System.out.println(" ước chung lớn nhất: " + a);
            if (a < b)
                b = b - a;
            System.out.println(" ước chung lớn nhất: " + b);
        }
    }
}
