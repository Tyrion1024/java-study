import java.util.Scanner;
public class Spring {
    public static void main(String[] args) {
        System.out.println("开始：");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份1-12：");
        int season = sc.nextInt();
        /*switch(season){
            case 1:
            System.out.println("冬天");
            break;
            case 2:
                System.out.println("冬天");
                break;
            case 3:
                System.out.println("春天");
                break;
            case 4:
                System.out.println("春天");
                break;
            default:
                System.out.println("输入错误");
        }
        */
        //case穿透
        switch (season) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("秋天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
