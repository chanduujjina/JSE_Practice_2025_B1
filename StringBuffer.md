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




public boolean java.lang.Object.equals(java.lang.Object)
public default boolean java.lang.CharSequence.isEmpty()
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public final void java.lang.Object.wait(long) throws java.lang.InterruptedException
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public int java.lang.StringBuffer.compareTo(java.lang.Object)
public int java.lang.StringBuffer.indexOf(java.lang.String)
public int java.lang.StringBuffer.lastIndexOf(java.lang.String)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(boolean)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(char)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(char[])
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(char[],int,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(double)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(float)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.CharSequence)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.CharSequence,int,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.Object)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.String)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(java.lang.StringBuffer)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.append(long)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.appendCodePoint(int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.delete(int,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.deleteCharAt(int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,boolean)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,char)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,char[])
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,char[],int,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,double)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,float)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,java.lang.CharSequence)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,java.lang.CharSequence,int,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,java.lang.Object)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,java.lang.String)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.insert(int,long)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.repeat(int,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.repeat(java.lang.CharSequence,int)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.replace(int,int,java.lang.String)
public java.lang.AbstractStringBuilder java.lang.StringBuffer.reverse()
public java.lang.Appendable java.lang.StringBuffer.append(char) throws java.io.IOException
public java.lang.Appendable java.lang.StringBuffer.append(java.lang.CharSequence) throws java.io.IOException
public java.lang.Appendable java.lang.StringBuffer.append(java.lang.CharSequence,int,int) throws java.io.IOException
public java.lang.StringBuffer java.lang.StringBuffer.insert(int,boolean)
public java.lang.StringBuffer java.lang.StringBuffer.insert(int,double)
public java.lang.StringBuffer java.lang.StringBuffer.insert(int,float)
public java.lang.StringBuffer java.lang.StringBuffer.insert(int,int)
public java.lang.StringBuffer java.lang.StringBuffer.insert(int,java.lang.CharSequence)
public java.lang.StringBuffer java.lang.StringBuffer.insert(int,long)
public java.util.stream.IntStream java.lang.StringBuffer.chars()
public java.util.stream.IntStream java.lang.StringBuffer.codePoints()
public native int java.lang.Object.hashCode()
public synchronized char java.lang.StringBuffer.charAt(int)
public synchronized int java.lang.StringBuffer.capacity()
public synchronized int java.lang.StringBuffer.codePointAt(int)
public synchronized int java.lang.StringBuffer.codePointBefore(int)
public synchronized int java.lang.StringBuffer.codePointCount(int,int)
public synchronized int java.lang.StringBuffer.compareTo(java.lang.StringBuffer)
public synchronized int java.lang.StringBuffer.indexOf(java.lang.String,int)
public synchronized int java.lang.StringBuffer.lastIndexOf(java.lang.String,int)
public synchronized int java.lang.StringBuffer.length()
public synchronized int java.lang.StringBuffer.offsetByCodePoints(int,int)
public synchronized java.lang.CharSequence java.lang.StringBuffer.subSequence(int,int)
public synchronized java.lang.String java.lang.StringBuffer.substring(int)
public synchronized java.lang.String java.lang.StringBuffer.substring(int,int)
public synchronized java.lang.String java.lang.StringBuffer.toString()
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(boolean)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(char)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(char[])
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(char[],int,int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(double)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(float)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(java.lang.CharSequence)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(java.lang.CharSequence,int,int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(java.lang.Object)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(java.lang.String)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(java.lang.StringBuffer)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.append(long)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.appendCodePoint(int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.delete(int,int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.deleteCharAt(int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.insert(int,char)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.insert(int,char[])
public synchronized java.lang.StringBuffer java.lang.StringBuffer.insert(int,char[],int,int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.insert(int,java.lang.CharSequence,int,int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.insert(int,java.lang.Object)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.insert(int,java.lang.String)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.repeat(int,int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.repeat(java.lang.CharSequence,int)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.replace(int,int,java.lang.String)
public synchronized java.lang.StringBuffer java.lang.StringBuffer.reverse()
public synchronized void java.lang.StringBuffer.ensureCapacity(int)
public synchronized void java.lang.StringBuffer.getChars(int,int,char[],int)
public synchronized void java.lang.StringBuffer.setCharAt(int,char)
public synchronized void java.lang.StringBuffer.setLength(int)
public synchronized void java.lang.StringBuffer.trimToSize()

