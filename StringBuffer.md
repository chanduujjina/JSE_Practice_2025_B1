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




- `public boolean java.lang.Object.equals(java.lang.Object)`
- `public default boolean java.lang.CharSequence.isEmpty()`
- `public final native java.lang.Class java.lang.Object.getClass()`
- `public final native void java.lang.Object.notify()`
- `public final native void java.lang.Object.notifyAll()`
- `public final void java.lang.Object.wait() throws java.lang.InterruptedException`
- `public final void java.lang.Object.wait(long) throws java.lang.InterruptedException`
- `public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException`
- `public int java.lang.StringBuffer.compareTo(java.lang.Object)`
- `public int java.lang.StringBuffer.indexOf(java.lang.String)`
- `public int java.lang.StringBuffer.lastIndexOf(java.lang.String)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(boolean)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(char)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(char[])`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(char[],int,int)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(double)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(float)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(int)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.CharSequence)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.CharSequence,int,int)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.Object)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.String)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.StringBuffer)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(long)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.appendCodePoint(int)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.delete(int,int)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer.deleteCharAt(int)`
- `public java.lang.AbstractStringBuilder java.lang.StringBuffer

# StringBuffer Resizing Formula

When a **StringBuffer** (or **StringBuilder**) needs to resize its internal character array because the current capacity isn’t enough, Java uses a formula to decide the **new capacity**.

## How does resizing work in StringBuffer?

- When you append or insert data that exceeds the current capacity, the buffer grows.
- The new capacity is usually calculated as:


- If the `minimumCapacity` you need (after the append/insert) is **larger than this calculated newCapacity**, then the new capacity becomes exactly the `minimumCapacity`.

---

## Example:

Suppose you have:

- Current capacity = 16
- You want to append a string so the new required capacity = 20 (exceeds 16)

Calculation:

- `(16 * 2) + 2 = 34` (new capacity)
- Since 20 < 34, new capacity = 34

So, the internal buffer expands from 16 to 34.

---

## Why this formula?

- Doubling capacity roughly doubles the space each time it grows, which helps reduce the number of costly array copying operations as your buffer grows.

---

## Summary

| Condition                                | New capacity                |
|------------------------------------------|-----------------------------|
| `minimumCapacity` ≤ `(oldCapacity * 2) + 2`  | `(oldCapacity * 2) + 2`         |
| `minimumCapacity` > `(oldCapacity * 2) + 2`  | `minimumCapacity` (exact size)  |

---

If you want, I can provide a quick Java example that shows resizing happening! Would you like that?

