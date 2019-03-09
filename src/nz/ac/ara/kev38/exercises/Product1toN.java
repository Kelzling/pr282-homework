package nz.ac.ara.kev38.exercises;

class Product1ToN {
	private int maxValue;
	
	public Product1ToN() {
		this.maxValue = 10;
	}
	
	public Product1ToN(int newMaxValue) {
		this.maxValue = newMaxValue;
	}
	
	public void setMaxValue(int newMaxValue) {
		this.maxValue = newMaxValue;
	}
	
	public int product1ToN() {
		int product = 0;
		
		for (int i = 1; i <= this.maxValue; i++) {
			if (i == 1) {
				product = i;
			} else {
				product = product * i;
			}
		}
		
		return product;
	}
}