package nz.ac.ara.kev38.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HarmonicSum {
	private Integer maxNum;
	
	public void setMaxNum(int newMaxNum) {
		this.maxNum = newMaxNum;
	}
	
	private Double sumLeftToRight() {
		Double result = 0.0d;
		
		for (Double i = 1.0d; i <= maxNum; i++) {
			Double divisionResult = 1 / i;
			result += divisionResult;
		}
		
		return result;
	}
	
	private Double sumRightToLeft() {
		Double result = 0.0d;
		
		for (Double i = maxNum.doubleValue(); i > 0; i--) {
			Double divisionResult = 1 / i;
			result += divisionResult;
		}
		
		return result;
	}
	
	private Double compareSums(Double sum1, Double sum2) {
		Double result = 0.0d;
		if (sum1 > sum2) {
			result = sum1 - sum2;
		} else {
			result = sum2 - sum1;
		}
		
		return result;
	}
	
	public List<Double> harmonicSum(int maxNum) {
		this.setMaxNum(maxNum);
		
		Double leftToRight = this.sumLeftToRight();
		Double rightToLeft = this.sumRightToLeft();
		Double difference = this.compareSums(leftToRight, rightToLeft);
		
		List<Double> result = new ArrayList<Double>(Arrays.asList(leftToRight, rightToLeft, difference));
		
		return result;
	}
}