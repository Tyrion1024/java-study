package DemoPockets;
import java.math.BigDecimal;
public class MyUtil {
    public static double subDouble(double m1, double m2) {
        BigDecimal p1 = new BigDecimal(Double.toString(m1));
        BigDecimal p2 = new BigDecimal(Double.toString(m2));
        return p1.subtract(p2).doubleValue();
    }

    public static double add(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    public static int[] minus (int[] amount1, int[] amount2) {
        double num = subDouble(parseToDouble(amount1), parseToDouble(amount2));
        return parseToIntArray(num);
    }


    public static int[] parseToIntArray (double num) {
        int[] amount = new int[3];
        String str = "" + num;
        String[] arr =  str.split("\\.");
        if (arr.length > 1) {
            amount[0] = Integer.parseInt(arr[0]);
            char[] charArray = arr[1].toCharArray();
            for (int i = 1; i < amount.length; i++) {
                if ((i - 1) >= charArray.length) {
                    amount[i] = 0;
                } else {
                    amount[i] = charArray[i - 1] - '0';
                }
            }
        } else {
            amount[0] = Integer.parseInt(arr[0]);
            amount[1] = 0;
            amount[2] = 0;
        }
        return amount;
    }


    public static double parseToDouble (int[] amount) {
        return amount[0] + add(0.1 * amount[1], 0.01 * amount[2]);
    }
}
