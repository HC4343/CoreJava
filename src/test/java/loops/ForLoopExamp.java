package loops;

import java.util.Scanner;

public class ForLoopExamp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many grades would you like to grade? ----->");
        int times = sc.nextInt();
        int sumOfGrades = 0;

        for(int i = 1; i < times; i++){
            System.out.print("Enter grade: " + i + "---->");
            int grade = sc.nextInt();
            sumOfGrades = sumOfGrades + grade;
        }
        System.out.println("The sum of the grades is : : " + sumOfGrades);
    }
}
