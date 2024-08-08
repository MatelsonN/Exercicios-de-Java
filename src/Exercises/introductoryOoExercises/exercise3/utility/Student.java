package Exercises.introductoryOoExercises.exercise3.utility;

public class Student {

    public String name;
    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public double media() {

        return firstNote + secondNote + thirdNote;
    }

    public String toString() {

        if (media() >= 60) {
            return "FINAL GRID = "
                    + media()
                    +"\nSPENT";
        }
        else {
            return "FINAL GRID = "
                    + String.format("%.2f",media())
                    +"\nIT DID NOT PASS"
                    +"\nMISSING " + (String.format("%.2f", 60 - media())) + " POINTS.";
        }
    }

}
