import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        float width, height, area, circumference;

        Scanner  scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng (width): ");
        width = scanner.nextFloat();
        System.out.print("nhập chiều dài ( height): ");
        height = scanner.nextFloat();
        area = width * height;
        circumference = 2 * (width + height);

        System.out.printf("diện tích : %.2f\n", area);
        System.out.printf("chu vi: %.2f\n", circumference);
    }
}
