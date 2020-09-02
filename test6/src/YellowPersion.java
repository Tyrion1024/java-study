public class YellowPersion extends Persion {
//  Persion类中的hasSoul不可以变更，因为这个属性使用了final修饰符，已经被定义为常量。

//  构造函数（Persion）不可以直接继承，但是可以通过super来继承。
    public YellowPersion (String n, int a, String s) {
        super(n,a,s);
    }
//  对eat方法进行重写
    @Override
    public void eat() {
        System.out.println(this.name + "吃了一碗黄色的屎");
    }
//  给子类添加特有的新方法
    public void poo() {
        System.out.println(this.name + "拉了一碗黄色的屎");
    }
//  dynamic方法重载
    public void dynamic(int x) {
        System.out.println("阿黄重载dynamic函数，传入的数是" + x);
    }


}
