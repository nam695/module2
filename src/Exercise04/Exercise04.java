package Exercise04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5]; // Mảng để lưu sinh viên

        // Tạo danh sách sinh viên
        studentArray[0] = new Student("Kain", 20, "A1", 7.5);
        studentArray[1] = new Student("Booe", 22, "A1", 8.0);
        studentArray[2] = new Student("Charlate", 19, "A2", 9.0);
        studentArray[3] = new Student("David", 19, "A2", 6.5);
        studentArray[4] = new Student("Eva", 20, "A1", 8.5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm min: ");
        double min = scanner.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = scanner.nextDouble();

        System.out.println("Danh sách sinh viên có điểm trung bình từ " + min + " đến " + max + ":");
        for (Student student : studentArray) {
            if (student.getAvgScore() >= min && student.getAvgScore() <= max) {
                System.out.println(student);
            }
        }

        scanner.close();
    }
}