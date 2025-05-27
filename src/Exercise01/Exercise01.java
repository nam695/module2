package Exercise01;

public class Exercise01 {
    // Phương thức main
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle với constructor mặc định
        Rectangle rect1 = new Rectangle();
        System.out.println("Hình chữ nhật 1:");
        rect1.display();

        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("\nHình chữ nhật 2:");
        rect2.display();

        Rectangle rect3 = new Rectangle(4.5, 2.5);
        System.out.println("\nHình chữ nhật 3:");
        rect3.display();
    }
}
