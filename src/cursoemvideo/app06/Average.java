package cursoemvideo.app06;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your first grade: ");
        float firstGrade = input.nextFloat();
        System.out.print("Type your second grade: ");
        float secondGrade = input.nextFloat();
        float average = (firstGrade + secondGrade) / 2;
        if (average >= 8) {
            System.out.printf("Congrats! Your final grade is %.1f", average);
        } else if (average >= 6) {
            System.out.printf("Good! Your final grade is %.1f", average);
        } else if (average < 6) {
            System.out.printf("You must study! Your final grade is %.1f", average);
        }
    }
}
