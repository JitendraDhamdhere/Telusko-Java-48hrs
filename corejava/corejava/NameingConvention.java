package corejava;

class A {

    A() {
        System.out.println("Constructor Invoked...");
    }

    public void show() {
        System.out.println("Class A ShoW....");
    }
}

public class NameingConvention {

    public static void main(String args[]) {
        new A().show();;   //store it only in head refernece

        A obj = new A();
        obj.show();

    }
}

//Camel Casing 
//Class and Interface - Calc, Runnable ,MyData
//variable and method -mark,show()
//constants - PIE , BRAND
//showMyMarks()
//age ,MY_DATA,

//Construcors -Human()
