import java.util.Scanner;
public class KaoShi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入李大伟的分数：");
        int a = sc.nextInt();
        if(a >100||a <0){
            System.out.println("你输入的分数有误");
        }else if (a >=95&a<=100){
            System.out.println("奖励一辆自行车");
        }else if(a>=90&a<=94){
            System.out.println("去游乐场玩一天");
        }else if(a>=80&a<=89){
            System.out.println("奖励一个变形金刚");
        }else {
            System.out.println("接受小服臭一顿暴打");
        }
    }
}
