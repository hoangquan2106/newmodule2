import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền (usd)");
        usd = sc.nextDouble();
        double chuyendoi = usd *23000;
        System.out.print("giá trị vnd:" + chuyendoi);
    }
}
