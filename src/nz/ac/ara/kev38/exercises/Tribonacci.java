package nz.ac.ara.kev38.exercises;

class Tribonacci {
	private int[] tribonacciNumbers;
	
	public Tribonacci (int maxValue) {
		this.tribonacciNumbers = new int[maxValue];
	}
	
	public int[] getTribonacciNumbers() {
		this.calculateTribonacciNumbers();
		return this.tribonacciNumbers;
	}
	
	public float getAverage() {
		float sum = 0.0f;
		
		for (int num : this.tribonacciNumbers) {
			sum += num;
		}
		
		float average = sum / this.tribonacciNumbers.length;
		
		return average;
	}
	
	private void calculateTribonacciNumbers() {
		for (int i = 0; i < this.tribonacciNumbers.length; i++) {
			int number;
			if (i == 0) {
				number = i + 1;
			} else if (i == 1) {
				number = i;
			} else if (i == 2) {
				number = this.tribonacciNumbers[i - 1] + this.tribonacciNumbers[i - 2];
			} else {
				number = this.tribonacciNumbers[i - 1] + this.tribonacciNumbers[i - 2] + this.tribonacciNumbers[i - 3];	
			}
			this.tribonacciNumbers[i] = number;
		}
	}
}