package session06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Excise03 {
    static Scanner sc = new Scanner(System.in);
    static List<String> danhSachBienSo = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("***************QUẢN LÝ BIỂN SỐ XE ***************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                choice = sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một số.");
                sc.nextLine();
                choice = -1;
                continue;
            }
            sc.nextLine();

            switch (choice) {
                case 1://thêm biển số xe
                    System.out.print("Nhập số lượng biển số xe cần thêm: ");
                    int n = sc.nextInt();
           sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        String bienSo;
                        boolean validFormat = false;
                        do {
                            System.out.print("Nhập biển số xe thứ " + (i + 1) + " (VD: 30F-123.45): ");
                            bienSo = sc.nextLine().toUpperCase().trim();

                            if (bienSo.matches("\\d{2}[A-Z]-\\d{3}\\.\\d{2}")) {
                                danhSachBienSo.add(bienSo);
                                validFormat = true;
                            } else {
                                System.out.println("Biển số không đúng định dạng. Vui lòng nhập lại.");
                            }
                        } while (!validFormat);
                    }
                    break;
                case 2://hiện thị danh sách
                    if (danhSachBienSo.isEmpty()) {
                        System.out.println("Danh sách biển số trống.");
                        break;
                    }
                    System.out.println("Danh sách biển số xe:");
                    licensePlateList();
                    break;
                case 3://tìm kiếm theo biển
                    System.out.print("Nhập biển số xe cần tìm: ");
                    String bienSoCanTim = sc.nextLine().toUpperCase().trim();

                    if (danhSachBienSo.contains(bienSoCanTim)) {
                        System.out.println("Đã tìm thấy biển số: " + bienSoCanTim);
                    } else {
                        System.out.println("Không tìm thấy biển số.");
                    }
                    break;
                case 4:// tìm kiếm theo tỉnh
                    System.out.print("Nhập mã tỉnh (VD: 30, 51): ");
                    String maTinh = sc.nextLine().trim();

                    boolean found = false;
                    System.out.println("Các biển số thuộc mã tỉnh " + maTinh + ":");
                    for (String bienSo : danhSachBienSo) {
                        if (bienSo.startsWith(maTinh)) {
                            System.out.println(" - " + bienSo);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy biển số nào thuộc mã tỉnh " + maTinh + ".");
                    }
                    break;
                case 5:// xắp sếp
                    if (danhSachBienSo.isEmpty()) {
                        System.out.println("Danh sách biển số trống. Không có gì để sắp xếp.");
                        break;
                    }
                    Collections.sort(danhSachBienSo);
                    System.out.println("Đã sắp xếp biển số xe theo thứ tự tăng dần.");
                    licensePlateList();
                    break; //
                case 6://thoát
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice !=6);

        sc.close();
    }





    private static void licensePlateList() {
        if (danhSachBienSo.isEmpty()) {
            System.out.println("Danh sách biển số trống.");
            return;
        }
        for (String bienSo : danhSachBienSo) {
            System.out.println(" - " + bienSo);
        }
    }
}
