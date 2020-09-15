public class Test {
  // public static void main (String[] args) {
  //   int a = 1;
  //   for (int i = 0; i < 1000; i++) {
  //     a++;
  //   }
  //   System.out.println(a);
  // }


  // private static String getType(Object a) {
  //   return a.getClass().toString();
  // }
  static int b = 20;
  public static void main (String[] args) {
    eat();
    //变量的声明（定义变量）
    //java 是一个强类型的语言，只要声明变量就必须定义类型
    int age ;
    //对变量就行赋值；
    age = 10;
    age = 20;
    age = 12;
    age = age + 4;
    System.out.println("bb "+b);
    System.out.println(age);
    System.out.println(age-2);
    int num = age + 10;
    System.out.println(num);
    // System.out.println(a); no
    int a = 10;
    System.out.println(a); //yes
    System.out.println(b); //yes
    {
      int c = 33;
      System.out.println(a); //yes
      //int a = 40;属于变量的重复定义
    }
  }

  public static void eat() {
    System.out.println("eat  "+b); //yes
    // System.out.println(a); no
    int a = 30;//不是变量的重复定义
    System.out.println(a); //yes

  }

}