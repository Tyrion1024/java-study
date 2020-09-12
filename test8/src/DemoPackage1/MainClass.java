package DemoPackage1;

import java.util.Date;
import java.util.Objects;

public class MainClass {
    public static void main(String[] args) {
//        objectTest();
        dateTest();
    }

    static void objectTest () {
        // 两对象之间比较，==运算符对引用类型来说是简单的比较地址，而equals方法的原理其实是返回了两个对象hashCode对比的结果。
        Object obj1 = new Object();
        Object obj2 = obj1;
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("obj1.hashCode() == obj2.hashCode()：" + (obj1.hashCode() == obj2.hashCode()));
        System.out.println("obj1.equals(obj2)：" + obj1.equals(obj2));
        // 如果obj1 为null的话 obj1.equals会报错。这时可以使用Objects.equals(obj1, obj2)这个方法，得到的结果与Obj1.equals(obj2)是一样的。
        System.out.println("Objects.equals(obj1, obj2)：" + Objects.equals(obj1, obj2));
    }

    static void dateTest () {
        Date oraginalDate = new Date(0L); // 格林威治时间
        Date now = new Date();
        System.out.println("new Date().getTime()：" + now.getTime());
    }
}
