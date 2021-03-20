package sampleTests.abstraction;

public class AbstrClass {
    public static void main(String[] args){
//        KayaPhone kp = new KayaPhone();
//        kp.call();
        KayaPhone dp = new DenizPhone();
        dp.cook();
        dp.dance();
        dp.move();
        dp.call();

    }
}
//Abstract Class
abstract class KayaPhone{

    public void call(){
        System.out.println("calling");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
//Abstract Class
abstract class YagmurPhone extends KayaPhone{
    public void move(){
        System.out.println("moving");
    }
    public void dance(){
        System.out.println("dancing");

    }

}
//Concrete class
class DenizPhone extends YagmurPhone{
    public void cook(){
        System.out.println("cooking");

    }

}
