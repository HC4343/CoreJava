package sampleTests.polymorphism;

    class Bird {
        public void sing() {
            System.out.println("tweet tweet");
        }
    }

    class Eagle extends Bird {
        public void sing(String song) {
            System.out.println("yak yak");
        }
    }

public class Poly {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.sing();
        Bird b = new Eagle();
        b.sing();
        e.sing();
        Bird bc = new Bird();
        bc.sing();





    }
}

