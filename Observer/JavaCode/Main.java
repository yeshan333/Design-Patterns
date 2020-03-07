public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1); // 注册观察者
        generator.addObserver(observer2);

        generator.execute();
    }
}