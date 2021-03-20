package sampleTests.polymorphism;

public class MethodHidingExamp {
    private static void display(){
        System.out.println("Static method from Display");
    }
    public void print(){
        System.out.println("Non-static method from Display");
    }
}

class Derived extends MethodHidingExamp{
    private static void display(){
        System.out.println("Private Non static method from Derived");
    }
    public void print(){
        System.out.println("Non static method from Derived");
    }
}
class Test5{
    public static void main (String[] args){
        MethodHidingExamp obj = new Derived();               // Runtime polymorphism
        obj.print();
//        MethodHidingExamp obj2 = new MethodHidingExamp();
//        obj2.print();

    }
}
