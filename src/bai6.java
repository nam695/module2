import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số nguyên N:");
        String input = scanner.nextLine();

        try {
            int n = Integer.parseInt(input);
            int positiveN = Math.abs(n);
            int sum = 0;

            String numberString = String.valueOf(positiveN);
            for (int i = 0; i < numberString.length(); i++) {
                sum += Character.getNumericValue(numberString.charAt(i));
            }

            System.out.println("Tổng các chữ số của " + n + " là: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Đầu vào không phải là một số nguyên hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}