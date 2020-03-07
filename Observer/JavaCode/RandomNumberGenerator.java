import java.util.Random;

// 具体事件源, 观察对象
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    public int getNumber() {
        return number;
    }
    public void execute() {
        for(int i = 0; i < 20; i++) {
            number = random.nextInt(50);    // 0-50的随机整数
            this.notifyObservers();
        }
    }
}