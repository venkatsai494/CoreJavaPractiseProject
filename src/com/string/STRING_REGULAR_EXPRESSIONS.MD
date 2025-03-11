### **Comprehensive Regular Expressions (Regex) Reference Table for Java**

Below is a detailed tabular reference for various regular expressions in Java, categorized based on different scenarios.

---

## **1. Character Classes**
These define sets of characters that can be matched in a string.

| Regex Pattern  | Description | Example Matches | Example Non-Matches |
|---------------|------------|-----------------|----------------------|
| `.`           | Matches any **single character** except a newline | `a`, `1`, `@`, `Z` | (empty string), `\n` |
| `\d`          | Matches any **digit** (0-9) | `0`, `5`, `9` | `A`, `#`, ` ` (space) |
| `\D`          | Matches any **non-digit** character | `A`, `@`, ` ` | `0`, `5`, `9` |
| `\w`          | Matches any **word character** (alphanumeric + underscore) | `A`, `1`, `_` | `@`, `#`, ` ` |
| `\W`          | Matches any **non-word character** | `@`, `#`, ` ` | `A`, `1`, `_` |
| `\s`          | Matches any **whitespace** (space, tab, newline) | `" "`, `\t`, `\n` | `A`, `1`, `@` |
| `\S`          | Matches any **non-whitespace** character | `A`, `1`, `@` | `" "`, `\t`, `\n` |

---

## **2. Quantifiers**
These define how many times a character or group of characters should be matched.

| Regex Pattern  | Description | Example Matches |
|---------------|------------|-----------------|
| `a*`          | Matches `a` **0 or more times** | ``, `a`, `aaaa` |
| `a+`          | Matches `a` **1 or more times** | `a`, `aaa` (not `""`) |
| `a?`          | Matches `a` **0 or 1 time** | `""`, `a` |
| `a{3}`        | Matches exactly **3** occurrences of `a` | `aaa` |
| `a{2,5}`      | Matches between **2 to 5** occurrences of `a` | `aa`, `aaaaa` |
| `a{2,}`       | Matches **2 or more** occurrences of `a` | `aa`, `aaaaaaa` |

---

## **3. Anchors**
Anchors are used to specify positions within the string.

| Regex Pattern | Description | Example Matches | Example Non-Matches |
|--------------|------------|-----------------|----------------------|
| `^abc`       | Matches if **"abc" is at the start** of the string | `"abcdef"`, `"abc123"` | `"xabc"`, `"1abc"` |
| `xyz$`       | Matches if **"xyz" is at the end** of the string | `"123xyz"`, `"helloxyz"` | `"xyz123"`, `"abcxyzdef"` |
| `\bword\b`   | Matches whole word `"word"` | `"word"`, `"a word here"` | `"words"`, `"wording"` |
| `\Bword\B`   | Matches `"word"` **not at word boundary** | `"myworded"` | `"word"`, `"worded"` |

---

