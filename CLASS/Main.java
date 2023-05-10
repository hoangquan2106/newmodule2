package CLASS;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            QuadraticEquation quadraticEquation = new QuadraticEquation();

            System.out.println("nhập a: ");
            quadraticEquation.getA();
            double a = Double.parseDouble(sc.nextLine());

            System.out.println("nhập b: ");
            quadraticEquation.getB();
            double b = Double.parseDouble(sc.nextLine());

            System.out.println("nhập c: ");
            quadraticEquation.getC();
            double c = Double.parseDouble(sc.nextLine());

            double delta = (b*b) - (4*a*c);
            System.out.println("kết quả phương trình là " + delta);
            quadraticEquation.delta();

            double getRoot1 = Double.parseDouble(sc.nextLine());
            System.out.println(getRoot1);
            quadraticEquation.getRoot1();

            double getRoot2 = Double.parseDouble(sc.nextLine());
            System.out.println(getRoot2);
            quadraticEquation.getRoot2();
        }
    }
