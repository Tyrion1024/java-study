/*swich(表达式){
        case值1：
        语句体1；
        break；
        case值2：
        语句体2；
        break；
        ……
default：
        语句体n+1；
        [break;]
        }*/
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
    System.out.println("开始");
    //在键盘输入一个星期（123），输出星期一……
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字（1-7）：");
        int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字有错");
        }
        System.out.println("结束");
    }

}
