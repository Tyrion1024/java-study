/*if 语句格式：
    if （关系表达式）{
        语句体；
        }*/
public class If {
    public static void main(String[] args) {
        System.out.println("开始");
        int a = 10;
        int b = 20;
        int c = 10;
        //判断a和b是否相等，若相等，输出a=b；
        if (a == b){
            System.out.println("a=b");
        }
        //判断a和c是否相等，若相等，输出a=c；
        if (a == c){
            System.out.println("a=c");
        }
        System.out.println("结束");
    }
}