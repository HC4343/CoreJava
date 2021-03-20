package diffExercises;

public class Return_2 {
    public String getThis(int score){

        String output = "";
        if (score >= 5) {
            output = "You are successful";
        }
        else if ((score >=4)) {
            output = "You are failed";
        }
        return output;

    }
}

class main2{
    public static void main(String[] args){
        Return_2 obj = new Return_2();
        int score = 5;
        System.out.println("Aplicant's score is: " + score);
        String response = obj.getThis(score);
        System.out.println(response);

    }

}
