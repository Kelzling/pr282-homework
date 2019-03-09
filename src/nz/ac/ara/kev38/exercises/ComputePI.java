package nz.ac.ara.kev38.exercises;

class ComputePI {
	public Double computePI(int maxDenominator) {
		Double sum = 0.0d;
		
		for (Double denominator = 1.0d; denominator <= maxDenominator; denominator++) {
			if (denominator % 4 == 1) {
				sum += (1 / denominator);
			} else if (denominator % 4 == 3) {
				sum -= (1 / denominator);
			}
		}
		
		Double result = 4.0d * sum;
		
		return result;
	}
	
	// compare to Java PI function
	public Double comparePI(Double calculatedPI) {
		Double difference = 0.0d;
		
		if (calculatedPI > Math.PI) {
			difference = calculatedPI - Math.PI;
		} else {
			difference = Math.PI - calculatedPI;
		}
		
		Double percentDifference = (difference / Math.PI) * 100;
		
		return percentDifference;
	}
	
	// test and find a good place to terminate calculation
}

// Hint: Add to sum if the denominator modulus 4 is 1, and subtract from sum if it is 3.