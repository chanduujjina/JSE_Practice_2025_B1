| Feature       | `String`                 | `StringBuffer`            |
| ------------- | ------------------------ | ------------------------- |
| Mutability    | Immutable                | Mutable                   |
| Performance   | Slower (more objects)    | Faster (in-place ops)     |
| Thread-safety | Not thread-safe          | Thread-safe               |
| Use-case      | Read-only or few changes | Frequent updates or loops |
