package framework;

public abstract class Factory {
    public final Product create(String owner) {  // 通过类(工厂)方法获取实例
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);  //根据不同工厂加工的产品返回相应的实例
    protected abstract void registerProduct(Product product);
}