import java.util.Scanner;
public class Test {
  public static void main (String[] args) {
    System.out.println("请输入一个整数");
    int i = 0;
    do {
      try {
        getInput();
        break;
      } catch (Throwable err) {
        if (i == 2) {
          System.out.println("很遗憾，你智商有点感人！");
        } else {
          System.out.println("未能输入正确的整数, 还剩" + (2 - i) + "次机会");
        }
        i++;
      }
    } while (i < 3);
  }

  private static void getInput () {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println("成功输入 " + num);
  }
}