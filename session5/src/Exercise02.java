public class Exercise02 {
    public static void main(String[] args) {
        StringBuilder originalString = new StringBuilder("Mã đơn hàng là 12345");

        System.out.println("Chuỗi ban đầu: " + originalString);

        originalString.delete(15, 21);
        System.out.println("Chuỗi sau khi xóa: " + originalString);

        int start = originalString.indexOf("*****");
        if (start != -1) {
            originalString.replace(start, start + 5, "Universe"); //
        }
        System.out.println("Chuỗi sau khi thay thế: " + originalString);
    }
}