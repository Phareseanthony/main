class Person {
    // Private attributes → Encapsulation
    private String name;
    private int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int a) {
        age = a;
    }

    // Display method
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Teacher inherits Person
class Teacher extends Person {
    private String subject;

    Teacher(String n, int a, String s) {
        super(n, a); // call parent constructor
        subject = s;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String s) {
        subject = s;
    }

    public void displayTeacher() {
        displayPerson(); // call parent method
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}

// Student inherits Person
class Student extends Person {
    private int year;

    Student(String n, int a, int y) {
        super(n, a);
        year = y;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public void displayStudent() {
        displayPerson(); // call parent method
        System.out.println("Year: " + year);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create Teacher
        Teacher t1 = new Teacher("Mr. Brian", 35, "Mathematics");

        // Create Student
        Student s1 = new Student("Pharese", 21, 1);

        // Display details
        t1.displayTeacher();
        s1.displayStudent();

    }
}