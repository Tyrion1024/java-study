package ArrObj;

import java.util.ArrayList;


public class MainClass {
    public static void main (String[] args) {
//        Person[] list = {
//                new Person("迪丽热巴", 15),
//                new Person("古力娜扎", 25),
//                new Person("马尔扎哈", 35)
//        };
//
//        for (Person p: list) {
//            System.out.println(p.getName());
//        }

        ArrayList<Person> list = new ArrayList();
        list.add(new Person("迪丽热巴", 15));
        list.add(new Person("古力娜扎", 25));
        list.add(new Person("马尔扎哈", 35));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