## **4. Special Character Escaping**
Some characters have special meanings in regex and must be escaped with `\` to match literally.

| Regex Pattern | Description | Example Matches |
|--------------|------------|-----------------|
| `\.`         | Matches **literal dot (`.`)** | `file.txt`, `a.b.c` |
| `\\`         | Matches **literal backslash (`\`)** | `C:\\Users\\` |
| `\*`         | Matches **literal asterisk (`*`)** | `"5 * 2"` |
| `\$`         | Matches **literal dollar sign (`$`)** | `"Total: $50"` |

---

## **5. Character Sets and Ranges**
Defines specific sets of characters to match.

| Regex Pattern | Description | Example Matches |
|--------------|------------|-----------------|
| `[abc]`      | Matches **any one of `a`, `b`, or `c`** | `"a"`, `"b"`, `"c"` |
| `[^abc]`     | Matches **any character except `a`, `b`, or `c`** | `"d"`, `"x"`, `"9"` |
| `[a-z]`      | Matches **any lowercase letter** | `"m"`, `"z"` |
| `[A-Z]`      | Matches **any uppercase letter** | `"G"`, `"T"` |
| `[0-9]`      | Matches **any digit** | `"5"`, `"9"` |
| `[a-zA-Z0-9]` | Matches **any alphanumeric character** | `"A"`, `"z"`, `"3"` |

---

## **6. Practical Use Cases in Java**
Below are common scenarios and their corresponding regex patterns.

| Scenario | Regex Pattern | Example Input | Expected Output |
|----------|-------------|--------------|----------------|
| **Remove special characters & numbers (keep only letters & spaces)** | `[^a-zA-Z\s]+` | `"Hello@123! World_456."` | `"Hello World"` |
| **Validate email** | `^[a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-z]{2,6}$` | `"test@example.com"` | ✅ Valid |
| **Validate phone number (10 digits)** | `^\d{10}$` | `"9876543210"` | ✅ Valid |
| **Extract numbers from a string** | `\d+` | `"Price: $123, Discount: 20"` | `123, 20` |
| **Check if string contains only numbers** | `^\d+$` | `"12345"` | ✅ Valid |
| **Check if string contains only alphabets** | `^[a-zA-Z]+$` | `"HelloWorld"` | ✅ Valid |
| **Check if string contains only alphanumeric characters** | `^[a-zA-Z0-9]+$` | `"Test123"` | ✅ Valid |

---

## **Key Takeaways**
- **Use `[ ]`** for matching character sets (`[a-z]`).
- **Use `\d`, `\w`, `\s`** for shorthand character classes.
- **Use `+`, `*`, `{n,m}`** for repetition patterns.
- **Use `^` and `$`** for start and end position matching.
- **Escape special characters** like `.`, `?`, `*`, `+`, `$`, `^` when needed.


### **Comprehensive Regular Expressions (Regex) Reference Table for Java with Usage and Output**

Below is a detailed reference for various **regular expressions in Java**, along with **usage examples** and expected **output**.

---

## **1. Character Classes**
These define sets of characters that can be matched in a string.

| Regex Pattern  | Description | Example Matches | Java Usage | Output |
|---------------|------------|-----------------|------------|--------|
| `.`           | Matches any **single character** except newline | `a`, `1`, `@`, `Z` | `"abc".matches(".")` | `false` |
| `\d`          | Matches any **digit** (0-9) | `0`, `5`, `9` | `"5".matches("\\d")` | `true` |
| `\D`          | Matches any **non-digit** character | `A`, `@`, ` ` | `"A".matches("\\D")` | `true` |
| `\w`          | Matches any **word character** (alphanumeric + underscore) | `A`, `1`, `_` | `"_test".matches("\\w*")` | `true` |
| `\W`          | Matches any **non-word character** | `@`, `#`, ` ` | `"#".matches("\\W")` | `true` |
| `\s`          | Matches any **whitespace** | `" "`, `\t`, `\n` | `" ".matches("\\s")` | `true` |
| `\S`          | Matches any **non-whitespace** | `A`, `1`, `@` | `"A".matches("\\S")` | `true` |

---

## **2. Quantifiers**
These define how many times a character or group of characters should be matched.

| Regex Pattern  | Description | Example Matches | Java Usage | Output |
|---------------|------------|-----------------|------------|--------|
| `a*`          | Matches `a` **0 or more times** | `""`, `a`, `aaaa` | `"aaa".matches("a*")` | `true` |
| `a+`          | Matches `a` **1 or more times** | `a`, `aaa` | `"".matches("a+")` | `false` |
| `a?`          | Matches `a` **0 or 1 time** | `""`, `a` | `"a".matches("a?")` | `true` |
| `a{3}`        | Matches exactly **3** occurrences of `a` | `aaa` | `"aaa".matches("a{3}")` | `true` |
| `a{2,5}`      | Matches between **2 to 5** occurrences of `a` | `aa`, `aaaaa` | `"aaaa".matches("a{2,5}")` | `true` |
| `a{2,}`       | Matches **2 or more** occurrences of `a` | `aa`, `aaaaaaa` | `"aaaa".matches("a{2,}")` | `true` |

