package nz.ac.ara.kev38.exercises;

public class Exercise2 {
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
