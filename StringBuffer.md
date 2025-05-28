| Feature       | `String`                 | `StringBuffer`            |
| ------------- | ------------------------ | ------------------------- |
| Mutability    | Immutable                | Mutable                   |
| Performance   | Slower (more objects)    | Faster (in-place ops)     |
| Thread-safety | Not thread-safe          | Thread-safe               |
| Use-case      | Read-only or few changes | Frequent updates or loops |

🧵 Unique StringBuffer Methods

| Category       | `StringBuffer` Method       | Description                                                                     |
| -------------- | --------------------------- | ------------------------------------------------------------------------------- |
| **Mutability** | `append(...)`               | Appends data (all types: boolean, char, int, long, float, double, String, etc.) |
|                | `insert(...)`               | Inserts data at a given index                                                   |
|                | `delete(int, int)`          | Deletes a range of characters                                                   |
|                | `deleteCharAt(int)`         | Deletes a single character                                                      |
|                | `replace(int, int, String)` | Replaces a part of the buffer                                                   |
|                | `reverse()`                 | Reverses the characters                                                         |
|                | `setCharAt(int, char)`      | Updates a character at a given index                                            |
|                | `setLength(int)`            | Sets the length of the buffer                                                   |
|                | `ensureCapacity(int)`       | Ensures a minimum buffer capacity                                               |
|                | `trimToSize()`              | Reduces capacity to current length                                              |
|                | `getChars(...)`             | Copies buffer content into an array                                             |
|                | `capacity()`                | Gets current buffer capacity                                                    |
|                | `appendCodePoint(int)`      | Appends a Unicode code point                                                    |
|                | `repeat(...)`               | Repeats content (Java 21+)                                                      |
|                | `chars()`                   | Returns IntStream of characters                                                 |
|                | `codePoints()`              | Returns IntStream of code points                                                |
