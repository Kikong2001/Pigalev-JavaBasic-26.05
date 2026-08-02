package hillel.java.pigalev.pro.hw4;

import java.util.ArrayList;
import java.util.List;

public class StringEx {
    public static void main(String[] args) {
        StringCollection array = new StringCollection(6);

        System.out.println();
        System.out.println(array.toString());
        array.add("AA");
        array.add("BB");
        array.add("CC");
        System.out.println(array.toString());
        System.out.println(array.getSizeArray());
        array.add(1, "gg");
        System.out.println(array.toString());
        System.out.println(array.getSizeArray());
        System.out.println(array.get(0));
        array.deleted(0);
        System.out.println(array.toString());
    }
}
