### **Prototype Design Pattern**

The **Prototype Pattern** is a creational design pattern that allows objects to be cloned rather than instantiated from scratch. This is useful when object creation is expensive (in terms of time or resources) and we want to create multiple similar objects efficiently.

* * *

### **When to Use Prototype Pattern?**

*   When object creation is costly, and we need to create multiple instances.
*   When an object has many configurations, and we want to copy an existing object instead of creating a new one.
*   When we want to avoid subclassing in object creation.
*   When objects have a complex structure and deep copying is needed.

* * *

### **Example in Java**

Here’s an example demonstrating the Prototype pattern:

```java
import java.util.HashMap;
import java.util.Map;

// Prototype Interface
interface Prototype extends Cloneable {
    Prototype clone();
}

// Concrete Prototype Class
class Vehicle implements Prototype {
    private String type;
    private int wheels;

    public Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
    }

    public void showVehicle() {
        System.out.println("Vehicle Type: " + type + ", Wheels: " + wheels);
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed!");
        }
    }
}

// Prototype Registry (Optional - To Store and Retrieve Prototypes)
class VehicleRegistry {
    private Map<String, Prototype> registry = new HashMap<>();

    public void addPrototype(String key, Prototype prototype) {
        registry.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        return registry.get(key).clone();
    }
}

// **Main Class**
public class PrototypePatternExample {
    public static void main(String[] args) {
        VehicleRegistry registry = new VehicleRegistry();
        
        Vehicle car = new Vehicle("Car", 4);
        registry.addPrototype("Car", car);
        
        Vehicle bike = new Vehicle("Bike", 2);
        registry.addPrototype("Bike", bike);
        
        // Cloning objects instead of creating new ones
        Vehicle clonedCar = (Vehicle) registry.getPrototype("Car");
        Vehicle clonedBike = (Vehicle) registry.getPrototype("Bike");

        clonedCar.showVehicle();
        clonedBike.showVehicle();
    }
}
```

### **Output**

```
Vehicle Type: Car, Wheels: 4
Vehicle Type: Bike, Wheels: 2
```

* * *

### **Usage of Prototype Pattern in Selenium Test Automation**

The **Prototype Pattern** is useful in Selenium automation for the following cases:

1.  **Reusing WebDriver Instances Efficiently**

    *   Instead of creating a new WebDriver instance for every test case, we can clone an existing WebDriver configuration.
2.  **Cloning Page Objects**

    *   If multiple tests require the same Page Object with minor modifications, cloning can save initialization time.
3.  **Managing Test Data Objects**

    *   Instead of repeatedly creating test data objects, we can clone a prototype with predefined data.
4.  **Test Report Objects**

    *   Cloning existing test report objects to generate multiple reports with different formats.

* * *

### **Example in Selenium Using Prototype Pattern**

Here’s how we can use the **Prototype Pattern** for Page Objects in Selenium:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Prototype Interface
interface PagePrototype extends Cloneable {
    PagePrototype clone();
}

// Concrete Page Object (Prototype)
class LoginPage implements PagePrototype {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    @Override
    public PagePrototype clone() {
        try {
            return (PagePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed!");
        }
    }
}

// **Test Class**
public class PrototypePatternSeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getDriver("chrome"); // Assume this returns a WebDriver instance

        // Original Page Object
        LoginPage originalLoginPage = new LoginPage(driver);
        
        // Cloned Page Object (Avoids re-initialization)
        LoginPage clonedLoginPage = (LoginPage) originalLoginPage.clone();
        
        clonedLoginPage.login("testUser", "password123");
        
        driver.quit();
    }
}
```

* * *

### **Benefits of Using Prototype Pattern in Selenium**

✔ **Faster Execution** – Cloning avoids redundant initialization of WebDriver and Page Objects.  
✔ **Better Memory Management** – Reduces object creation overhead.  
✔ **Reusable Configurations** – Helps reuse test data, reports, and WebDriver settings.