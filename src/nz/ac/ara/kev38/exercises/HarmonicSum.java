package nz.ac.ara.kev38.exercises;

class HarmonicSum {
	private final int maxNum = 50000;
	
	public double sumLeftToRight() {
		double result = 0;
		
		for (double i = 1; i <= maxNum; i++) {
			double divisionResult = 1 / i;
			result += divisionResult;
		}
		
		return result;
	}
	
	public double sumRightToLeft() {
		double result = 0;
		
		for (double i = maxNum; i > 0; i--) {
			double divisionResult = 1 / i;
			result += divisionResult;
		}
		
		return result;
	}
	
	public double harmonicSum(double maxNum, String direction) {
		double result = 0;
		
		if (direction == "right") {
			for (double i = 1; i <= maxNum; i++) {
				double divisionResult = 1 / i;
				result += divisionResult;
			}
		} else if (direction == "left" ) {
			for (double i = maxNum; i > 0; i--) {
				double divisionResult = 1 / i;
				result += divisionResult;
			}
		}
		
		return result;
	}
}