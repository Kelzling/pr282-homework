package nz.ac.ara.kev38.exercises;

// model class
class SumAndAverage4 extends SumAndAverage {
	private int count;
	private int minValue;
	
	public SumAndAverage4(int newMinValue, int newMaxValue) {
		super(newMaxValue);
		this.minValue = newMinValue;		
	}
	
	@Override
	protected void setSum() {
		for (int i = this.minValue; i <= this.maxValue; i++) {
			this.sum += i;
			this.count++;
		}
	}
	
	@Override
	protected void setAverage() {
		this.average = this.sum / this.count;
	}
	
	public int getCount() {
		return this.count;
	}
}