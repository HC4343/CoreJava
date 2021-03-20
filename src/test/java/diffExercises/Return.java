package diffExercises;

public class Return {
    public int sum( int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int subtract( int num1, int num2){
        return num1 - num2;
    }
}

class main1{
    public static void main(String[] args){
         int n1 = 10;
         int n2 = 20;
        System.out.println("non-void method: ");
        Return obj = new Return();
        System.out.println(obj.sum(n1,n2, 25));
        System.out.println(obj.sum(100, 150, 30));
        System.out.println(obj.subtract(40,35));
    }
}

