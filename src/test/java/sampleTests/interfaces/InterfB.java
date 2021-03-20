package sampleTests.interfaces;

interface InterfB {
    void show();
}

class Test1{
    public static void main(String[] args){

        InterfB obj = ()-> System.out.println("in show");
        obj.show();
    }
}
