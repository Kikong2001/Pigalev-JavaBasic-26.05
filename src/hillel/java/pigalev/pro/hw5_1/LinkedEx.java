package hillel.java.pigalev.pro.hw5_1;

import java.util.LinkedList;
import java.util.List;

public class LinkedEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        System.out.println(list);
        list.add("One");
        list.add("two");
        list.add("three");
        System.out.println(list);
        list.remove("One");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
