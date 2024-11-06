# Keywords in Java

Below are the keywords used in java in alphabetical order

//TODO


**abstract** - Used to declare an abstract class or method. Abstract classes cannot be instantiated and are meant to be extended. Abstract methods have no body and must be implemented in subclasses.

**assert** - Used for debugging purposes to make an assumption in code and throw an AssertionError if the assumption is false. This can help identify logic errors during development.

**boolean** - Used to declare a variable that can only have one of two values: true or false. Essential for logical operations and conditions.

**break** - Exits a loop or switch statement prematurely. Useful for stopping further execution in for, while, and do-while loops.

**byte** - Declares an 8-bit integer. Useful for memory optimization when dealing with a large number of small values (e.g., byte arrays).

**case** - Used within a switch statement to specify code to run for a particular value of the switch variable.

**catch** - Used with try blocks to handle exceptions. Code in the catch block executes if an exception of the specified type is thrown.

**char** - Declares a 16-bit Unicode character. Useful for representing individual characters.

**class** - Used to define a new class, which is the primary structure for defining objects in Java.

**const** - Reserved keyword but not used. Reserved for potential future use.

**continue** - Skips the current iteration of a loop and proceeds to the next iteration. Often used within for and while loops.

**default** - Used in switch statements to specify the default block if no case matches. Can also be used to provide a default method implementation in interfaces (Java 8 and above).

**do** - Used to start a do-while loop, which executes at least once because the condition is checked after the loop body.

**double** - Declares a 64-bit floating-point variable. Used for precise calculations or when float precision is insufficient.

**else** - Used with if statements to specify a block of code that executes if the if condition is false.

**enum** - Defines an enumerated type, a set of predefined constants (e.g., enum Days { MON, TUE, WED }). Helps organize code and avoids using magic numbers or strings for fixed values.

**extends** - Used in class declarations to indicate inheritance, meaning the new class inherits properties and behavior from a superclass.

**final** - Has multiple uses:

**Class**: Makes the class unextendable.
**Method**: Prevents overriding by subclasses.
**Variable**: Declares a constant value, which cannot be reassigned.
**finally** - Used with try-catch blocks. Code in the finally block always executes, regardless of whether an exception is thrown. Often used for resource cleanup.

**float** - Declares a 32-bit floating-point variable. Used for fractional values when memory optimization is essential.

**for** - Begins a for loop, which is commonly used for counting or iterating over arrays/collections.

**goto** - Reserved but not used. Keywords like break and continue provide similar functionality.

**if** - Starts a conditional statement that executes code if a specified condition is true.

**implements** - Indicates that a class implements an interface, ensuring that all methods defined in the interface are provided in the class.

**import** - Imports classes or entire packages from the Java API or custom libraries, making them accessible within the current class.

**instanceof** - Tests whether an object is an instance of a specific class or subclass. Useful for type-checking before casting objects.

**int** - Declares a 32-bit integer variable, commonly used for numerical operations.

**interface** - Declares an interface, a collection of abstract methods that can be implemented by classes. Useful for defining common behavior across unrelated classes.

**long** - Declares a 64-bit integer variable. Useful when int precision is insufficient.

**native** - Specifies that a method is implemented in native code (e.g., C/C++) instead of Java. Used with Java Native Interface (JNI) for performance or hardware-specific tasks.

**new** - Creates new objects or arrays. Essential for working with Java’s object-oriented paradigm.

**null** - Represents a null reference, meaning the reference points to no object.

**package** - Declares a package, which is a namespace for organizing classes and interfaces in a logical structure.

**private** - An access modifier that restricts access to fields, methods, or classes to within the defining class.

**protected** - An access modifier that allows access within the same package and to subclasses.

**public** - An access modifier that makes fields, methods, or classes accessible from any other class.

**return** - Exits a method and optionally returns a value to the caller. Used for returning values from methods.

**short** - Declares a 16-bit integer variable. Used when memory optimization is essential and byte range is insufficient.

**static** - Used to declare a member (field or method) that belongs to the class rather than instances of the class. Useful for shared or utility methods and variables.

**strictfp** - Ensures that floating-point calculations are consistent across different platforms. Rarely used unless strict IEEE compliance is needed.

**super** - Refers to the superclass. Used to access superclass methods or constructors from a subclass.

**switch** - Begins a switch statement, allowing multiple paths based on a variable’s value.

**synchronized** - Ensures that only one thread at a time executes a method or block of code. Used for thread-safe operations in concurrent programming.

**this** - Refers to the current instance of a class. Commonly used to resolve naming conflicts between instance variables and parameters.

**throw** - Used to explicitly throw an exception in a program, allowing for custom error handling.

**throws** - Declares the types of exceptions a method can throw, alerting callers to handle or propagate them.

**transient** - Prevents serialization of a field. Useful for sensitive data or temporary fields in objects that are serialized.

**try** - Begins a block of code to attempt, paired with catch for error handling.

**void** - Indicates that a method returns no value. Used when a method performs actions rather than returning data.

**volatile** - Ensures that updates to a variable are immediately visible to other threads. Useful for ensuring the visibility of changes in multi-threaded environments.

**while** - Begins a while loop, which iterates as long as the specified condition is true.

Module System Keywords (Java 9+)
_ - Reserved as a keyword in Java 9 to prevent using _ as an identifier.

**exports** - Specifies a package in a module that can be accessed by other modules.

**module** - Declares a module, which is a group of packages for modularity.

**open** - Declares an open module, allowing reflection access from outside modules.

**opens** - Allows access to a specific package within a module for deep reflection.

**provides** - Used in module declarations to specify the implementation of a service.

**requires** - Specifies dependencies between modules.

**to** - Used in module declarations to restrict which modules have access to exported packages.

**transitive** - Specifies that the dependencies of a required module are also accessible to modules that depend on it.

**uses** - Declares a service used by a module.

Type Inference Keyword (Java 10)
**var** - Enables local variable type inference, allowing the compiler to infer the variable type based on the assignment.
Enhanced Switch Keyword (Java 14+)
**yield** - Returns a value from a switch expression.