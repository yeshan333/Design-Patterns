public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("代理打印机");
        System.out.println("现在使用的是：" + p.getPrinterName());
        p.setPrinterName("原工作繁忙，现在空闲的打印机");
        System.out.println("现在使用的是：" + p.getPrinterName());
        p.print("你好");
    }
}