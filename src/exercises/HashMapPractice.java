package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter student (Or Enter to finish)");

        do {
            System.out.println("Student: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.println("Student ID: ");
                Integer studentID = input.nextInt();
                classRoster.put(studentID, name);

                input.nextLine();
            }

        } while (!name.equals(""));

        input.close();

        // This will not print:
        System.out.println("\nClass Roster: ");
        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + ": " + student.getKey());
        }
        System.out.println("Number of Students in roster: " + classRoster.size());
    }
}
