public class StudentReport {
    static class Student {
        private String name;
        private int rollNumber;
        private double marks;

        public Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        public String grade() {
            if (marks >= 90) return "A+";
            if (marks >= 80) return "A";
            if (marks >= 70) return "B";
            if (marks >= 60) return "C";
            if (marks >= 50) return "D";
            return "F";
        }

        public void display() {
            System.out.println("Student Report:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade());
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Rahul", 23, 82.5);
        s.display();
    }
}
