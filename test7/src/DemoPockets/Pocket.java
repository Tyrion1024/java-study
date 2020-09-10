package DemoPockets;


import java.util.ArrayList;

public class Pocket {
    Person creator;
    int count;
    int[] amount = new int[3];
    int[] totalAmount = new int[3];
    int totalCount;

    boolean isOpen = true;

    ArrayList<Person> personsList = new ArrayList<>();

    public Pocket (int[] amount, Person creator, int count) {
        this.totalAmount = amount;
        this.creator = creator;
        this.amount = amount;
        this.count = count;
        this.totalCount = count;
    }

    public void printInfo () {
        System.out.println("=====================================");
        System.out.println(creator.name + "发了一个总金额为" + MyUtil.parseToDouble(this.totalAmount) + "元的" + this.totalCount + "个红包；");
        for (int i = 0; i < this.personsList.size(); i++) {
            System.out.println(this.personsList.get(i).name + "领取了该红包，领取金额为" + MyUtil.parseToDouble(this.personsList.get(i).pocketAmount) + "元；");
        }
        if (this.isOpen) {
            System.out.println("还剩下" + this.count + "个红包没有领取噢~");
        } else {
            System.out.println("红包已经全部被领取了噢~");
        }
    }


    public void updatePocket (int[] minusAmount, Person user) {
        if (this.isOpen) {
            this.personsList.add(user);
            this.count--;
            this.amount = MyUtil.minus(this.amount, minusAmount);
            System.out.println(user.name + "领取了" + MyUtil.parseToDouble(minusAmount) + "元；");
            if (this.count == 0) {
                this.isOpen = false;
            }
        } else {
            System.out.println("来晚啦，红包已被抢完。");
        }
    }
}
