package quizgame;

public class CalculateScore {
	private int one;
	private int two;
	private int three;
	private int four;
	private int five;
	private int six;
	private int seven;

	public CalculateScore() {
		one = 0;
		two = 0;
		three = 0;
		four = 0;
		five = 0;
		six = 0;
		seven = 0;
	}

	public int getOne() {
		return one;
	}

	public int getTwo() {
		return two;
	}

	public int getThree() {
		return three;
	}

	public int getFour() {
		return four;
	}

	public int getFive() {
		return five;
	}
	
	public int getSix() {
		return six;
	}

	public int getSeven() {
		return seven;
	}

	public void addPoints(int points) {
		if (points == 1) {
			one++;
		} else if (points == 2) {
			two++;
		} else if (points == 3) {
			three++;
		} else if (points == 4) {
			four++;
		} else if (points == 5) {
			five++;
		} else if (points == 6) {
			six++;
		} else if (points == 7) {
			seven++;
		}
	}

	public int getTotalPoints() {
		return ((one * 1) + (two * 2) + (three * 3) + (four * 4) + (five * 5) + (six * 10) + (seven * 7));
	}

	public void resetPoints() {
		one = 0;
		two = 0;
		three = 0;
		four = 0;
		five = 0;
		six = 0;
		seven = 0;
	}

}
