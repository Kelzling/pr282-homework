package nz.ac.ara.kev38.exercises;

class Exercise10 extends Exercise4 {
	private int squaresSum;
	private int squaresSumAverage;
	
	public Exercise10(int newMaxValue) {
		super(newMaxValue);
	}
	
	@Override
	public void calculateValues() {
		this.setSquaresSum();
		this.setSquaresSumAverage();
	}

	public int getSquaresSum() {
		return squaresSum;
	}

	private void setSquaresSum() {
		for (int i = 0; i <= this.maxValue; i++) {
			this.squaresSum += i * i;
		}
	}

	public int getSquaresSumAverage() {
		return squaresSumAverage;
	}

	private void setSquaresSumAverage() {
		this.squaresSumAverage = this.squaresSum / this.maxValue;
	}
}