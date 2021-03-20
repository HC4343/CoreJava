package loops;

public class SwitchCase {
    public static void main(String[] args) {

        int i = 16;
        int j = 0;

        j = i > 15 ? 1 : 2;
        System.out.println(j);

        switch (i) {
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            default:
                System.out.println("Numbers higher than five");

        }


    }
}