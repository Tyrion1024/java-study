package RandomTest;

import java.util.Random;
import java.util.Scanner;


public class MainClass {

    static int result;

    public static void main (String[] args) {
        Random ran = new Random();
        result = ran.nextInt(9);
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------- 猜数字游戏 -------------------");
        System.out.println("--------答案是一个0~9之间的数字，试着猜一下吧--------");
        dealScan(scan);
    }

    public static void dealScan (Scanner scan) {
        int num = scan.nextInt();
        if (num == result) {
            System.out.println("++++++++++猜对啦，游戏结束++++++++++");
        } else {
            System.out.println("··········猜错咯，请再接再厉··········");
            dealScan(scan);
        }
    }
}
