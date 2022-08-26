import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 25, 2022
 */
public class GradeEntry {

	public static void main(String[] args) {

		// variable creation and initialization
		int numOfScores = 0;
		int score = 0;
		String testName = "";
		ArrayList<Integer> scores = new ArrayList<Integer>();

		// creation of scanner variable for user input
		Scanner in = new Scanner(System.in);

		// creation of GradeBook object using test name
		GradeBook gradeBook = new GradeBook();

		// prompt user for input of test name
		System.out.print("Please enter the test name: ");
		testName = in.nextLine();

		// pass testName to GradeBook instance variable
		gradeBook.setName(testName);

		// prompt user for number of scores to record & ensure entry is positive whole
		// number
		do {
			System.out.print("Please enter how many scores you would like to record: ");

			// if statement to check integer has been entered
			if (!in.hasNextInt()) {
				System.out.print("Invalid input.  Please enter a positive whole number.\n");
				in.nextLine();
			} else {
				numOfScores = in.nextInt();

				// nested if statement to verify input is greater than zero
				if (numOfScores <= 0) {
					System.out.print("Invalid input.  Please enter a positive whole number.\n");
					in.nextLine();
				}
			}
		} while (numOfScores <= 0);

		// prompt user for scores & ensure entries are positive whole numbers
		for (int i = 0; i < numOfScores; i++) {
			do {
				System.out.print("Please enter score " + (i + 1) + ": ");

				// if statement to check integer has been entered
				if (!in.hasNextInt()) {
					System.out.print("Invalid input.  Please enter a positive whole number.\n");
					in.nextLine();
				} else {
					score = in.nextInt();

					// nested if statement to verify input is greater than zero
					if (score <= 0) {
						System.out.print("Invalid input.  Please enter a positive whole number.\n");
						in.nextLine();
					}
				}
			} while (score <= 0);
			scores.add(score);
			score = 0;
		}

		// pass ArrayList to gradeBook instance variable
		gradeBook.setScores(scores);

		// create letter grade array using GradeBook method
		ArrayList<Character> letterGrades = gradeBook.setLetterGrades(scores);

		// printout of results
		System.out.println("  Test Name: " + gradeBook.getName());
		System.out.println("Score -------- Grade");
		for (int i = 0; i < scores.size(); i++) {
			System.out.println("  " + scores.get(i) + "  --------   " + letterGrades.get(i));
		}

		// close of scanner variable
		in.close();
	}

}
