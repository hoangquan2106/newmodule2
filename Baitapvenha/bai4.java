package Baitapvenha;

import java.util.Scanner;

    public class bai4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập chuỗi ký tự: ");
            String a = sc.nextLine();

            if (isPalindrome(a)) {
                System.out.println("Chuỗi " + a + " là chuỗi đối xứng");
            } else {
                System.out.println("Chuỗi " + a + " không phải là chuỗi đối xứng");
            }
        }

        public static boolean isPalindrome(String b) {
            int n = b.length();
            for (int i = 0; i < n / 2; i++) {
                if (b.charAt(i) != b.charAt(n - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

