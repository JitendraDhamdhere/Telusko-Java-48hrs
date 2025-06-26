package corejava;

public class StringDemo {

    public static void main(String[] args) {
        String str = "Java";
        str = str.concat(" Programming"); // Immutable

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Mutable

        StringBuilder sb2 = new StringBuilder("Fast");
        sb2.append(" Code");

        System.out.println(str);
        System.out.println(sb);
        System.out.println(sb2);
    }
}
