**String Manipulation in Java (Detailed Explanation with Examples)**
--------------------------------------------------------------------

### **Why is `String` Immutable in Java?**

A `String` in Java is **immutable**, meaning once a `String` object is created, it cannot be modified.

#### **Reasons for Immutability:**

1.  **String Pool Efficiency**:

    *   Java maintains a **String pool** in the heap memory to optimize memory usage.
    *   If `String` were mutable, modifying one reference would affect all references pointing to that string, causing unpredictable behavior.
2.  **Security Reasons**:

    *   Strings are used in critical components like **usernames, passwords, and URLs**.
    *   If a `String` were mutable, modifying it could lead to security vulnerabilities.
3.  **Thread Safety**:

    *   Since `String` is immutable, multiple threads can safely share the same `String` object without synchronization.
4.  **HashCode Caching**:

    *   The `hashCode()` of a `String` is frequently used in **hash-based collections** (like `HashMap`).
    *   If `String` were mutable, its hash code would change, causing lookup failures.

* * *

**String Manipulation in Java**
-------------------------------

### 1️⃣ **Creating Strings**

```java
String str1 = "Hello"; // String literal
String str2 = new String("World"); // Using new keyword
```

*   **String literals** are stored in the **String pool**, while `new` creates a new object in the heap.

* * *

### 2️⃣ **Concatenation**

#### **Using `+` Operator**

```java
String s1 = "Hello";
String s2 = " World";
String result = s1 + s2;
System.out.println(result); // Hello World
```

#### **Using `concat()` Method**

```java
String result = s1.concat(s2);
System.out.println(result); // Hello World
```

🔹 `+` internally uses `StringBuilder`, making it **slower** than `concat()` for multiple concatenations.

* * *

### 3️⃣ **Comparing Strings**

#### **Using `equals()` (Content Comparison)**

```java
String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");

System.out.println(s1.equals(s2)); // true
System.out.println(s1.equals(s3)); // true
```

🔹 `equals()` compares the **content**.

#### **Using `==` Operator (Reference Comparison)**

```java
System.out.println(s1 == s2); // true (same reference from the pool)
System.out.println(s1 == s3); // false (different objects)
```

🔹 `==` compares the **memory location**.

#### **Using `compareTo()` (Lexicographical Comparison)**

```java
String s1 = "Apple";
String s2 = "Banana";

System.out.println(s1.compareTo(s2)); // Negative (-ve) because "Apple" comes before "Banana"
```

🔹 Returns:

*   **0** if equal
*   **Positive (+ve)** if `s1` is lexicographically greater
*   **Negative (-ve)** if `s1` is smaller

* * *

### 4️⃣ **Extracting a Substring**

```java
String s = "Automation";
System.out.println(s.substring(0, 4)); // Auto
System.out.println(s.substring(5));    // mation
```

🔹 `substring(start, end)` → Extracts characters from **start** to `end - 1`.

* * *

### 5️⃣ **Finding Length of a String**

```java
String s = "Hello World";
System.out.println(s.length()); // 11
```

* * *

### 6️⃣ **Character Extraction**

#### **Using `charAt()`**

```java
String s = "Java";
System.out.println(s.charAt(2)); // v
```

#### **Using `toCharArray()`**

```java
char[] arr = s.toCharArray();
for (char c : arr) {
    System.out.print(c + " "); // J a v a
}
```

* * *

### 7️⃣ **Searching in a String**

#### **Using `contains()`**

```java
String s = "Automation Testing";
System.out.println(s.contains("Testing")); // true
```

#### **Using `indexOf()`**

```java
String s = "Automation";
System.out.println(s.indexOf('t'));  // 2
System.out.println(s.indexOf("tom")); // 2
System.out.println(s.indexOf("xyz")); // -1 (Not found)
```

#### **Using `lastIndexOf()`**

```java
System.out.println(s.lastIndexOf('t')); // 6
```

* * *

### 8️⃣ **Replacing Characters or Substrings**

```java
String s = "Hello Java";
System.out.println(s.replace('a', 'o')); // Hello Jovo
System.out.println(s.replace("Java", "World")); // Hello World
```

* * *

### 9️⃣ **Changing Case**

```java
String s = "Automation";
System.out.println(s.toUpperCase()); // AUTOMATION
System.out.println(s.toLowerCase()); // automation
```

* * *

### 🔟 **Trimming Whitespaces**

