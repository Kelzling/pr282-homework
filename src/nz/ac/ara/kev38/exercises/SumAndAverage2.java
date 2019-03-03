package nz.ac.ara.kev38.exercises;

// model class
class SumAndAverage2 extends SumAndAverage {
	public SumAndAverage2(int newMaxValue) {
		super(newMaxValue);
	}
	
	@Override
	protected void setSum() {
		int i = 0;
		
		while (i <= this.maxValue) {
			this.sum += i;
			
			i++;
		}
	}
}