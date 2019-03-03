package nz.ac.ara.kev38.exercises;

// model class
class SumAndAverage3 extends SumAndAverage {
	public SumAndAverage3 (int newMaxValue) {
		super(newMaxValue);
	}
	
	@Override
	protected void setSum() {
		int i = 0;
		
		do {
			this.sum += i;
			
			i++;
		} while (i <= this.maxValue);
	}
}