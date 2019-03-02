package nz.ac.ara.kev38.exercises;

public class Exercise1 {
	public String checkMark(int mark) {
		String result = "FAIL";
		
		if (mark >= 50) {
			result = "PASS";
		}
		
		return result;
	}
}
