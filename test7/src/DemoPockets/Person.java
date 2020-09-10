package DemoPockets;
import java.util.Random;

public class Person {
    String name;
    int[] pocketAmount = new int[3];

    Person (String name) {
        this.name = name;
    }

    int[] openPocket (int[] amount, boolean getRest) {
        if (!getRest) {
            Random ran = new Random();
            this.pocketAmount[0] = ran.nextInt(amount[0]);
            if (amount[0] == this.pocketAmount[0]) {
                this.pocketAmount[1] = ran.nextInt(amount[1]);
                if (amount[1] == this.pocketAmount[1]) {
                    this.pocketAmount[2] = ran.nextInt(amount[2]);
                } else {
                    this.pocketAmount[2] = ran.nextInt(9);
                }
            } else {
                this.pocketAmount[1] = ran.nextInt(9);
                this.pocketAmount[2] = ran.nextInt(9);
            }
        } else {
            this.pocketAmount = amount;
        }
        return this.pocketAmount;
    }

}
