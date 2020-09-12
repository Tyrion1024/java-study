package DemoPockets;

import java.util.Scanner;

public class MainClass {
    static Scanner scan = new Scanner(System.in);
    static Person user;
    static Pocket pocket;
    public static void main(String[] args) {
        System.out.println("请输入您的昵称");
        String name = scan.nextLine();
        user = new Person(name);
        System.out.println("亲爱的" + user.name + "，请填入一个红包金额（两位小数）");
        double amount = scan.nextDouble();
        System.out.println("亲爱的" + user.name + "，请填入红包的个数");
        int count = scan.nextInt();
        pocket = new Pocket(MyUtil.parseToIntArray(amount), user, count);
        someOneGetPocket();
    }
    public static void someOneGetPocket () {
        if (pocket.count > 0) {
            System.out.println("请输入一个用户名，来领取" + user.name + "的红包。");
            String name = scan.next();
            Person person = new Person(name);
            int[] pocketAmount = person.openPocket(pocket.amount, pocket.count == 1);
            pocket.updatePocket(pocketAmount, person);
            someOneGetPocket();
        } else {
            pocket.printInfo();
        }
    }
}
