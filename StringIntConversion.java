public class StringIntConversion {
    public static void main(String[] args) {

        // String to Integer
        String numStr = "12345";
        int num = Integer.parseInt(numStr);
        System.out.println("String to Integer: " + num);

        // Integer to String
        int number = 12345;
        String str = Integer.toString(number);
        System.out.println("Integer to String: " + str);
    }
}