package hillel.java.pigalev.pro.hw5_2;

import java.util.Collection;

public class Link implements CustomCollection {
    public Link next;
    protected MyNode first;
    protected int counter;

    public Link() {
        this.first = null;
    }

    public void print() {
        MyNode current = first;
        while (current != null) {
            System.out.print(current.number + "-->");
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("null");
    }

    @Override
    public boolean add(String str) {
//        if (str == null || str.isEmpty()) {
//            return false;
//        }
        MyNode newLink = new MyNode(str);
        newLink.next = first;
        first = newLink;
        MyNode current = first;
        for (int i = 0; current != null; i++) {
            current.number = i;
            current = current.next;
        }
        if (str != null) {
            counter++;
        }
        return true;

    }

    @Override
    public boolean addAll(String[] strArr) {
        boolean modified = false;
        for (String str : strArr) {
//            if (str != null) {
            add(str);
            modified = true;
//            }
        }
        return modified;
    }

    public boolean addAll(Collection strColl) {
        boolean modified = false;
        for (Object obj : strColl) {
            String str = (String) obj;
//            if (str != null) {
            add(str);
            modified = true;
//            }
        }
        return modified;
    }

    @Override
    public boolean delete(int index) {
        MyNode current = first;
        MyNode previous = first;
        boolean modified = false;
        while (current != null) {
            if (current.number == index) {
                if (current == first) {
                    first = first.next;  // Замінює посілання first на наступний об'єкт
                } else {
                    previous.next = current.next; // Замінює посілання елемента в середині списку на наступний об'єкт
                }
                current.next = null;
                modified = true;
                counter--;
                break;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (modified) {
            MyNode currentIndex = first;
            for (int i = 0; currentIndex != null; i++) { // Перераховує number
                currentIndex.number = i;
                currentIndex = currentIndex.next;
            }
        }
        return modified;
    }

    @Override
    public boolean delete(String str) {
        MyNode current = first;
        MyNode previous = first;
        boolean modified = false;
        while (current != null) {
            if (current.value != null && current.value.equals(str)) {
                if (current == first) {
                    first = first.next;  // Замінює посілання first на наступний об'єкт
                } else {
                    previous.next = current.next; // Замінює посілання елемента в середині списку на наступний об'єкт
                }
                current.next = null;
                modified = true;
                counter--;
                break;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (modified) {
            MyNode currentIndex = first;
            for (int i = 0; currentIndex != null; i++) { // Перераховує number
                currentIndex.number = i;
                currentIndex = currentIndex.next;
            }
        }
        return modified;
    }

    @Override
    public String get(int index) {
        MyNode current = first;
        while (current != null) {
            if (current.number == index) {
                return current.number + "-->" + current.value;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    @Override
    public boolean contains(String str) {
        if (str == null || first == null) {
            return false;
        }
        MyNode current = first;
        while (current != null) {
            if (current.value != null && current.value.equals(str)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        if (first == null) {
            return false;
        }
        first = null;
        counter = 0;
        return true;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean trim() {
        MyNode current = first;
        MyNode previous = first;
        boolean modified = false;
        while (current != null) {
            if (current.value == null) {
                if (current == first) {
                    first = first.next;
                    previous = first;
                    current = first;
                } else {
                    previous.next = current.next;
                    current = current.next;
                }
                modified = true;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (modified) {
            MyNode currentIndex = first;
            for (int i = 0; currentIndex != null; i++) {
                currentIndex.number = i;
                currentIndex = currentIndex.next;
            }
        }
        return modified;
    }

    public boolean compare(Collection coll) {
        MyNode current = first;
        for (Object obj : coll) {
            String str = (String) obj;
            if (!current.value.equals(str)) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
