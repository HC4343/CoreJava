package sampleTests.polymorphism;

public class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}
abstract class Rectangular extends Circle{
    abstract void paint();
}
class Azc extends Rectangular{

    @Override
    void paint() {
        System.out.println("Painting the house");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
        System.out.println("Painting the house");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing a square");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing a triangle");
    }
}

class Test4{
    public static void main(String[] args){
        Shape s = new Shape();
        s.draw();
        Shape c = new Circle();
        Shape sq= new Square();
        Shape t = new Triangle();
        c.draw();
        sq.draw();
        t.draw();
        Rectangular p = new Azc();
        p.paint();


        float e = Float.parseFloat("25");
        System.out.println(e);
        String str = Float.toString(25.0f);
        System.out.println(str);
    }

}
