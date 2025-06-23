package corejava;

class A extends Object {  //every class in java always extends Object Class

    public A() {
        System.out.println("in A :");
    }

    public A(int n) {
        System.out.println("in A int :" + n);
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        //super(n);
        this();
        System.out.println("in B int=" + n);
    }
}

public class ThisSuperDemo {

    public static void main(String[] args) {
        System.err.println("This Super Demo");
        B b = new B(2);
    }

}
