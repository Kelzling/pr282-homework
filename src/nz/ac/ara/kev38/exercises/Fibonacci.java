package nz.ac.ara.kev38.exercises;

class Fibonacci {
	private int[] fibonacciNumbers;
	
	public Fibonacci (int maxValue) {
		fibonacciNumbers = new int[maxValue];
	}
	
	public int[] getFibonacciNumbers() {
		this.calculateFibonacciNumbers();
		return this.fibonacciNumbers;
	}
	
	private void calculateFibonacciNumbers() {
		for (int i = 0; i < this.fibonacciNumbers.length; i++) {
			int number;
			if (i == 0) {
				number = i + 1;
			} else if (i == 1) {
				number = i;
			} else {
				number = this.fibonacciNumbers[i - 1] + this.fibonacciNumbers[i - 2];	
			}
			this.fibonacciNumbers[i] = number;
		}
	}
	
	public float getAverage() {
		float sum = 0.0f;
		
		for (int num : this.fibonacciNumbers) {
			sum += num;
		}
		
		float average = sum / this.fibonacciNumbers.length;
		
		return average;
	}
}