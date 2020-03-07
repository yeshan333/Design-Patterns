public interface Printable {
    public abstract void setPrinterName(String name);  //设置打印机名字
    public abstract String getPrinterName();           //获取打印机名字
    public abstract void print(String string);         //打印文字
}