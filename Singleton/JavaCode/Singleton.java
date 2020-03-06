public class Singleton {
    private static Singleton singleton = new Singleton();
    //私有的构造方法
    private Singleton() {
        System.out.println("生成了一个实例！");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}