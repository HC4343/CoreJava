package sampleTests.interfaces;

public interface InterfC {
    void Kal();
}
interface InterD {
    void Sal();
}

abstract class Abs implements InterfC,InterD,InterfB {
    abstract void May();

}

class Abstr extends Abs{
    void Zay(){
        System.out.println("Hello!");
    }

    @Override
    void May() {
        System.out.println("World");
    }

    @Override
    public void show() {
        System.out.println("Space");
    }

    @Override
    public void Kal() {
        System.out.println("Station");

    }

    @Override
    public void Sal() {
        System.out.println("Moon");
    }
}

class Test2{
    public static void main(String[] args){
        Abstr obj = new Abstr();
        obj.Kal();
        obj.May();
        obj.Zay();
        obj.show();
        obj.Sal();


    }
}
