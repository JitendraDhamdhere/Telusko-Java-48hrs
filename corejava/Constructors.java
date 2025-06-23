
class Man {

    int id;
    String name;

    public Man() {
        System.out.print("Constructor Calls...\n");
        id = 1;
        name = "JItuuu";
    }

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Constructors {

    public static void main(String[] args) {
        Man m1 = new Man();
        m1.setId(2);
        m1.setName("Jitendra");
        System.err.println("id :" + m1.getId() + "\nName :" + m1.getName());
        Man m2 = new Man();
        System.err.println("id :" + m2.getId() + "\nName :" + m2.getName());
        Man m3 = new Man(3, "JD");
        System.err.println("id :" + m3.getId() + "\nName :" + m3.getName());

    }

}
