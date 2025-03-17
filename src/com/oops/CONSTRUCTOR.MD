#### **Constructors**

Constructors are special methods used to initialize objects. They have the same name as the class.

```java
class Student {
    String name;

    // Constructor
    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.display();
    }
}
```