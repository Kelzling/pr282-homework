package nz.ac.ara.kev38.exercises;

// model class
class SumAndAverage6 extends SumAndAverage5 {
	public SumAndAverage6(int newMaxValue) {
		super(newMaxValue);
	}
	
	@Override
	protected void setSum() {
		for (int i = 0; i <= this.maxValue; i++) {
			if (i % 7 == 0) {
				this.sum += i;
				this.count++;
			}
		}
	}
}