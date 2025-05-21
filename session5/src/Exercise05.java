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
        System.out.println("- String: Việc nối chuỗi bằng toán tử '+' tạo ra các đối tượng String mới trong mỗi lần lặp, dẫn đến hiệu suất rất kém và tốn nhiều bộ nhớ khi số lượng phép nối lớn.");
        System.out.println("- StringBuilder: Nhanh nhất trong ba loại vì nó không được đồng bộ hóa. Thích hợp cho các trường hợp chỉ có một luồng thực hiện việc nối chuỗi.");
        System.out.println("- StringBuffer: Chậm hơn StringBuilder một chút vì nó được đồng bộ hóa (thread-safe), có nghĩa là nó an toàn khi sử dụng trong môi trường đa luồng. Thích hợp khi nhiều luồng cùng thực hiện việc nối chuỗi.");
    }
}