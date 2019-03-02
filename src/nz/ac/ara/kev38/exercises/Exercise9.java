package nz.ac.ara.kev38.exercises;

class Exercise9 extends Exercise8 {
	public Exercise9 (int newMaxValue) {
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