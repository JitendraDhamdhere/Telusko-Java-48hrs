package corejava;

class Human {

    private int age = 11;
    private String name = "Jitu";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class EncapsulationDemo {

    public static void main(String args[]) {
        Human obj = new Human();
        System.out.println("Name :" + obj.getName());
        System.out.println("Age :" + obj.getAge());
        obj.setName("Jitendra");
        obj.setAge(24);
        System.out.println("Name :" + obj.getName());
        System.out.println("Age :" + obj.getAge());

    }
}
