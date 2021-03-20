package sampleTests.interfaces;

import static sampleTests.interfaces.C.aba;

//Creating interface that has 4 methods
interface A {
    void a();
    void b();
    void c();
    void d();
    static void ala(){
        System.out.println("I am xy");

    }
}
//Creating abstract class that provides the implementation of one method of A interface
abstract class B implements A{
    public void c(){
        System.out.println("I am C");
    }

}
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class C extends B{
    public void a(){ System.out.println("I am A");}
    public void b(){ System.out.println("I am B");}
    public void d(){ System.out.println("I am D");}
    static void aba(){
        System.out.println("I am aba");
    }
    }
//Creating a test class that calls the methods of A interface
class Test{
    public static void main(String[] args){

        A obj = new C();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
        aba();
        A.ala();




    }
}