import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("小明");  //通过工厂方法获取的实例
        Product card2 = factory.create("小h");
        Product card3 = factory.create("小美");

        card1.use();
        card2.use();
        card3.use();
    }
}