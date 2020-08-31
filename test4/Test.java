public class Test {
  public static void main (String[] args) {
    // 99乘法表
    for (int i = 1; i < 10; i++) {
      String str = "";
      for (int j = 1; j <= i; j++) {
        str += (j + "*" + i + "=" + i * j);
        if (i != j) {
          str += " ";
        }
      }
      System.out.println(str);
    }
  }
}