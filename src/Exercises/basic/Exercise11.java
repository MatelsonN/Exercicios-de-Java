package basicExercises;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.println("Enter the start time and end time of a game: ");
        int startTime = reading.nextInt();
        int finalTime = reading.nextInt();

        int Duration;
        if (startTime < finalTime) {
            Duration = finalTime - startTime;
        } else {
            Duration = 24 - startTime + finalTime;
        }

        System.out.println("THE GAME LASTED " + Duration + " HOUR(S)");

        reading.close();
    }
}
