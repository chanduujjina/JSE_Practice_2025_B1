# 📘 Composition vs Aggregation in OOP

Both **Composition** and **Aggregation** represent **"Has-a"** relationships in OOP, but they differ in terms of **ownership** and **object lifecycle**.

---

## 🧱 1. Composition (Strong Has-a)

### ✅ Definition:
> A **Composition** relationship means one object **owns** another object, and the owned object **cannot exist independently** of the owner.

### 🧠 Key Points:
- **Strong association**.
- If the container object is destroyed, the contained object is also destroyed.
- Implemented by instantiating the dependent object **inside the class**.

# 🌐 Aggregation in Java (OOP)

## ✅ What is Aggregation?

Aggregation is a **"Has-a"** relationship where one class contains a reference to another **without owning** its lifecycle.  
It is a **weak association**, meaning the contained object **can exist independently** of the container.

---

## 🧠 Key Features of Aggregation

- **Loose Coupling** between objects.
- Object lifecycle is **independent**.
- Promotes **code reusability**.
- Helps implement **Modular Design**.
- Object is typically **passed through a constructor** or **setter method**.

---
📊 Aggregation vs Composition
| Feature              | Aggregation               | Composition              |
| -------------------- | ------------------------- | ------------------------ |
| Type of Relationship | Weak "Has-a"              | Strong "Has-a"           |
| Lifespan Dependency  | Independent               | Dependent                |
| Object Creation      | Passed as argument        | Created inside the class |
| Example              | University and Department | Human and Heart          |
| Coupling             | Loose Coupling            | Tight Coupling           |

# Instance Block in Java

## What is an Instance Block?

An **instance block** (also called an **instance initializer block**) is a block of code inside a class that is executed **every time an instance (object) of the class is created**, right before the constructor is executed.

It is used to initialize instance variables or to execute some common code for all constructors.

---

## Syntax

```java
class MyClass {
    {
        // instance block code
        System.out.println("Instance block executed");
    }
}



