public class Yu {
    /*public static void main(String[] args) {
        int i = 10;//把10赋值给int类型的变量i；
        System.out.println("i:" +i);


        //+=把左边和右边的数字做加法操作的结果赋值给左边
        i += 20;
        //i = i +20;//以上两个操作结果等价
        System.out.println("i:" +i);
        //注意：扩展的赋值运算符底层隐含了强制类型转换
        short s = 10;
        s += 20;
       // s = s +20;错误
        s = (short)(s+20);
        System.out.println("s:"+s);
    }*/
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i:"+i);

        //单独使用
        //i++;//对i的值加1,常用；
        //++i;
        //System.out.println("i:"+i);

        //参与操作使用
        //int j = i++;
       // System.out.println("i:"+i);
        //System.out.println("j:"+j);//因为i++在后面，所以先赋值给了j，不再执行++操作；
        int j = ++i;
         System.out.println("i:"+i);
         System.out.println("j:"+j);//++放在前面先做++操作，然后再赋值给j；


    }
}
