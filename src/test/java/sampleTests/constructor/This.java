package sampleTests.constructor;

public class This {

    public This(){
        System.out.println("Heyy");
    }
    public This(int a){
        this();
        System.out.println("Hello");

    }
    public This(int a, double b){
        this(7);
        System.out.println("World");

    }
    public This(int a, double b, char A){
        this(3,3.1);
        System.out.println("Welcome");

    }
    public static void main(String[] args){
        new This(5, 5.1, 'B');

    }
}
