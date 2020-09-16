public class LuoJi {
    /*public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;

        //&：有false则false
        System.out.println((i > j) & (i > k));//false & false
        System.out.println((i < j) & (i > k));//true & false
        System.out.println((i > j) & (i < k));//false & true
        System.out.println((i < j) & (i < k));//true & true
        System.out.println("--------");

        //|:有true则true
        System.out.println((i > j) | (i > k));//false | false
        System.out.println((i < j) | (i > k));//true | false
        System.out.println((i > j) | (i < k));//false | true
        System.out.println((i < j) | (i < k));//true | true
        System.out.println("--------");

        //^:相同为false，不同为true
        System.out.println((i > j) ^ (i > k));//false ^ false
        System.out.println((i < j) ^ (i > k));//true ^ false
        System.out.println((i > j) ^ (i < k));//false ^ true
        System.out.println((i < j) ^ (i < k));//true ^ true
        System.out.println("--------");

        //!:
        System.out.println((i > j));//false
        System.out.println(!(i > j));//!false
        System.out.println(!!(i > j));//!!false
        System.out.println(!!!(i > j));//!!!false
        System.out.println("--------");


        //&&：有false则false
        System.out.println((i > j) && (i > k));//false && false
        System.out.println((i < j) && (i > k));//true && false
        System.out.println((i > j) && (i < k));//false && true
        System.out.println((i < j) && (i < k));//true && true
        System.out.println("--------");


        //||:有true则true
        System.out.println((i > j) || (i > k));//false || false
        System.out.println((i < j) || (i > k));//true || false
        System.out.println((i > j) || (i < k));//false || true
        System.out.println((i < j) || (i < k));//true || true
        System.out.println("--------");


        //&&和&：
        //System.out.println((i++ >100) & (j++ >100));//false&false
        System.out.println((i++ >100) && (j++ >100));//false&&false  左边为false右边的操作不执行
        System.out.println("i:" +i);
        System.out.println("j:" +j);*/

        //||和|:||左边是true右边就不执行

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //获取2个数据中的较大值
        int max = a > b ? a : b;
        System.out.println("max:" + max);
    }
}