---

## **3. Anchors**
Define positions within the string.

| Regex Pattern | Description | Example Matches | Java Usage | Output |
|--------------|------------|-----------------|------------|--------|
| `^abc`       | Matches **"abc" at start** | `"abcdef"` | `"abcdef".matches("^abc.*")` | `true` |
| `xyz$`       | Matches **"xyz" at end** | `"123xyz"` | `"123xyz".matches(".*xyz$")` | `true` |
| `\bword\b`   | Matches whole word `"word"` | `"word here"` | `"word".matches("\\bword\\b")` | `true` |
| `\Bword\B`   | Matches `"word"` **not at boundary** | `"myworded"` | `"myworded".matches(".*\\Bword\\B.*")` | `true` |

---

## **4. Special Character Escaping**
Escape special characters using `\`.

| Regex Pattern | Description | Example Matches | Java Usage | Output |
|--------------|------------|-----------------|------------|--------|
| `\.`         | Matches **literal dot (`.`)** | `file.txt` | `"file.txt".matches(".*\\.txt")` | `true` |
| `\\`         | Matches **literal backslash (`\`)** | `C:\Users\` | `"C:\\Users\\".matches("C:\\\\Users\\\\")` | `true` |
| `\*`         | Matches **literal asterisk (`*`)** | `"5 * 2"` | `"5 * 2".matches(".*\\*.*")` | `true` |

---

## **5. Character Sets and Ranges**
Defines specific sets of characters to match.

| Regex Pattern | Description | Example Matches | Java Usage | Output |
|--------------|------------|-----------------|------------|--------|
| `[abc]`      | Matches **any one of `a`, `b`, or `c`** | `"a"`, `"b"` | `"a".matches("[abc]")` | `true` |
| `[^abc]`     | Matches **any character except `a`, `b`, or `c`** | `"x"`, `"9"` | `"x".matches("[^abc]")` | `true` |
| `[a-z]`      | Matches **any lowercase letter** | `"m"`, `"z"` | `"m".matches("[a-z]")` | `true` |
| `[0-9]`      | Matches **any digit** | `"5"`, `"9"` | `"9".matches("[0-9]")` | `true` |

---

## **6. Practical Use Cases in Java**
Below are common scenarios with Java implementation and expected output.

| Scenario | Regex Pattern | Java Usage | Output |
|----------|-------------|------------|--------|
| **Remove special characters & numbers (keep only letters & spaces)** | `[^a-zA-Z\s]+` | `"Hello@123!".replaceAll("[^a-zA-Z\\s]+", "")` | `"Hello"` |
| **Validate email** | `^[a-zA-Z0-9_.]+@[a-zA-Z]+\.[a-z]{2,6}$` | `"test@example.com".matches("^[a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-z]{2,6}$")` | `true` |
| **Validate phone number (10 digits)** | `^\d{10}$` | `"9876543210".matches("^\\d{10}$")` | `true` |
| **Extract numbers from a string** | `\d+` | `"Price: $123".replaceAll("\\D+", "")` | `"123"` |
| **Check if string contains only numbers** | `^\d+$` | `"12345".matches("^\\d+$")` | `true` |
| **Check if string contains only alphabets** | `^[a-zA-Z]+$` | `"HelloWorld".matches("^[a-zA-Z]+$")` | `true` |

---

## **Key Takeaways**
✅ **Use `Pattern` and `Matcher` for complex regex operations.**  
✅ **Escape special characters with `\\`.**  
✅ **Quantifiers like `+`, `*`, `{n,m}` help match repetitions.**  
✅ **Use `matches()` for full string validation and `replaceAll()` for replacements.**