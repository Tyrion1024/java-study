class Test {
  public static void main (String[] args) {
    int a = 1;
    int b = a;
    a = 3;
    System.out.println("a" + a);
    System.out.println("b" + b);
  }

  private static String getType(Object a) {
    return a.getClass().toString();
  }
}