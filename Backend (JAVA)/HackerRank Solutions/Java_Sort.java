import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.cgpa != b.cgpa) {
            return Double.compare(b.cgpa, a.cgpa);
        } else if (!a.name.equals(b.name)) {
            return a.name.compareTo(b.name);
        } else {
            return Integer.compare(a.id, b.id);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new StudentComparator());

        for (Student student : students) {
            System.out.println(student.name);
        }

        scanner.close();
    }
}
