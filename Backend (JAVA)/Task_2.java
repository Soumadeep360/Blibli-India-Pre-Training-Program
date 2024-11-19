/*
Implement a generic MyList class with a member that holds a generic array of size 100. 
This class should support the following operations: adding a new value, deleting an element based on its index, 
deleting an element based on its value, and retrieving a value from a specific index. The class should be capable of creating lists for 
Integer, String, and custom classes. Use the same structure as the previous class and make it generic.
*/

//Solution:

class MyList<T> {
    private T[] array;
    private int size;

    MyList() {
        array = (T[]) new Object[100];
        size = 0;
    }

    void add(T value) {
        if (size == array.length) {
            growArray();
        }
        array[size++] = value;
    }

    void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of range");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        if (size <= array.length / 4 && array.length > 100) {
            shrinkArray();
        }
    }

    boolean deleteByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                deleteByIndex(i);
                return true;
            }
        }
        return false;
    }

    T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of range");
            return null;
        }
        return array[index];
    }

    void growArray() {
        int newCapacity = array.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    void shrinkArray() {
        int newCapacity = array.length / 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    int getSize() {
        return size;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Operations with Integer
        MyList<Integer> intList = new MyList<>();
        System.out.println("Adding integer values:");
        for (int i = 1; i <= 50; i++) {
            intList.add(i);
        }
        System.out.println("Value at index 20: " + intList.get(20));
        intList.deleteByIndex(20);
        System.out.println("Value at index 20 after deletion: " + intList.get(20));
        System.out.println("Current size of integer list: " + intList.getSize());

        // Operations with String
        MyList<String> strList = new MyList<>();
        System.out.println("\nAdding string values:");
        for (int i = 1; i <= 5; i++) {
            strList.add("String" + i);
        }
        System.out.println("Value at index 2: " + strList.get(2));
        strList.deleteByIndex(2);
        System.out.println("Value at index 2 after deletion: " + strList.get(2));
        System.out.println("Current size of string list: " + strList.getSize());
    }
}
