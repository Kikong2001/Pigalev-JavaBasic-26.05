package hillel.java.pigalev.pro.hw4;

import java.util.Arrays;

public class StringCollection {
    private String[] array;
    private int length;
    private int size = 0;

    public StringCollection(int length) {
        this.length = length;
        this.array = new String[length];
    }

    private String[] grow() {
        int newLength = 0;
        newLength = ((length * 3) / 2) + 1;
        String[] newArray = new String[newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

        return array;
    }

    public void add(String value) {
        if ((size + 1) == array.length) {
            array = grow();
        }
        array[size] = value;
        size += 1;
    }

    public void add(int number, String value) {
        if ((size + 1) == array.length) {
            array = grow();
        }
        String[] arrayCopy = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        for (int k = number; k < arrayCopy.length - 1; k++) {
            array[k + 1] = arrayCopy[k];
        }
        array[number] = value;
        size += 1;
    }

    public void deleted(String value) {
        int number = 0;
        for (int i = 0; i <= size - 1; i++) {
            if (array[i].equals(value)) {
                size -= 1;
                number = i;
                array[i] = null;
                break;
            }
        }
        if (number != (array.length - 1)) {
            for (int i = number; i < array.length - 1; i++) {
                String nextElementValue = array[i];
                array[i] = array[i + 1];
                array[i + 1] = nextElementValue;
            }
        }
    }

    public void deleted(int number) {
        size -= 1;
        array[number] = null;
        if (number != (array.length - 1)) {
            for (int i = number; i < array.length-1; i++) {
                String nextElementValue = array[i];
                array[i] = array[i + 1];
                array[i + 1] = nextElementValue;
            }
        }
    }

    public String get(int number) {
        return array[number];
    }

    public boolean contains(String value) {
        boolean contains = false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                contains = true;
            }
        }
        return contains;
    }

    public boolean equalsArray(StringCollection arrayComparison) {
        boolean markerComparison = true;
        if (this.length == arrayComparison.length) {
            for (int i = 0; i <= arrayComparison.length - 1; i++)
                if (!array[i].equals(arrayComparison.array[i])) {
                    markerComparison = false;
                    break;
                }
        } else {
            markerComparison = false;
        }
        return markerComparison;
    }

    public boolean equalsArray(String[] arrayComparison) {
        boolean markerComparison = true;
        if (array.length == arrayComparison.length) {
            for (int i = 0; i <= arrayComparison.length - 1; i++)
                if (!array[i].equals(arrayComparison[i])) {
                    markerComparison = false;
                    break;
                }
        } else {
            markerComparison = false;
        }
        return markerComparison;
    }

    public void clear() {
        if (size == array.length) {
            for (int i = 0; i < array.length; i++) {
                array[i] = null;
                size -= 1;
            }
        } else {
            for (int k = 0; k < size; k++) {
                array[k] = null;
                size -= 1;
            }
        }
    }

    public String indexOf(String value) {
        String index = "NOT_FOUND_INDEX_OF";
        for (int i = 0; i <= size - 1; i++) {
            if (array[i].equals(value)) {
                index = String.valueOf(i);
                break;
            }
        }
        return index;
    }

    public int getSizeArray() {
        return size;
    }

    @Override
    public String toString() {
        return "StringCollection{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
