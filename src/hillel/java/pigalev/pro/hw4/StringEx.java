package hillel.java.pigalev.pro.hw4;

import java.util.ArrayList;
import java.util.List;

public class StringEx {
    public static void main(String[] args) {
        StringCollection array = new StringCollection(6);
        String[] arrayTwo = {null, "AA", "AA", "AA","AA", "AA"};
        List<String> list = new ArrayList<String>();
//        list.add("AA");
//        list.add(null);
//        list.add("AA");

        System.out.println();
        System.out.println(array.toString());
        array.add("AA");
        array.add("AA");
        array.add(null);
        array.add("bb");
        array.add("AA");
        array.add("AA");
        System.out.println(array.toString());
        array.deleted(5);
        System.out.println(array.toString());
//        System.out.println(array.equalsArray(arrayTwo));
//        System.out.println(array.equalsArray(arrayTwo));
//


    }
}
