package corejava;

class Mobile {

    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + name + " : " + price);
    }

    public void show1(Mobile m2) {
        System.err.println("In Static void show :  ");
        System.out.println(m2.brand + " : " + m2.name + " : " + m2.price);

    }
}

public class StaticDemo {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "Apple";
        m.price = 2340;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 2340;
        Mobile.name = "Smartphone";

        m.show();
        m2.show();

        m2.show1(m2);

    }

}
