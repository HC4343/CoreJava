package sampleTests.inheritance;

public class InheritanceExamp {
    public static void aya(){
        System.out.println("I am aya in Super");
    }
    public void zaza(){
        System.out.println("I am zaza in Super");
    }


}
class Child extends InheritanceExamp{
    public static void aya(){
        System.out.println("I am aya in Child");
    }
    public void zaza(){
        System.out.println("I am zaza in Child");
    }
    public static void main(String[] args){
        InheritanceExamp ca = new InheritanceExamp();
        InheritanceExamp ab = new Child();
        Child ba = new Child();
        ab.zaza();
        ba.zaza();

        ab.aya();
        ba.aya();

        ca.zaza();
        ca.aya();
        aya();
    }

}
