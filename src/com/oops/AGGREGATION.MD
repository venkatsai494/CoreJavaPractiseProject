### **Aggregation in Java**

**Aggregation** is a type of association that represents a **"has-a" relationship**, similar to composition, but with one key difference: **aggregation implies a weaker relationship** between the containing (whole) class and the contained (part) class. In aggregation, the lifetime of the contained objects is independent of the lifetime of the container.

For example, a university has departments, but a department can exist independently of the university.

* * *

### **Key Characteristics of Aggregation**

1.  **"Has-a" Relationship**: Similar to composition, it models relationships between objects.
2.  **Independence**: The contained (part) object can exist independently of the containing (whole) object.
3.  **Loose Coupling**: The relationship is weaker compared to composition. If the container object is destroyed, the part object can still exist.
4.  **Implemented Using References**: The container holds a reference to the part object, but does not create or own it.

* * *

### **Example: College and Students**

A college **"has-a"** set of students, but the students can exist independently of the college.

```java
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class College {
    private String name;
    private List<Student> students; // Aggregation: College "has-a" list of Students

    College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Independent creation of students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Creating a college and associating students
        College college = new College("Springfield College");
        college.addStudent(s1);
        college.addStudent(s2);

        college.showStudents();
    }
}
```

Here, the `Student` class and its objects exist independently of the `College` class. Even if the `College` object is destroyed, the `Student` objects will still exist.

* * *

### **Difference Between Aggregation and Composition**

| Relationship   | "Has-a" relationship (weaker association)         | "Has-a" relationship (stronger association)       |
|----------------|---------------------------------------------------|---------------------------------------------------|
| Lifetime       | Part objects can exist independently of the whole | Part objects are tightly bound to the whole       |
| Dependency     | Loose coupling                                    | Strong coupling                                   |
| Ownership      | The whole object doesn’t own the part object      | The whole object owns and manages the part object |
| Implementation | Whole holds a reference to the part               | Whole creates and owns the part object            |

* * *

### **Advantages of Aggregation**

1.  **Reusability**: The part object can be shared across multiple whole objects.
2.  **Flexibility**: Objects can be associated or disassociated at runtime.
3.  **Independence**: Changes in one object do not directly impact the other.

* * *

### **Real-World Example: Library and Books**

A library contains books, but books can exist independently of the library.

```java
class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}

class Library {
    private String name;
    private List<Book> books; // Aggregation: Library "has-a" list of Books

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Independent book objects
        Book b1 = new Book("The Catcher in the Rye");
        Book b2 = new Book("To Kill a Mockingbird");

        // Library object
        Library library = new Library("Central Library");
        library.addBook(b1);
        library.addBook(b2);

        library.showBooks();
    }
}
```

Here, the `Book` objects exist independently of the `Library` object. Even if the `Library` is destroyed, the `Book` objects remain valid.

* * *

### **When to Use Aggregation?**

*   When the part can exist independently of the whole.
*   When you want to represent a loose coupling between objects.
*   When multiple containers can share the same part object (e.g., a student attending multiple colleges).

* * *

### **Dynamic Behavior with Aggregation**

Because aggregation uses references, you can associate or disassociate objects dynamically at runtime.

#### Example:

```java
class Team {
    private String name;

    Team(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Player {
    private String name;
    private Team team; // Aggregation: Player "has-a" Team

    Player(String name) {
        this.name = name;
    }

    void setTeam(Team team) {
        this.team = team;
    }

    void showTeam() {
        if (team != null) {
            System.out.println(name + " is part of " + team.getName());
        } else {
            System.out.println(name + " is not part of any team.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Team t1 = new Team("Warriors");
        Team t2 = new Team("Knights");

        Player p1 = new Player("John");

        p1.setTeam(t1); // Associate with team Warriors
        p1.showTeam();

        p1.setTeam(t2); // Change to team Knights
        p1.showTeam();
    }
}
```

Here, the `Player` can dynamically switch teams at runtime.

* * *
