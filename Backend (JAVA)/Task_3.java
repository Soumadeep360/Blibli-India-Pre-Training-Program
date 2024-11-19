/*
Create a class named Employee with the following fields: id (String), name (String), age (int), 
and dateOfJoining (Date). Use this Employee object with the previously implemented MyList class.
*/

//Solution:

import java.util.Date;

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

    public int getSize() {
        return size;
    }
}

class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    Employee(String id, String name, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println();
    }
}

public class Solution {
    public static void main(String[] args) {

        MyList<Employee> employeeList = new MyList<>();

        employeeList.add(new Employee("E001", "John Doe", 30, new Date()));
        employeeList.add(new Employee("E002", "Ravi Gupta", 28, new Date()));
        employeeList.add(new Employee("E003", "Rahul Kumar", 35, new Date()));

        System.out.println("Employees in the list:");
        for (int i = 0; i < employeeList.getSize(); i++) {
            employeeList.get(i).displayDetails();
        }

        System.out.println("Deleting employee at index 1...");
        employeeList.deleteByIndex(1);
        System.out.println("Employees after deletion:");
        for (int i = 0; i < employeeList.getSize(); i++) {
            employeeList.get(i).displayDetails();
        }
    }
}
