package Mangvaphuongthuc;

import java.util.Scanner;

public class timgiatri {
    public static void main(String[] args) {
        String[] mang = {"cái","gì","cũng","có","nha","acv","art","awq","agfj","jhgf","fgh","jhd"};
        Scanner Sc = new Scanner(System.in);
        System.out.println("nhập tên cần tìm: ");
        String name = Sc.nextLine();
        boolean a = false;
        for (int i = 0; i < mang.length; i++) {
            if(mang[i].equals(name)){
                System.out.println("vị trí trong danh sách " + name +" là: " + i );
                a = true;
                break;
            }
        }
        if (!a){
            System.out.println("không tìm thấy "+ name + "trong danh dách");
        }
    }
}
