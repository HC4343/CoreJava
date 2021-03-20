package loops;

import java.util.Scanner;

public class WhileLoopExamp {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = "";

        while (!password.equals("openNow")){
            System.out.println("Please enter your password: ");
            password = input.nextLine();

            if (password.equals("openNow"))
                System.out.println("You have entered the right password!");

            else
                System.out.println("You have entered the wrong password!");

            }
        }
    }

