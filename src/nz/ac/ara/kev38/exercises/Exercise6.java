package nz.ac.ara.kev38.exercises;

class Exercise6 extends Exercise4 {
	public Exercise6 (int newMaxValue) {
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