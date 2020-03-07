public class Printer implements Printable {
    private String name;  // 打印机名字
    public Printer() {
        heavyJob("正在生成 Printer 的实例");
    }
    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成 Printer 的实例" + "(" + name + ")");
    }

    public void setPrinterName(String name) {
        this.name = name;
    }
    public String getPrinterName() {
        return name;
    }

    public void print(String string) {
        System.out.println("=== 使用打印机：" + name + " 进行如下打印  ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) { // 工作繁忙
        System.out.print(msg);
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print("."); //伪装实例创建的进度
        }
        System.out.println("结束");
    }
}