import java.util.Scanner;
import java.util.logging.Logger;

public class GradeCalculator {

    private static final Logger logger = Logger.getLogger(GradeCalculator.class.getName()); 
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        logger.info("The application will not allow users to enter the first student name.");
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        logger.info("Scanner allows for input; no error for the rest of the students.");
        String[] studentNames = new String[numStudents];
        double[] grades = new double[numStudents];
        logger.info("User input starts here.");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i) + ": ");
            studentNames[i] = scanner.nextLine();
        }
        logger.info("Input works for every individual student.");
        for (int i = 0; i < numStudents; i++)
        {
            System.out.println("Enter grade for " + studentNames[i] + ": ");
            grades[i] = scanner.nextDouble();
        }
        logger.info("Does output the average and which students are below the average.");
        double total = 0;
        for (int i = 0; i < numStudents; i++) {
            total += grades[i];
        }

        double average = total / numStudents;

        System.out.println("Average grade: " + average);

        for (int i = 0; i < numStudents; i++) {
            if (grades[i] > average) {
                System.out.println(studentNames[i] + " scored below average.");
            }
        }

        scanner.close();
    }
}
