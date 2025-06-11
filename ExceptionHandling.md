# 🌟 Exception Handling in Java

## ✅ What is Exception Handling?

Exception Handling in Java is a powerful mechanism that handles **runtime errors**, allowing the normal flow of the application to continue.

An **exception** is an event that occurs during the execution of a program that disrupts the normal flow of instructions.

Java uses the following keywords for exception handling:
- `try`
- `catch`
- `finally`
- `throw`
- `throws`

### 🔹 Basic Syntax:

```java
try {
    // code that might throw an exception
} catch (ExceptionType e) {
    // code to handle the exception
} finally {
    // code that always executes (optional)
}
