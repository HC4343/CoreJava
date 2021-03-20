package loops;

public class loopExample {

    public static void main(String[] args) {
        String myWord = "birberberbirberberebireberbergelberaberbirberberegidelimdemis";
        int bCount = 0;

        for (int i = 0; i < myWord.length(); i++) {
            if (myWord.charAt(i) == 'b') {
                bCount++;
            }
        }
        System.out.println("There are " + bCount + " b(s) in the myWord.");
        System.out.println(" ");

        String word = "Hakan";
        int len = word.length()-1;
            for (int i = 0; i < word.length(); i++){
                System.out.println(word.charAt(len-i));
            }
        System.out.println(" ");

        String yWord = "Hakan";
            for (int i = yWord.length()-1; i >= 0; i--){
                System.out.println(yWord.charAt(i));
            }

        for (int i = 0; i < 3; i++) {

            for (int j = 3; j >= 0; j--) {
                if (i == j)
                    continue;
                System.out.println(i + " " + j);
        }
        }
    }
}
