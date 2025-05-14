import  java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.print("Nhập tử số phân số thứ nhất (a): ");
        int a  = scanner.nextInt();
        System.out.print("Nhập mẫu số phân số thứ nhất (b): ");
        int b  = scanner.nextInt();
        System.out.print("Nhập tử số phân số thứ hai (c): ");
        int c  = scanner.nextInt();
        System.out.print("Nhập mẫu số phân số thứ hai (d): ");
        int d  = scanner.nextInt();

        int tuSo = a * d + c * b;
        int mauSo = b * d;

        System.out.println("Tổng của hai phân số là: " + tuSo + "/" + mauSo);

        int ucln = gcd(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        System.out.println("Phân số sau khi rút gọn là: " + tuSo + "/" + mauSo);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
}
