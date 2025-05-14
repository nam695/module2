import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tháng (1-12):");
        String monthInput = scanner.nextLine();

        try {
            int month = Integer.parseInt(monthInput);

            if (month >= 1 && month <= 12) {
                String monthName;
                int daysInMonth;

                switch (month) {
                    case 1:
                        monthName = "Tháng 1";
                        daysInMonth = 31;
                        break;
                    case 2:
                        monthName = "Tháng 2";
                        daysInMonth = 28; // Không xét năm nhuận
                        break;
                    case 3:
                        monthName = "Tháng 3";
                        daysInMonth = 31;
                        break;
                    case 4:
                        monthName = "Tháng 4";
                        daysInMonth = 30;
                        break;
                    case 5:
                        monthName = "Tháng 5";
                        daysInMonth = 31;
                        break;
                    case 6:
                        monthName = "Tháng 6";
                        daysInMonth = 30;
                        break;
                    case 7:
                        monthName = "Tháng 7";
                        daysInMonth = 31;
                        break;
                    case 8:
                        monthName = "Tháng 8";
                        daysInMonth = 31;
                        break;
                    case 9:
                        monthName = "Tháng 9";
                        daysInMonth = 30;
                        break;
                    case 10:
                        monthName = "Tháng 10";
                        daysInMonth = 31;
                        break;
                    case 11:
                        monthName = "Tháng 11";
                        daysInMonth = 30;
                        break;
                    case 12:
                        monthName = "Tháng 12";
                        daysInMonth = 31;
                        break;
                    default:
                        monthName = "Không xác định";
                        daysInMonth = 0;
                        break;
                }

                System.out.println(monthName + " có " + daysInMonth + " ngày.");

            } else {
                System.out.println("Tháng không hợp lệ.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Đầu vào không phải là một số nguyên hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
