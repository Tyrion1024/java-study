public class MainClass {
    public static void main (String[] args) {
        Persion a = new Persion();
        a.age = 50;
        a.name = "小伙a";
        a.sex = "男";
        Persion b = new Persion("小伙b", 30, "女");
        System.out.println("a：" + a.name + " - " + a.sex + " - " + a.age);
        System.out.println("b：" + b.name + " - " + b.sex + " - " + b.age);
        b.eat(a.name);

        a.dynamic(1,2,3,4,5);
    }
}
