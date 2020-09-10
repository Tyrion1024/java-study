package MathTest;

public class MainClass {
    public static void main(String[] args) {
        // 取绝对值
        Math.abs(-12.548877);
        // 向上取整
        Math.ceil(5484.18488879);
        // 向下取整
        Math.floor(511.99999);
        // 四舍五入
        Math.round(5.54887);
        Math.round(5.49887);
        // 取Π的值
        System.out.println(Math.PI);


        System.out.println(numberCounter(-10.8, 5.9));
    }


    static int numberCounter (double min, double max) {
        int count = 0;
        min = (int)Math.ceil(min);
        max = (int)Math.floor(max);

        for (; min <= max; min++) {
            if (Math.abs(min) > 6 || Math.abs(min) < 2.1) {
                count++;
            }
        }
        return count;
    }
}
