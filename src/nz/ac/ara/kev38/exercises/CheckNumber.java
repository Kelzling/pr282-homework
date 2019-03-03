package nz.ac.ara.kev38.exercises;

// model class
public class CheckNumber {
	public String checkNumber(int number) {
		String result = "Even Number";
		
		if (number % 2 == 1) {
			result = "Odd Number";
		} else if (number == 0) {
			result = "Special Case";
		}
		
		return result;
	}
}
