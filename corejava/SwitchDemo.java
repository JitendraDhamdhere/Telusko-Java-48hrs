package corejava;

public class SwitchDemo {

    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
