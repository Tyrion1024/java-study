package DemoPackage1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class MainClass {
    public static void main(String[] args) throws ParseException {
//        objectTest();
//        dateTest();
//        dataFormatTest();
//        calendarTest();
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

    static  void dataFormatTest () throws ParseException {
        /*
            使用DateFormat类中的format方法将日期格式化为文本
            new SimpleDateFormat对象的时候需要传入一个参数表示格式化成什么格式的文本
            y：年，M：月，d：日，H：时，m：分，s：秒；具体使用方法如下
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String text = sdf.format(new Date());
        System.out.println("按照'yyyy-MM-dd HH:mm:ss'这个模板把new Date() format成字符串得到：" + text);
        System.out.println("按照'yyyy-MM-dd HH:mm:ss'这个模板把之前得到的text变量再parse成Date格式得到：" + sdf.parse(text));
    }

    static void calendarTest () {
        // 首先使用getInstance方法获得Calendar对象
        Calendar c = Calendar.getInstance();
        System.out.println("----------- Calendar对象中有很多的静态成员变量，例如：");
        System.out.println("Calendar.YEAR：" + Calendar.YEAR);
        System.out.println("Calendar.MONTH：" + Calendar.MONTH);
        System.out.println("Calendar.DATE：" + Calendar.DATE);
        System.out.println("Calendar.DAY_OF_MONTH：" + Calendar.DAY_OF_MONTH);
        System.out.println("Calendar.HOUR：" + Calendar.HOUR);
        System.out.println("Calendar.MINUTE：" + Calendar.MINUTE);
        System.out.println("Calendar.SECOND：" + Calendar.SECOND);
        System.out.println("----------- 可以使用Calendar对象提供的get(int field)方法获得给定日历字段的值，使用方法如下:");
        System.out.println("c.get(Calendar.YEAR)：" + c.get(Calendar.YEAR));
        System.out.println("c.get(Calendar.MONTH)：" + c.get(Calendar.MONTH));
        System.out.println("c.get(Calendar.DATE)：" + c.get(Calendar.DATE));
        System.out.println("c.get(Calendar.HOUR)：" + c.get(Calendar.HOUR));
        System.out.println("c.get(Calendar.MINUTE)：" + c.get(Calendar.MINUTE));
        System.out.println("c.get(Calendar.SECOND)：" + c.get(Calendar.SECOND));
        System.out.println("----------- 可以使用Calendar对象提供的set(int field, int value)方法将给定日历字段设置为给定的值，使用方法举例如下:");
        c.set(Calendar.YEAR, 2001);
        System.out.println("执行‘c.set(Calendar.YEAR, 2001)’后再使用’c.get(Calendar.YEAR)‘得到的结果为：" + c.get(Calendar.YEAR));
        c.set(Calendar.MONTH, 6);
        System.out.println("执行‘c.set(Calendar.MONTH, 6)’后再使用’c.get(Calendar.MONTH)‘得到的结果为：" + c.get(Calendar.MONTH));
        System.out.println("----------- Calendar对象的set函数还可以同时设置年月日，执行’c.set(2000, 2, 3)‘后：");
        c.set(2000, 2, 3);
        System.out.println("c.get(Calendar.YEAR)：" + c.get(Calendar.YEAR));
        System.out.println("c.get(Calendar.MONTH)：" + c.get(Calendar.MONTH));
        System.out.println("c.get(Calendar.DATE)：" + c.get(Calendar.DATE));
        System.out.println("----------- 可以使用Calendar对象提供的add(int field, int amount)方法根据日历的规则，为给定的日历字段添加或减去指定是的时间量，使用方法举例如下:");
        c.add(Calendar.YEAR, 5);
        System.out.println("执行‘c.add(Calendar.YEAR, 5)’后再使用’c.get(Calendar.YEAR)‘得到的结果为：" + c.get(Calendar.YEAR));
        c.add(Calendar.YEAR, -15);
        System.out.println("执行‘c.add(Calendar.YEAR, -15)’后再使用’c.get(Calendar.YEAR)‘得到的结果为：" + c.get(Calendar.YEAR));
        System.out.println("----------- 可以使用Calendar对象提供的getTime()方法将日历对象转化为日期对象，c.getTime()得到的结果为：" + c.getTime());


    }
}
