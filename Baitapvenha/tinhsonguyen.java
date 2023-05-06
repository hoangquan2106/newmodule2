package Baitapvenha;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tinhsonguyen {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số: ");
        int a = Sc.nextInt();
        int count = 0;
        int num = 2;
        while (count < a){
            if (sothuc(num)){
                count++;
            }
            num++;
        }
        System.out.println("số nguyên dương thứ:" + a + "là" + (num -1));
    }
    public static boolean sothuc(int num){
        if (num<1){
            return false;
        }
    return true;
        }
}
