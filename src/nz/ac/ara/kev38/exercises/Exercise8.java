package nz.ac.ara.kev38.exercises;

class Exercise8 extends Exercise4 {
	protected int count;
	
	public Exercise8(int newMaxValue) {
		super(newMaxValue);
	}
	
	@Override
	protected void setSum() {
		for (int i = 0; i <= this.maxValue; i++) {
			if (i % 2 == 1) {
				this.sum += i;
				this.count++;
			}
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