package StringTest;

public class MainClass {
    public static void main (String[] args) {
        String str1 = "abcdefghi";

        // 字符数组转化为字符串
        char[] charArray = {'a', 'b', 'c', 'e', 'f', 'g', 'h', 'i'};
        String str2 = new String(charArray);
        // 字节数组转化为字符串
        byte[] byteArray = {97, 98, 99, 100, 101, 102, 103, 104};
        String str3 = new String(byteArray);
        // == 是比较的String地址
        System.out.println("str1 == str2：" + (str1 == str2));
        System.out.println("str1 == str3：" + (str1 == str3));
        System.out.println("str3 == str2：" + (str3 == str2));

        // equals函数可以用来比较String的内容
        System.out.println("str1.equals(str2)：" + (str1.equals(str2)));
        System.out.println("str1.equals(str3)：" + (str1.equals(str3)));
        System.out.println("str2.equals(str3)：" + (str2.equals(str3)));


        // String自带方法
        // 1.获取字符串长度 str.length()
        System.out.println("str1的长度为：" + str1.length());
        // 2.字符串的拼接 str1.concat(str2)
        System.out.println("str1拼接str2：" + str1.concat(str2));
        // 3.获得字符串中下标为index的字符 str.charAt(index)
        System.out.println("str3中的第三个字符为：" + str3.charAt(2));
        // 4.查找字符串中某字符第一次出现所在的下标，如果不存在则返回-1；
        System.out.println("b在str1中的下标为：" + str1.indexOf("b"));
        System.out.println("str1中没有j，所以str1.indexOf('j')返回了" + str1.indexOf("j"));
        // 5.字符串的截取 substring(int index): 截取传入的下标位置至字符串的末尾，返回一个新的字符串。
        //              substring(int begin, int end)：截取下标begin ~ end（包含左边，不包含右边），返回新的字符串。
        System.out.println("str1截取下标5至字符串的末尾得到：" + str1.substring(5));
        System.out.println("str1截取下标3至下标6得到(不包含6)：" + str1.substring(3, 6));
        // 6.字符串的转换
            // 字符串抓换为字符数组
        char[] charsArray = str2.toCharArray();
        System.out.println("str2.toCharArray()得到的结果如下：");
        for (int i = 0; i < charsArray.length; i++) {
            System.out.print(charsArray[i] + " ");
        }
            // 字符串抓换为字节数组
        byte[] bytesArray = str3.getBytes();
        System.out.println("");
        System.out.println("str2.bytesArray()得到的结果如下：");
        for (int i = 0; i < bytesArray.length; i++) {
            System.out.print(bytesArray[i] + " ");
        }
        System.out.println("");
        // 7.字符串中的字符替换方法 replace
        System.out.println("str1.replace('abc', 'cba')得到的结果是：" +str1.replace("abc", "cba"));
        // 8.字符串分割 split
        String[] stringArray = str3.split("e");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("str3.split('e')第" + i + "项是：" + stringArray[i]);
        }
    }
}
