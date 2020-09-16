public class GuanXi {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 10;
        //==
        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println("--------");

        //!=
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("--------");

        //>
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("--------");

        //>=
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("--------");

        //不小心把==写成了=,输出20，因为这是做的赋值运算而非比较关系
        System.out.println(i = j);//把j的值赋给了i;
    }
}
