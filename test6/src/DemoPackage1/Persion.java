package DemoPackage1;

public class Persion {
    public String name;
    public int age;
    public String sex;



    final Boolean hasSoul = true;

    public static void testStatic () {
        System.out.println("Persion类的静态方法testStatic");
    }


    public void eat () {
        System.out.println(name + "吃了一坨屎");
    }

    public void eat (String x) { // 重载eat函数
        System.out.println(x + "喂" + name + "吃了一坨屎");
    }

    public Persion () {
        System.out.println("构造一个无参数persion");
    }

    public Persion (String n, int a, String s) {
        System.out.println("构造一个带参persion");
        name = n;
        this.age = a;
        this.sex = s;
    }

    public void dynamic (int...x) {
        for (int value: x) {
            System.out.println("dynamic函数的中的参数" + value);
        }
    }
}
