package sampleTests.abstraction;

public class AbstrClass2 {
    public static void main(String[] args){
        Iphone i = new Iphone();
        show(i);
//        SamsungS4 s = new SamsungS4();
//        show(s);

    }
    public static void show(Phone i){
        i.showConfig();

    }
//    public static void show(SamsungS4 s){
//        s.showConfig();
//
//    }
}
abstract class Phone{
    public abstract void showConfig();

}
class Iphone extends Phone{
    public void showConfig(){
        System.out.println("2 Gb, IOS 9.2");
    }
}
class SamsungS4 extends Phone{
    public void showConfig() {

        System.out.println("4 Gb, lolipop");

    }
}