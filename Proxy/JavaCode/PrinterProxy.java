//虚拟代理
public class PrinterProxy implements Printable {
    private String name;
    private Printer real;  //被代理的打印机

    public PrinterProxy(String name) {
        this.name = name;
    }

    public synchronized void setPrinterName(String name) {
        if(real != null) {  //打印机已不再繁忙（实例创建完毕）
            real.setPrinterName(name);
        }
        this.name = name;
    }

    public String getPrinterName() {
        return name;
    }

    public void print(String string) {
        realize();
        real.print(string);//让被代理的打印机做本次打印工作
    }

    private synchronized void realize() {
        if(real == null) {  //创建被代理的打印机
            real = new Printer(name);
        }
    }
}