package cursoemvideo.app05;

import java.util.Scanner;

public class CalcGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.print("Type your first grade: ");
        float firstGrade = input.nextFloat();
        System.out.print("Type your second grade: ");
        float secondGrade = input.nextFloat();
        float grade = ((firstGrade * 3) + (secondGrade * 7)) / 10;
        System.out.printf("%s, your final grade is %.1f \n", name, grade);
    }
}
