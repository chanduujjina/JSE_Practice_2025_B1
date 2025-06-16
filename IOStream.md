🧾 1. Summary Chart of IO Classes
| **Category**         | **Byte Streams**                                | **Character Streams**                |
| -------------------- | ----------------------------------------------- | ------------------------------------ |
| **Abstract Classes** | `InputStream`, `OutputStream`                   | `Reader`, `Writer`                   |
| **File Operations**  | `FileInputStream`, `FileOutputStream`           | `FileReader`, `FileWriter`           |
| **Buffered Classes** | `BufferedInputStream`, `BufferedOutputStream`   | `BufferedReader`, `BufferedWriter`   |
| **Data Types I/O**   | `DataInputStream`, `DataOutputStream`           | —                                    |
| **Object I/O**       | `ObjectInputStream`, `ObjectOutputStream`       | —                                    |
| **Array Streams**    | `ByteArrayInputStream`, `ByteArrayOutputStream` | `CharArrayReader`, `CharArrayWriter` |
| **Print Support**    | `PrintStream`                                   | `PrintWriter`                        |
| **Piped Streams**    | `PipedInputStream`, `PipedOutputStream`         | `PipedReader`, `PipedWriter`         |


🔸 1. FileReader / FileWriter
Reads/writes characters one at a time.

No buffering, so performance is slower for large data.

Useful for small files or quick operations.

✅ Use when you're reading or writing small amounts of text.

```java
FileReader fr = new FileReader("data.txt");
int ch;
while ((ch = fr.read()) != -1) {
    System.out.print((char) ch);
}
fr.close();

```


🔸 2. BufferedReader / BufferedWriter
- Wraps around FileReader/FileWriter.

- Reads/writes chunks of characters (uses an internal buffer).

- Much faster and efficient, especially for large files.

- Provides helpful methods like readLine() and newLine().

✅ Use when you need better performance or are dealing with big files.

```java
BufferedReader br = new BufferedReader(new FileReader("data.txt"));
String line;
while ((line = br.readLine()) != null) {
    System.out.println(line);
}
br.close();

```

🔹 Summary Table
| Feature                   | FileReader/FileWriter | BufferedReader/BufferedWriter |
| ------------------------- | --------------------- | ----------------------------- |
| Buffering                 | ❌ No                  | ✅ Yes (internal buffer)       |
| Performance               | Slower                | Faster                        |
| Methods like `readLine()` | ❌ No                  | ✅ Yes                         |
| Use Case                  | Small data            | Large files / efficiency      |



🔹 FileInputStream vs FileReader
| Feature              | `FileInputStream`                   | `FileReader`                       |
| -------------------- | ----------------------------------- | ---------------------------------- |
| **Type of Data**     | Reads **binary data** (bytes)       | Reads **character data** (text)    |
| **Use For**          | Images, audio, PDF, etc. (non-text) | Text files (e.g., `.txt`, `.java`) |
| **Reads**            | Byte-by-byte (`int`, `byte[]`)      | Character-by-character (`char`)    |
| **Encoding Support** | No automatic encoding handling      | Yes, supports character encoding   |
| **Superclass**       | `InputStream`                       | `Reader`                           |


