import java.util.ArrayList;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 25, 2022
 */
public class GradeBook {

	private String name;
	private ArrayList<Integer> scores;

	// default no arg constructor
	public GradeBook() {
		super();
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList getScores() {
		return scores;
	}

	public void setScores(ArrayList scores) {
		this.scores = scores;
	}

	// method to set letter grades
	public ArrayList<Character> setLetterGrades(ArrayList<Integer> scores) {
		ArrayList<Character> letterGrades = new ArrayList<Character>();

		for (int i : scores) {
			if (i >= 90) {
				letterGrades.add('A');
			} else if (i >= 80) {
				letterGrades.add('B');
			} else if (i >= 70) {
				letterGrades.add('C');
			} else if (i >= 60) {
				letterGrades.add('D');
			} else {
				letterGrades.add('F');
			}
		}
		return letterGrades;
	}
}
