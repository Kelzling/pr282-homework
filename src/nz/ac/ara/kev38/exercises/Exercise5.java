package nz.ac.ara.kev38.exercises;

class Exercise5 extends Exercise4 {
	public Exercise5(int newMaxValue) {
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