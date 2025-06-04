![image](https://github.com/user-attachments/assets/ea012627-fdc8-4a7c-b708-406e22568140)# 📘 Composition vs Aggregation in OOP

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


# Association in Object-Oriented Programming

## What is Association?

**Association** is a relationship between two or more objects where they are aware of each other and can communicate but **do not depend on each other's lifecycle**. It represents a "uses-a" or "knows-a" relationship.

- Objects are connected but **independent**.
- Both objects can exist independently.
- It is a **loosely coupled** relationship.

---

## Types of Association

1. **One-to-One**
2. **One-to-Many**
3. **Many-to-One**
4. **Many-to-Many**

Comparison with Aggregation and Composition
| Relationship | Description                                                   | Lifetime Dependency             | Ownership                                       |
| ------------ | ------------------------------------------------------------- | ------------------------------- | ----------------------------------------------- |
| Association  | Objects are related but independent                           | None                            | No                                              |
| Aggregation  | "Has-a" relationship, whole and part exist independently      | Part can exist without whole    | Whole owns part but part can live independently |
| Composition  | Strong "Has-a" relationship, whole controls lifecycle of part | Part cannot exist without whole | Whole owns part and controls its lifecycle      |

---

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
```
# Encapsulation

Encapsulation binds data and methods together.
It hides the internal state of an object and protects it from unauthorized access.
Achieved using private variables and public getter/setter methods.


