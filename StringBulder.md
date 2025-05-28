# Difference between String, StringBuilder, and StringBuffer

| Feature              | String                          | StringBuilder                     | StringBuffer                     |
|----------------------|----------------------------------|------------------------------------|----------------------------------|
| **Mutability**       | Immutable (cannot be changed)   | Mutable (can be changed)          | Mutable (can be changed)         |
| **Thread-Safety**    | Not applicable                  | ❌ Not thread-safe                | ✅ Thread-safe (synchronized)     |
| **Performance**      | Slow for frequent modifications | Fast (better than StringBuffer)   | Slower due to synchronization     |
| **Synchronized?**    | No                              | No                                | Yes                              |
| **Use Case**         | When content doesn’t change     | When thread-safety is not needed | When thread-safety is needed     |
| **Introduced In**    | Java 1.0                        | Java 1.5                          | Java 1.0                         |
| **Package**          | `java.lang.String`              | `java.lang.StringBuilder`         | `java.lang.StringBuffer`         |

---

## 1. `String` (Immutable)

```java
String s = "Hello";
s.concat(" World"); // creates a new object
System.out.println(s); // prints "Hello"
