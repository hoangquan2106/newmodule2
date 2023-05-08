package Baitapvenha;

public class bai3 {
        public static void main(String[] args) {
            int tong = 0;
            for (int i = 10; i < 100; i++) {
                if (sothuc(i)) {
                    tong += i;
                }
            }
            System.out.println("tổng của tất cả các SNT có 2 chữ số là: " + tong);
        }

        public static boolean sothuc(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
