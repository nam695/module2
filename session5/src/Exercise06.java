import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Kiểm Tra Tính Hợp Lệ Của Mật Khẩu ---");
        System.out.print("Nhập mật khẩu cần kiểm tra: ");
        String password = scanner.nextLine();

        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Mật khẩu hợp lệ.");
        } else {
            System.out.println("Mật khẩu không hợp lệ.");
        }

        scanner.close();
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            System.out.println("- Mật khẩu phải có ít nhất 8 ký tự.");
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        String specialCharacters = "@#$%!"; 

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialCharacters.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            }
        }

        if (!hasUppercase) {
            System.out.println("- Mật khẩu phải có ít nhất một chữ cái viết hoa.");
            return false;
        }


        if (!hasLowercase) {
            System.out.println("- Mật khẩu phải có ít nhất một chữ cái viết thường.");
            return false;
        }


        if (!hasDigit) {
            System.out.println("- Mật khẩu phải có ít nhất một ký tự số.");
            return false;
        }

        if (!hasSpecialChar) {
            System.out.println("- Mật khẩu phải có ít nhất một ký tự đặc biệt (" + specialCharacters + ").");
            return false;
        }
        
        return true;
    }
}
