package corejava;

public class TypeConversion {

    public static void main(String[] args) {
        int a = 10;
        double b = a; // widening
        double x = 9.7;
        int y = (int) x; // narrowing
        System.out.println(b + ", " + y);
    }
}
