package nz.ac.ara.kev38.exercises;

class ReverseString {
	public String reverseString(String inputString) {
		/* char[] explodedString = inputString.toCharArray();
		int stringLength = explodedString.length;
		*/
		int stringLength = inputString.length();
		char[] reversedStringArray = new char[stringLength];
		int maxIndex = stringLength - 1;
		
		for (int i = 0; i <= maxIndex; i++) {
			// reversedStringArray[i] = explodedString[maxIndex - i];
			reversedStringArray[i] = inputString.charAt(maxIndex - i);
		}
		
		String result = "";
		for (char c : reversedStringArray) {
			result += c;
		}
		
		return result;
	}
}