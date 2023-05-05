package Tinhnamnhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("nhập năm");
        year = sc.nextInt();
        boolean namnhuan = false;

        boolean chiacho4 = year % 4 == 0;
        if (chiacho4){
            boolean chiacho100 = year % 100 == 0;
            if(chiacho100){
                boolean chiacho400 = year % 400 == 0;
                if(chiacho400){
                    namnhuan = true;
                }
            }else{
                namnhuan = true;
            }
        }
        if (namnhuan){
            System.out.printf("năm %d là năm nhuận", year);
        }else {
            System.out.printf("năm %d không phải năm nhuận", year);
        }
    }
}
