import java.util.ArrayList;
import java.util.Iterator;

// 事件源抽象类
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    public void addObserver(Observer observer) {      //注册
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {   //删除
        observers.remove(observer);
    }
    public void notifyObservers() {                   //通知
        Iterator it = observers.iterator();
        while(it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();   // 获取数值
    public abstract void execute();    // 生成数值
}