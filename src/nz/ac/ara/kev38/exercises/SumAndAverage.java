package nz.ac.ara.kev38.exercises;

class SumAndAverage {
	protected int sum;
	protected double average;
	protected int maxValue;
	
	public SumAndAverage (int newMaxValue) {
		this.maxValue = newMaxValue;
	}
	
	public void calculateValues() {
		this.setSum();
		this.setAverage();
	}

	public int getSum() {
		return sum;
	}

	protected void setSum() {
		for (int i = 0; i <= this.maxValue; i++) {
			this.sum += i;
		}
	}

	public double getAverage() {
		return average;
	}

	protected void setAverage() {
		this.average = this.sum / this.maxValue;
	}
}