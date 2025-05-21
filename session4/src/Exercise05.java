import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo mảng
        System.out.print("Nhập số hàng cho mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột cho mảng: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Nhập các phần tử cho mảng (theo từng hàng):");
        for (int i = 0; i < rows; i++) {
            System.out.print("Hàng " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Tính tổng các số chẵn và số lẻ
        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] % 2 == 0) {
                    sumOfEvens += array[i][j];
                } else {
                    sumOfOdds += array[i][j];
                }
            }
        }

        // In kết quả
        System.out.println("\nTổng các số chẵn là: " + sumOfEvens);
        System.out.println("Tổng các số lẻ là: " + sumOfOdds);

        scanner.close();
    }
}