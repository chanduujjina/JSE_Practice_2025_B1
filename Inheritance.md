# 🧬 Inheritance in Java

Inheritance is a fundamental concept in Object-Oriented Programming (OOP). It allows one class (child/subclass) to **inherit** properties and behaviors (fields and methods) from another class (parent/superclass).

---

## 🎯 Purpose of Inheritance

- **Code Reusability** – reuse code from the parent class.
- **Method Overriding** – provide specific implementation in the child class.
- **Polymorphism** – support dynamic method dispatch at runtime.

---

# 📘 Single Inheritance in Java

**Single Inheritance** is when a class (subclass/child) inherits from exactly one superclass (parent class). It helps achieve **code reuse** and **method inheritance**.

---

## 📌 Syntax

```java
class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class.");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // inherited from Parent
        obj.show();    // own method
    }
}
```

# 🏗️ Multilevel Inheritance in Java

**Multilevel Inheritance** is a type of inheritance where a class inherits from a class which itself inherits from another class. This forms a **chain of inheritance**.

---

## 🧱 Structure

A (Grandparent)
↓
B (Parent)
↓
C (Child)


Each level inherits properties and methods from the class above it.


## 📌 Example

```java
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class Test {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // Inherited from Animal
        p.bark();  // Inherited from Dog
        p.weep();  // Own method
    }
}
```
---
