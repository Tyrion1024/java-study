/*格式：
if （关系表达式）{
    语句体1；true
        }else{
    语句体2；false
        }*/
public class IfTwo {
    public static void main(String[] args) {
        System.out.println("开始");
        int a = 10;
        int b = 20;
        //判断a是否大于b，是则输出a>b,否则输出a<b;
        if (a > b){
            System.out.println("a>b");
        }else{
            System.out.println("a<b");
        }
        System.out.println("结束");
    }
}
