### **Multithreading in Java - Detailed Explanation with Code**

#### **What is Multithreading?**

Multithreading is a feature in Java that allows concurrent execution of two or more parts of a program to maximize CPU utilization. Each part of such a program is called a **thread**. Threads are lightweight processes that share the same memory space but can execute independently.

#### **Key Concepts of Multithreading**

*   **Thread**: A lightweight process.
*   **Concurrency**: Running multiple tasks simultaneously.
*   **Parallelism**: Running tasks on multiple CPU cores.
*   **Thread Lifecycle**: New → Runnable → Running → Blocked/Waiting → Terminated.

* * *

**Creating Threads in Java**
----------------------------

Java provides two ways to create threads:

### **1\. Extending the `Thread` class**

The simplest way to create a thread is by extending the `Thread` class and overriding the `run()` method.

#### **Example: Creating a Thread by Extending `Thread` Class**

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Pause execution for 1 second
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}
```

### **Output**

```
Thread-0 - Count: 1
Thread-1 - Count: 1
Thread-0 - Count: 2
Thread-1 - Count: 2
...
```

Each thread runs independently, and `Thread.sleep(1000)` introduces a delay to simulate real-world processing.

* * *

### **2\. Implementing the `Runnable` Interface**

Using `Runnable` is preferred in Java as it allows the class to extend another class (since Java supports single inheritance).

#### **Example: Creating a Thread by Implementing `Runnable`**

```java
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}
```

The output is similar to the previous example.

* * *

**Thread Lifecycle**
--------------------

A thread can be in one of the following states:

1.  **New**: Created but not started.
2.  **Runnable**: Ready to run, waiting for CPU.
3.  **Running**: Executing its task.
4.  **Blocked/Waiting**: Waiting due to synchronization or I/O.
5.  **Terminated**: Execution completed.

* * *

**Thread Methods**
------------------

### **1\. `start()`**

Starts a thread by calling its `run()` method.

### **2\. `sleep(milliseconds)`**

Pauses execution for the given milliseconds.

```java
Thread.sleep(1000); // Pauses for 1 second
```

### **3\. `join()`**

Waits for a thread to finish before proceeding.

```java
t1.join(); // Main thread waits until t1 finishes
```

### **4\. `yield()`**

Suggests to the CPU that the thread should pause and allow other threads to execute.

### **5\. `setPriority(int priority)`**

Changes the thread's priority (1 to 10).

* * *

**Synchronization in Multithreading**
-------------------------------------

When multiple threads access shared resources, **race conditions** may occur. To prevent this, we use **synchronization**.

### **Example: Synchronizing a Shared Resource**

```java
class SharedResource {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + (n * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;
    MyThread(SharedResource resource) {
        this.resource = resource;
    }
    public void run() {
        resource.printNumbers(5);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);

        t1.start();
        t2.start();
    }
}
```

### **Output (No race condition due to `synchronized`)**

```
Thread-0 - 5
Thread-0 - 10
Thread-0 - 15
Thread-0 - 20
Thread-0 - 25
Thread-1 - 5
Thread-1 - 10
Thread-1 - 15
Thread-1 - 20
Thread-1 - 25
```

* * *

**Deadlocks in Multithreading**
-------------------------------

A deadlock occurs when two threads hold resources the other needs, causing a freeze.

### **Example of Deadlock**

```java
class Resource {
    synchronized void methodA(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is in methodA");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        r.methodB(this); // Wait for other resource
    }

    synchronized void methodB(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is in methodB");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        r.methodA(this); // Wait for other resource
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        new Thread(() -> r1.methodA(r2), "Thread-1").start();
        new Thread(() -> r2.methodB(r1), "Thread-2").start();
    }
}
```

This results in a deadlock because each thread waits indefinitely.

* * *

**Thread Pooling using `ExecutorService`**
------------------------------------------

Creating multiple threads can be resource-intensive. Instead, Java provides thread pools.

### **Example of Thread Pool**

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing a task");
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(new Task());
        }

        executor.shutdown();
    }
}
```

### **Output**

```
pool-1-thread-1 is executing a task
pool-1-thread-2 is executing a task
pool-1-thread-3 is executing a task
pool-1-thread-1 is executing a task
pool-1-thread-2 is executing a task
```

The thread pool reuses threads instead of creating new ones, improving performance.

* * *

**Conclusion**
--------------

*   **Multithreading improves performance** by running tasks in parallel.
*   **Use `synchronized` to avoid race conditions**.
*   **Avoid deadlocks** by carefully structuring thread interactions.
*   **Use thread pools** to manage resources efficiently.