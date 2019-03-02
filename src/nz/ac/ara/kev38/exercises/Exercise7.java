package nz.ac.ara.kev38.exercises;

class Exercise7 extends Exercise4 {
	private int count;
	private int minValue;
	
	public Exercise7 (int newMinValue, int newMaxValue) {
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