package Com.codegym;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("giải phương trình tuyến tính");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập các hằng số:");
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if (a !=0){
            double ketqua = (c-b) / a;
            System.out.printf("vượt qua phương trình với x = %f\n",ketqua);
        }else {
            if (b==c){
                System.out.print("tất cả là x!");
            }else {
                System.out.print("không có");
                }
            }
        }
    }

