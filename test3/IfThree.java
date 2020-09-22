/*格式3：if（关系表达式）{
        语句主体1；}else if（关系表达式2）{
        语句体2；}
        else{
        语句体n+1；}*/
import java.util.Scanner;
public class IfThree {
    public static void main(String[] args) {
        System.out.println("开始");
        //需求：键盘输入1，2，3……，输出星期一，星期二……
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数：");
        int week = sc.nextInt();
        if(week == 1){
            System.out.println("星期一");
        }else if(week == 2){
            System.out.println("星期二");
        }else if(week == 3){
            System.out.println("星期三");
        }else if (week == 4){
            System.out.println("星期四");
        }else if (week == 5){
            System.out.println("星期五");
        } else if (week == 5){
            System.out.println("星期六");
        }else{
            System.out.println("星期日");
        }
        System.out.println("结束");
    }
}
