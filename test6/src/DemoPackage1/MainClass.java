package DemoPackage1;

import DemoPackage1.YellowPersion;

public class MainClass {
    public static void main (String[] args) {
//        新建一个类，构造函数的练习，以及属性和方法的调用
//
//        DemoPackage1.Persion a = new DemoPackage1.Persion();
//        a.age = 50;
//        a.name = "小伙a";
//        a.sex = "男";
//        DemoPackage1.Persion b = new DemoPackage1.Persion("小伙b", 30, "女");
//        System.out.println("a：" + a.name + " - " + a.sex + " - " + a.age);
//        System.out.println("b：" + b.name + " - " + b.sex + " - " + b.age);
//        b.eat(a.name);
//
//        a.dynamic(1,2,3,4,5);




//        新建一个YellowPersion类，继承于Persion，重载（overload）重写（override）方法练习
//        四种修饰符之间的权限区别如下：
//                    public protected default private
//        当前class       √       √       √       √
//        同个package     √       √       √       ×
//        子孙class       √       √       ×       ×
//        其他class       √       ×       ×       ×
        YellowPersion y = new YellowPersion("阿黄", 20, "男");
        y.eat();
        y.poo();
        y.dynamic(8);
        y.testStatic();
    }
}
