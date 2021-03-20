package sampleTests.constructor;

public class MyConstrClass {

    public MyConstrClass(){

        System.out.println("hello!");
    }
    public MyConstrClass(int a) {
        System.out.println("hello world!");
    }
    public static void main(String[] args){
        new MyConstrClass();
        new MyConstrClass(21);

        int[] number ={1,3,4,5};
        System.out.println(number.length);

    }

}
