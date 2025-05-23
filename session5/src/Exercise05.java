public class Exercise05 {

    public static void main(String[] args) {
        int iterations = 1_000; // 1 triệu lần lặp

        // So sánh hiệu suất của String
        long startTimeString = System.currentTimeMillis();
        String myString = "Hello";
        for (int i = 0; i < iterations; i++) {
            myString += "World";
        }
        long endTimeString = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với String: " + (endTimeString - startTimeString) + " ms");

        // So sánh hiệu suất của StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder myStringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            myStringBuilder.append("World");
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder) + " ms");

        // So sánh hiệu suất của StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer myStringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            myStringBuffer.append("World");
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuffer: " + (endTimeStringBuffer - startTimeStringBuffer) + " ms");

        System.out.println("\nNhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder:: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: : Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}
