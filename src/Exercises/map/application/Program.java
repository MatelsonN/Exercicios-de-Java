package Exercises.map.application;

import Exercises.map.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        Map<Candidate, Integer> candidateVotes = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String local = reading.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(local))) {


            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                String username = fields[0];
                int vote = Integer.parseInt(fields[1]);

                Candidate candidate = new Candidate(username, vote);

                candidateVotes.put(candidate, candidateVotes.getOrDefault(candidate, 0) + vote);

                line = br.readLine();

            }
            for (Candidate key : candidateVotes.keySet()) {
                System.out.println(key + ": " + candidateVotes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
            ;
        }


        reading.close();
    }
}
