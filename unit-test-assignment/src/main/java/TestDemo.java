import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			int c = a + b;
			return c;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	 int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
    public int randomNumberSquared() {
    	int a = getRandomInt();
    	return a * a;
    }
}
