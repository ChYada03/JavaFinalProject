package quizgame;

public class PointDistribution {
    private int zero;
    private int one;
    private int five;
    private int ten;

    public PointDistribution() {
        zero = 0;
        one = 0;
        five = 0;
        ten = 0;
    }
    public int getZero() {
    	return zero;
    }
    
    public int getOne() {
    	return one;
    }
    
    public int getFive() {
    	return five;
    }
    
    public int getTen() {
    	return ten;
    }

    public void addPoints(int points) {
        if (points == 0) {
            zero++;
        } else if (points == 1) {
            one++;
        } else if (points == 5) {
            five++;
        } else if (points == 10) {
            ten++;
        }
    }

    public int getTotalPoints() {
        return ((zero * 0) + (one * 1) + (five * 5) + (ten * 10));
    }

    public void resetPoints() {
        zero = 0;
        one = 0;
        five = 0;
        ten = 0;
    }

}