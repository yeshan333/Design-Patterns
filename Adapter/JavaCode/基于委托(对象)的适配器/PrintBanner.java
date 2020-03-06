//Adapter
public class PrintBanner extends Print {
    private Banner banner;  //与基于继承的适配器的不同之处
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();  //使用的是其他实例的方法
    }
    public void printStrong() {
        banner.showWithAster();
    }
}