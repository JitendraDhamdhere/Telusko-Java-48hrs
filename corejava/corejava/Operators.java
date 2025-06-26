package corejava;

public class Operators {

    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean result = (a > b) && (b > 0); // Logical AND
        int c = a & b; // Bitwise AND
        System.out.println(result + ", " + c);
    }
}
