import java.util.Scanner;
public class JiOu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("是偶数");
        }else {
            System.out.println("是奇数");
        }
    }
}
