package ArraysTest;
import java.util.Arrays;
public class MainClass {
    public static void main(String[] args) {
        int[] intArray = {1, -2, 3, -4, 5, -6};
        // 将参数数组变成字符串 Arrays.toString(intArray)
        System.out.println("讲intArray变成一个字符串，Arrays.toString(intArray)得结果为：" + Arrays.toString(intArray));

        // 将参数数组进行排序 sort，注：1.如果是数值数组，sort默认升序排列。2.如果是字符串数组，sort按字母升序。3.如果是自定义类型数组，那么这个自定义类型必须含有comparable或comparator接口支持。
        Arrays.sort(intArray);
        System.out.println("intArray升序排列，Arrays.sort(intArray)得结果为：" + Arrays.toString(intArray));
    }
}
