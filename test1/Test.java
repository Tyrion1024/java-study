class Test {
  public static void main (String[] args) {
    int a = 1;
    for (int i = 0; i < 1000; i++) {
      a++;
    }
    System.out.println(a);
  }


  private static String getType(Object a) {
    return a.getClass().toString();
  }
}