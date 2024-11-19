import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.getCGPA(), s1.getCGPA()) != 0) {
                    return Double.compare(s2.getCGPA(), s1.getCGPA());
                } else if (!s1.getName().equals(s2.getName())) {
                    return s1.getName().compareTo(s2.getName());
                } else {
                    return Integer.compare(s1.getID(), s2.getID());
                }
            }
        });

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                queue.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                queue.poll();
            }
        }

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEvents = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();

        for (int i = 0; i < totalEvents; i++) {
            events.add(scanner.nextLine());
        }

        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }

        scanner.close();
    }
}
