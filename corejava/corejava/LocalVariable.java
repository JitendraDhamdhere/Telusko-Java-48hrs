package corejava;

//local Variable
public class LocalVariable {

    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        LocalVariable test = new LocalVariable();
        test.pupAge();
    }
}
