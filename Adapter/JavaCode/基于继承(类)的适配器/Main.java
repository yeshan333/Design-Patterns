//Client 请求方，使用 Target 的方法进行具体处理
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello"); // 泛
        p.printWeak();
        p.printStrong();
    }
}