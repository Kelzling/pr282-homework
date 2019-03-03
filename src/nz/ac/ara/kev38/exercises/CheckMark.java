package nz.ac.ara.kev38.exercises;

// model class
// name casing conventions followed
public class CheckMark {
	public String checkMark(int mark) {
		String result = "FAIL";
		
		if (mark >= 50) {
			result = "PASS";
		}
		
		return result;
	}
}
