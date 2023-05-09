package Mangvaphuongthuc;

import java.util.Scanner;

public class giatrimax {
    public static void main(String[] args) {

    int size;
    int[] array;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("nhập số size");
        size = sc.nextInt();
        if(size > 20)
            System.out.println("không tồn tại size vượt quá 20");
    }while(size >20);
    array = new int[size];
    int i =0;
    while(i < array.length){
        System.out.print("nhập phần tử" + (i +1) + ":");
        array[i] = sc.nextInt();
        i++;
        System.out.println("danh sách list:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            int max = array[0];
            int index = 1;
            for (int k = 0; k < array.length; k++) {
                if(array[k]>max){
                    max = array[k];
                    index = k +1;
                }
            }
            System.out.println("giá trị lớn nhất trong mảng là : " + max + " tại vị trí" + index);
        }
    }
    }
}
