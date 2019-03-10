package nz.ac.ara.kev38.exercises;

import java.util.ArrayList;
import java.util.List;

class Product1ToN {
	private int maxValue;
	
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
	
	public List<Integer> multipleProducts(int minProduct, int maxProduct) {
		List<Integer> results = new ArrayList<Integer>();
		
		for (int i = minProduct; i <= maxProduct; i++) {
			this.setMaxValue(i);
			int product = this.product1ToN();
			results.add(product);
		}
		
		return results;
	}
}