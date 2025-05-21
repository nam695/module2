import java.util.Arrays;
import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Khởi tạo mảng
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // 2. Sắp xếp mảng
        Arrays.sort(array);

        System.out.println("\nMảng sau khi sắp xếp tăng dần:");
        System.out.println(Arrays.toString(array));

        // 3. Tìm kiếm số
        System.out.print("\nNhập số cần tìm: ");
        int target = scanner.nextInt();

        // Tìm kiếm nhị phân
        int binarySearchResult = Arrays.binarySearch(array, target);
        if (binarySearchResult >= 0) {
            System.out.println("Tìm kiếm nhị phân: Số " + target + " được tìm thấy tại vị trí " + binarySearchResult);
        } else {
            System.out.println("Tìm kiếm nhị phân: Không tìm thấy số " + target + " trong mảng.");
        }

        // Tìm kiếm tuyến tính 
        int linearSearchResult = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                linearSearchResult = i;
                break;
            }
        }

        if (linearSearchResult >= 0) {
            System.out.println("Tìm kiếm tuyến tính: Số " + target + " được tìm thấy tại vị trí " + linearSearchResult);
        } else {
            System.out.println("Tìm kiếm tuyến tính: Không tìm thấy số " + target + " trong mảng.");
        }

        scanner.close();
    }
}