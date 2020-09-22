/*Scanner使用的基本操作
        +导包：import java.until.Scanner；
        导包的动作必须出现在定义类的上边
        +创建对象：Scanner sc = new Scanner（System.in）；
        只有sc是变量名，可以改变，其他的都不能改变
        +接收数据：int i = sc.nextInt();
        只有i是变量名，可以改变，其他的都不能改变*/
import java.util.Scanner;
public class ShuJu {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        int x = sc.nextInt();
        System.out.println("x:" +x);
    }
}
