import java.util.Scanner;
public class ThreeMonks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        //键盘输入三个变量
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();
        int maxHeight = height1>height2 ?(height1 > height3 ? height1:height3):(height2 > height3 ? height2:height3);
        //int tempHeight = height1 > height2 ? height1:height2;
       // int maxHeight = tempHight > height3 ? tempHeight:height3;
        System.out.println("maxHeight:"+maxHeight);
    }
}
