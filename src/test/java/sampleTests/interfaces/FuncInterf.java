package sampleTests.interfaces;

interface FuncInterf {

    void abc();                         // ---------> abstract method

    default void show(){                // ---------> default method in Interface------> After Java 8

        System.out.println("in show");
    }
}

class demoFuncInterf implements FuncInterf{

    public void abc(){
        System.out.println("in action");
    }
    public void show(){                     // -------> overrides show method
        System.out.println("in new show");
    }
}

class InterfaceDemo{
    public static void main(String[]args){
        FuncInterf obj = new demoFuncInterf();
        obj.abc();
        obj.show();

    }


}
