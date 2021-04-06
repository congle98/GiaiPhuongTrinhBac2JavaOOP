import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Bắt đầu giải phương trình bậc 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Mời nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Mời nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        quadraticEquation.findX();
    }
}
