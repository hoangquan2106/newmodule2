package Baitapvenha;
import java.util.Scanner;

public class sohoanhao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bắt đầu của khoảng: ");
        int batdau = sc.nextInt();
        System.out.print("Nhập số kết thúc của khoảng: ");
        int ketthuc = sc.nextInt();
        System.out.println("Các số hoàn hảo trong khoảng từ " + batdau + " đến " +  ketthuc + " là:");
        for (int i = batdau; i <= ketthuc; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
