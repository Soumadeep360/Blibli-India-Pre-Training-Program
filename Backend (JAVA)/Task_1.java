/* Question:
Implement a MyList class that contains an integer array of size 100 as a member. 
This class should support the following operations: adding a new value, deleting an element 
based on its index, deleting an element based on its value, and retrieving a value from a specific index. 
The array should dynamically grow, similar to an ArrayList, when more data is added, and shrink when data is deleted.
*/

//Solution:
public class MyList {
    private int[] array;
    private int size;

        MyList() {
        array = new int[100];
        size = 0;
    }

     void add(int value) {
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
        size--;
        if (size <= array.length / 4 && array.length > 100) {
            shrinkArray();
        }
    }

     boolean deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
                return true;
            }
        }
        return false;
    }

     int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of range");
            return -1; 
        }
        return array[index];
    }

     void growArray() {
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

     void shrinkArray() {
        int newCapacity = array.length / 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

     int getSize() {
        return size;
    }

    public static void main(String[] args) {
        MyList myList = new MyList();

        System.out.println("Adding values:");
        for (int i = 1; i <= 150; i++) {
            myList.add(i);
        }
        System.out.println("Values added up to 150.");
        System.out.println("Value at index 50: " + myList.get(50));

        System.out.println("Deleting value at index 50...");
        myList.deleteByIndex(50);
        System.out.println("Value at index 50 after deletion: " + myList.get(50));

        System.out.println("Deleting value 75...");
        boolean deleted = myList.deleteByValue(75);
        if (deleted) {
            System.out.println("Deleted value 75.");
        } else {
            System.out.println("Value 75 not found.");
        }

        System.out.println("Current size of list: " + myList.getSize());

        System.out.println("Retrieving some values:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Index " + i + ": " + myList.get(i));
        }

        System.out.println("Adding more values to trigger array growth:");
        for (int i = 151; i <= 300; i++) {
            myList.add(i);
        }
        System.out.println("Added values up to 300.");
        System.out.println("Final size of list: " + myList.getSize());
    }
}
