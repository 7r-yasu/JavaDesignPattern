import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random(); //乱数発生機
	private int number;                   //現在の数

	//数の取得
	public int getNumber() {
		return number;
	}

	public void execute() {
		for(int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}

}
