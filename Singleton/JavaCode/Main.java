public class Main {
    public static void main(String[] args) {
        System.out.println("开始");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2) {
            System.out.println("obj1 与 obj2 为同一个实例");
        } else {
            System.out.println("obj1 与 obj2 不是同一个实例");
        }
        System.out.println("结束");
    }
}
//javac -encoding UTF-8 Main.java