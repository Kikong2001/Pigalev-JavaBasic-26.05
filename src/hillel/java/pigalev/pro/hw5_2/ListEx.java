package hillel.java.pigalev.pro.hw5_2;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        Link newList = new Link();
//        String[] array = new String[4];
        String [] arrayTwo = {null, null, null, null};
        List <String> list = new ArrayList<String>();
        newList.add("AA");
        newList.add("AA");
        newList.add("AA");



        list.add("AA");
        list.add("AA");
        list.add("AA");


//        newList.add("AA");
//        newList.add("BB");
//        newList.add("CC");

//        System.out.println(newList.addAll(array));
//        newList.print();
//        System.out.println(newList.addAll(arrayTwo));
//        newList.print();
//        newList.addAll(arrayTwo);
//        newList.print();
//        System.out.println(newList.addAll(list));
        newList.print();
//        System.out.println(newList.delete("BB"));
//        newList.print();
//        System.out.println(newList.delete(1));
//        newList.print();
//        System.out.println(newList.get(2));
//        System.out.println(newList.contains("BB"));
//        newList.print();
//        System.out.println();
//        System.out.println(newList.clear());
//        newList.print();
//        System.out.println(newList.counter);
        System.out.println(newList.size());
        System.out.println();
        System.out.println("****" + newList.compare(list) + "****");




    }
}
