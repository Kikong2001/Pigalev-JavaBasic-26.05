package hillel.java.pigalev.pro.hw5_2;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        Link newList = new Link();
        List<String> list = new ArrayList<String>();
        newList.add("A");
        newList.add("B");
        newList.add("C");

        list.add("A");
        list.add("B");
        list.add("C");

        newList.print();
        System.out.println(newList.size());
        System.out.println();
        System.out.println(newList.get(0));
        System.out.println();
        System.out.println(newList.compare(list));
        System.out.println();
        System.out.println(newList.delete("B"));
        System.out.println();
        System.out.println(newList.delete(10));
        System.out.println();
        newList.add(null);
        newList.print();
        System.out.println(newList.size());
        System.out.println();
        System.out.println(newList.trim());
        newList.print();
        System.out.println(newList.size());

    }
}