```java
String s = "  Hello  ";
System.out.println(s.trim()); // "Hello"
```

🔹 `trim()` removes leading and trailing spaces but **not** spaces in the middle.

* * *

### 1️⃣1️⃣ **Splitting a String**

```java
String s = "apple,banana,grape";
String[] arr = s.split(",");

for (String word : arr) {
    System.out.println(word);
}
/*
apple
banana
grape
*/
```

* * *

### 1️⃣2️⃣ **String to Other Types**

#### **Convert String to Integer**

```java
String numStr = "100";
int num = Integer.parseInt(numStr);
System.out.println(num + 50); // 150
```

#### **Convert Integer to String**

```java
int num = 100;
String numStr = String.valueOf(num);
System.out.println(numStr + "50"); // 10050
```

* * *

### 1️⃣3️⃣ **Using `StringBuilder` and `StringBuffer` (Mutable Alternatives)**

Since `String` is immutable, **`StringBuilder`** and **`StringBuffer`** are used for performance-intensive string manipulations.

#### **Using `StringBuilder` (Faster, Not Thread-Safe)**

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Hello World
```

#### **Using `StringBuffer` (Thread-Safe, Slower)**

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
System.out.println(sb.toString()); // Hello Java
```

* * *

**Summary of Key Takeaways**
----------------------------

✅ **String is immutable** due to memory efficiency, security, thread safety, and hash code caching.  
✅ **Common methods**: `substring()`, `indexOf()`, `replace()`, `toUpperCase()`, `split()`, etc.  
✅ **Concatenation**: Use `concat()` or `StringBuilder` instead of `+` for better performance.  
✅ **Comparison**: `equals()` for content, `==` for reference, `compareTo()` for lexicographic order.  
✅ **`StringBuilder` vs `StringBuffer`**: Use `StringBuilder` for performance; `StringBuffer` if thread safety is needed.

The difference between [StringBuilder](STRING_BUILDER.MD) and [StringBuffer](STRING_BUFFER.MD) can be found [here]().


Few more manipulation

---

## **📝 Complete List of Java String Methods with Examples**

| **Method**            | **Description** |
|----------------------|----------------|
| `charAt(int index)`  | Returns character at the specified index. |
| `length()`           | Returns the length of the string. |
| `substring(int beginIndex, int endIndex)` | Extracts a portion of a string. |
| `indexOf(String str)` | Returns the first index of the substring. |
| `lastIndexOf(String str)` | Returns the last index of the substring. |
| `startsWith(String prefix)` | Checks if string starts with a given prefix. |
| `endsWith(String suffix)` | Checks if string ends with a given suffix. |
| `contains(CharSequence s)` | Checks if string contains the given sequence. |
| `equals(Object obj)` | Compares string content. |
| `equalsIgnoreCase(String anotherString)` | Compares strings ignoring case. |
| `compareTo(String anotherString)` | Lexicographically compares strings. |
| `compareToIgnoreCase(String str)` | Case-insensitive lexicographical comparison. |
| `concat(String str)` | Concatenates two strings. |
| `replace(char oldChar, char newChar)` | Replaces occurrences of a character. |
| `replaceAll(String regex, String replacement)` | Replaces substrings matching regex. |
| `replaceFirst(String regex, String replacement)` | Replaces the first occurrence of regex. |
| `toLowerCase()` | Converts to lowercase. |
| `toUpperCase()` | Converts to uppercase. |
| `trim()` | Removes leading and trailing spaces. |
| `split(String regex)` | Splits a string using a regex delimiter. |
| `toCharArray()` | Converts string to character array. |
| `isEmpty()` | Checks if string is empty (`""`). |
| `strip()` | Removes leading and trailing whitespace (Java 11+). |
| `stripLeading()` | Removes only leading spaces (Java 11+). |
| `stripTrailing()` | Removes only trailing spaces (Java 11+). |
| `repeat(int count)` | Repeats the string `count` times (Java 11+). |
| `join(CharSequence delimiter, CharSequence... elements)` | Joins multiple strings with a delimiter. |

---

## **🛠️ String Methods with Examples**

### **1️⃣ Checking Start and End of a String**
#### **Using `startsWith()`**
```java
String s = "Automation Testing";
System.out.println(s.startsWith("Auto")); // true
System.out.println(s.startsWith("Test")); // false
```

