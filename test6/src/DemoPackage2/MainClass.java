package DemoPackage2;

public class MainClass {

    public static void main (String[] args) {
        ChildClass c = new ChildClass("abstract class");
        c.showMsg();
        c.saySomething();
        System.out.println("abstractFunc的结果为：" + c.abstractFunc());
        System.out.println("abstractFunc2的结果为：" + c.abstractFunc2());
        MyEnum e = new MyEnum();

    }
}
