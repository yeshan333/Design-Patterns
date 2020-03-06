# 基于__new__方法实现的单例模式
# https://www.jianshu.com/p/6a1690f0dd00

class Singleton(object):
    def __init__(self,*args,**kwargs):
        pass

    @classmethod
    def get_instance(cls, *args, **kwargs):
        # 利用反射,看看这个类有没有_instance属性
        if not hasattr(Singleton, '_instance'):
            Singleton._instance = Singleton(*args, **kwargs)

        return Singleton._instance

if __name__ == '__main__':
    # 单线程下安全
    obj1 = Singleton.get_instance()
    obj2 = Singleton.get_instance()
    print("开始")
    if obj1 == obj2:
        print("obj1 与 obj2 为同一个实例")
    else:
        print("obj1 与 obj2 不是同一个实例")
    print("结束")

