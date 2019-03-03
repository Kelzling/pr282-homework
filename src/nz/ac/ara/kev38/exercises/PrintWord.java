package nz.ac.ara.kev38.exercises;

// model class
public class PrintWord {
	public String printWordA(int number) {
		if (number < 10) {
			if (number < 9) {
				if (number < 8) {
					if (number < 7) {
						if (number < 6 ) {
							if (number < 5) {
								if (number < 4) {
									if (number < 3) {
										if (number < 2) {
											return "ONE";
										}
										return "TWO";
									}
									return "THREE";
								}
								return "FOUR";
							}
							return "FIVE";
						}
						return "SIX";
					}
					return "SEVEN";
				}
				return "EIGHT";
			}
			return "NINE";
		}
		
		return "OTHER";
	}
	
	public String printWordB(int number) {
		String result = "OTHER";
		
		switch (number) {
			case 1:
				result = "ONE";
				break;
			case 2:
				result = "TWO";
				break;
			case 3:
				result = "THREE";
				break;
			case 4:
				result = "FOUR";
				break;
			case 5:
				result = "FIVE";
				break;
			case 6:
				result = "SIX";
				break;
			case 7:
				result = "SEVEN";
				break;
			case 8:
				result = "EIGHT";
				break;
			case 9:
				result = "NINE";
				break;
			default:
				break;
		}
		
		return result;
	}
}