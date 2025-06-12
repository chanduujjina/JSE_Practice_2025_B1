✅ 1. try without catch (but with finally)

✔ Allowed: A try block must be followed by either:

catch

finally

or both

✅ Valid:
```java
public class TryFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
        } finally {
            System.out.println("Finally block");
        }
    }
}
```