#### **Using `endsWith()`**
```java
System.out.println(s.endsWith("Testing")); // true
System.out.println(s.endsWith("Auto")); // false
```

---

### **2️⃣ Checking if a String Contains a Substring**
#### **Using `contains()`**
```java
String s = "Selenium Testing";
System.out.println(s.contains("Testing")); // true
System.out.println(s.contains("Java")); // false
```

---

### **3️⃣ Comparing Strings**
#### **Using `equalsIgnoreCase()` (Case-insensitive)**
```java
String s1 = "hello";
String s2 = "HELLO";
System.out.println(s1.equalsIgnoreCase(s2)); // true
```

#### **Using `compareToIgnoreCase()`**
```java
String s1 = "apple";
String s2 = "APPLE";
System.out.println(s1.compareToIgnoreCase(s2)); // 0 (Equal)
```

---

### **4️⃣ Checking if String is Empty**
#### **Using `isEmpty()`**
```java
String s = "";
System.out.println(s.isEmpty()); // true
System.out.println("Hello".isEmpty()); // false
```

#### **Using `isBlank()` (Java 11+)**
```java
System.out.println("  ".isBlank()); // true (ignores whitespaces)
System.out.println("Hello".isBlank()); // false
```

---

### **5️⃣ Removing Whitespaces Efficiently**
#### **Using `strip()` (Java 11+)**
```java
String s = "   Hello World   ";
System.out.println(s.strip()); // "Hello World"
```

#### **Using `stripLeading()` and `stripTrailing()`**
```java
System.out.println(s.stripLeading());  // "Hello World   "
System.out.println(s.stripTrailing()); // "   Hello World"
```

#### **Using `trim()`**
```java
System.out.println(s.trim()); // "Hello World" (Similar to `strip()`)
```

---

### **6️⃣ Repeating a String (Java 11+)**
```java
String s = "Hello ";
System.out.println(s.repeat(3)); // Hello Hello Hello 
```

---

### **7️⃣ Joining Multiple Strings**
```java
String joined = String.join(", ", "Apple", "Banana", "Cherry");
System.out.println(joined); // Apple, Banana, Cherry
```

---

### **8️⃣ Splitting a String**
```java
String s = "apple,banana,grape";
String[] arr = s.split(",");

for (String word : arr) {
    System.out.println(word);
}
```
**Output:**
```
apple
banana
grape
```

---

### **9️⃣ Converting a String to Character Array**
```java
String s = "Java";
char[] charArray = s.toCharArray();
for (char c : charArray) {
    System.out.print(c + " "); // J a v a
}
```

---

### **🔟 Extracting a Substring**
```java
String s = "Programming";
System.out.println(s.substring(0, 4)); // Prog
System.out.println(s.substring(5));    // amming
```

---

### **1️⃣1️⃣ Replacing Text in a String**
```java
String s = "Hello Java";
System.out.println(s.replace('a', 'o')); // Hello Jovo
System.out.println(s.replace("Java", "World")); // Hello World
```

---

### **1️⃣2️⃣ Regular Expression Replacements**
```java
String s = "abc123xyz";
System.out.println(s.replaceAll("[0-9]", "#")); // abc###xyz
```

---

### **1️⃣3️⃣ Finding Index of a Character or Substring**
```java
String s = "Automation";
System.out.println(s.indexOf('t'));  // 2
System.out.println(s.indexOf("tom")); // 2
System.out.println(s.indexOf("xyz")); // -1 (Not found)
```
```java
System.out.println(s.lastIndexOf('t')); // 6
```

---

## **🛠️ StringBuilder vs. StringBuffer**
### **🔹 StringBuilder (Faster, Not Thread-Safe)**
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Hello World
```

### **🔹 StringBuffer (Thread-Safe)**
```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
System.out.println(sb.toString()); // Hello Java
```

---

## **📌 Summary of Key Takeaways**
✅ `String` is immutable for efficiency, security, and thread safety.  
✅ **Comparison methods**: `equals()`, `compareTo()`, `equalsIgnoreCase()`.  
✅ **Searching**: `contains()`, `indexOf()`, `startsWith()`, `endsWith()`.  
✅ **Modifications**: `replace()`, `replaceAll()`, `substring()`.  
✅ **Splitting & Joining**: `split()`, `join()`, `repeat()`.  
✅ **`StringBuilder` vs `StringBuffer`**: `StringBuilder` is faster, `StringBuffer` is thread-safe.