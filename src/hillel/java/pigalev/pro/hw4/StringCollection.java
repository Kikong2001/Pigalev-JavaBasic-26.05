package hillel.java.pigalev.pro.hw4;

import java.util.Arrays;
import java.util.List;

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
        length = newLength;

        return array;
    }

    public void add(String value) {
        if (size == array.length) {
            array = grow();
        }
        array[size] = value;
        size += 1;
    }

    public void add(int number, String value) {
        if ((size + 1) == array.length) {
            array = grow();
        }
        if (number > 0 && number < length - 1) {
            String[] arrayCopy = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayCopy[i] = array[i];
            }
            for (int k = number; k < arrayCopy.length - 1; k++) {
                array[k + 1] = arrayCopy[k];
            }
            array[number] = value;
            size += 1;
        } else {
            System.out.println("NOT_FOUND_INDEX_OF");
        }
    }

    public void deleted(String value) {
        for (int number = 0; number < array.length - 1; number++) {
            if (value == null) {
                if (array[number] == null) {
                    for (int i = number; i < array.length - 1; i++) {
                        String nextElementValue = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = nextElementValue;
                    }
                    break;
                }
            }
            if (array[number] != null && array[number].equals(value)) {
                size -= 1;
                array[number] = null;
                if (number != (array.length - 1)) {
                    for (int k = number; k < array.length - 1; k++) {
                        String nextElementValue = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = nextElementValue;
                    }
                }
                break;
            }
        }
    }

    public void deleted(int number) {
        if (number > 0 && number < array.length) {
            if (array[number] != null) {
                size -= 1;
                array[number] = null;
                if (number != (array.length - 1)) {
                    for (int i = number; i < array.length - 1; i++) {
                        String nextElementValue = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = nextElementValue;
                    }
                }
            }
        }
    }

    public String get(int number) {
        return array[number];
    }

    public boolean contains(String value) {
        for (int i = 0; i < array.length; i++) {
            if (value == null) {
                if (array[i] == null) {
                    return true;
                }
            } else if (array[i] != null) {
                if (array[i].equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equalsArray(List<String> arrayComparison) {
        if (arrayComparison == null) {
            return false;
        }
        if (this.length == arrayComparison.size()) {
            for (int i = 0; i < arrayComparison.size(); i++) {
                if ((array[i] != null && arrayComparison.get(i) == null) || (array[i] == null && arrayComparison.get(i) != null)) {
                    return false;
                }
                if (array[i] != null && !array[i].equals(arrayComparison.get(i))) {
                    return false;
                }

            }
        } else {
            return false;
        }
        return true;
    }

    public boolean equalsArray(String[] arrayComparison) {
        if (arrayComparison == null) {
            return false;
        }
        if (array.length == arrayComparison.length) {
            for (int i = 0; i < arrayComparison.length; i++) {
                if ((array[i] != null && arrayComparison[i] == null) || (array[i] == null && arrayComparison[i] != null)) {
                    return false;
                }
                if (array[i] != null && !array[i].equals(arrayComparison[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public void clear() {
        if (size == array.length) {
            for (int i = 0; i < array.length; i++) {
                array[i] = null;
                size -= 1;
            }
        } else {
            for (int k = 0; k < array.length; k++) {
                if (array[k] != null) {
                    array[k] = null;
                    size -= 1;
                }
            }
        }
    }

    public int indexOf(String value) {
        for (int i = 0; i < array.length; i++) {
            if (value == null) {
                if (array[i] == null) {
                    return i;
                }
            } else if (array[i] != null) {
                if (array[i].equals(value)) {
                    return i;
                }
            }
        }
        return -1;
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
