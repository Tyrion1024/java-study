public class ThreeMonk {
    public static void main(String[] args) {
        int a =150;
        int b =165;
        int c =210;
        int temp = a > b ? a : b;//比较结果临时保存起来
        int max = temp > c ? temp : c ;//用以上保存的结果与c比较
        //方法2：int max = a > b ? (a>c?a:c):(b>c?b:c);
        //方法3：max = max > c ? max : c;
        System.out.println("max:"+max);

    }
}
