# What is OOPS ?
OOPS is Object Orineted Programming Systems
# Key 
# CLASS:

A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:

    Modifiers : A class can be public or has default access.
    
    Class name: The name should begin with a initial letter (capitalized by convention).
    
    Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
    
    Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    
    Body: The class body surrounded by braces, { }.

# OBJECT:

An object is an instance of a class.Technically, Class is a template which describes what state and behavior of an instance this class can have. Object implements the state and behavior in the form of variables and methods and requires some memory allocated.An object consists of:

    State : It is represented by attributes of an object. It also reflects the properties of an object.
    
    Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
    
    Identity : It gives a unique name to an object and enables one object to interact with other objects.

# 🚀 Advantages of Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects". It offers several advantages that make software design more modular, flexible, and maintainable.

---

## ✅ 1. **Modularity**
- Code is organized into classes and objects.
- Each class is a separate module, which makes code easier to understand and manage.

---

## 🔄 2. **Reusability**
- Through **Inheritance**, one class can inherit features from another.
- Code can be reused instead of being rewritten.

---

## 🔒 3. **Encapsulation**
- Data (attributes) and methods (functions) are bundled together.
- Access to internal data is restricted and controlled via access modifiers.
- Improves security and reduces system complexity.

---

## 🔁 4. **Polymorphism**
- The same operation can behave differently on different classes.
- Increases flexibility by allowing objects of different types to be treated as instances of the same class through interfaces or parent classes.

---

## 🧬 5. **Abstraction**
- Hides complex implementation details and shows only essential features.
- Simplifies the interface of complex systems.

---

## 🔧 6. **Easy Maintenance and Upgrades**
- Changes in one part of the system can be made independently of other parts.
- Makes debugging and testing easier.

---

## 🧠 7. **Improved Productivity**
- OOP encourages code reuse and clean design, which reduces development time.
- Enhances team collaboration due to better structure and readability.

---

## 👥 8. **Real-World Modeling**
- Objects in OOP represent real-world entities.
- Makes system desig
---
  📌 Summary

 | Feature       | Benefit                      |
| ------------- | ---------------------------- |
| Modularity    | Easier to manage code        |
| Reusability   | Reduces code duplication     |
| Encapsulation | Secure and robust code       |
| Polymorphism  | Flexible and scalable code   |
| Abstraction   | Simplifies system complexity |

---

📌 What is a Constructor?
A constructor in Java is a special method that is called automatically when an object is created. It is used to initialize objects.

🔍 Features of Constructors
Has the same name as the class.

No return type, not even void.

Automatically invoked when an object is instantiated.

Can be overloaded (i.e., multiple constructors with different parameter lists).

🧱 Types of Constructors
1. Default Constructor
Provided by Java if no constructor is defined.
```
class Test {
    int x; // 0 by default
    Test() {
        System.out.println("Default constructor");
    }
}

```

Initializes instance variables with default values.

2. No-Arg Constructor
A constructor without parameters.
```
public class Student {
    Student() {
        System.out.println("Student Created");
    }
}

```
3. Parameterized Constructor
Accepts arguments to initialize fields with custom values.
```
public class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```

💡 Constructor Overloading
You can define multiple constructors in the same class with different parameter lists.
```
class Demo {
    Demo() {
        System.out.println("No-arg constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized constructor: " + x);
    }
}

```

🔄 Difference: Constructor vs Method

| Feature     | Constructor                | Method                |
| ----------- | -------------------------- | --------------------- |
| Name        | Same as class              | Any valid identifier  |
| Return type | No return type             | Must have return type |
| Called by   | JVM during object creation | Manually called       |

🎯 Uses of Constructor
Object creation and initialization

Code reusability (via overloading)

Default setup for instance variables



