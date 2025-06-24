📂 Categorization of java.io.File Methods
| **Category**              | **Method(s)**                                                                                                                                                                                                                          | **Purpose**                      |
| ------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------- |
| 🔨 **File Creation**      | `createNewFile()`<br>`mkdir()`<br>`mkdirs()`<br>`createTempFile(String, String)`<br>`createTempFile(String, String, File)`                                                                                                             | Create file or directories       |
| 📝 **Update / Modify**    | `setWritable(boolean)`<br>`setWritable(boolean, boolean)`<br>`setReadable(boolean)`<br>`setReadable(boolean, boolean)`<br>`setExecutable(boolean)`<br>`setExecutable(boolean, boolean)`<br>`setLastModified(long)`<br>`renameTo(File)` | Change file attributes or rename |
| 🗑️ **Delete Operations** | `delete()`<br>`deleteOnExit()`                                                                                                                                                                                                         | Delete file                      |
| 📋 **List Operations**    | `list()`<br>`list(FilenameFilter)`<br>`listFiles()`<br>`listFiles(FileFilter)`<br>`listFiles(FilenameFilter)`<br>`listRoots()`                                                                                                         | List contents of directory       |
| 🔐 **Permission Checks**  | `canRead()`<br>`canWrite()`<br>`canExecute()`<br>`setReadOnly()`                                                                                                                                                                       | Access control                   |
| 🧭 **Path & Info**        | `getPath()`<br>`getAbsolutePath()`<br>`getCanonicalPath()`<br>`getParent()`<br>`getParentFile()`<br>`toPath()`<br>`toURI()`<br>`toURL()`<br>`getAbsoluteFile()`<br>`getCanonicalFile()`                                                | File location and conversion     |
| 📊 **File Metadata**      | `exists()`<br>`isDirectory()`<br>`isFile()`<br>`isAbsolute()`<br>`isHidden()`<br>`length()`<br>`lastModified()`<br>`getTotalSpace()`<br>`getFreeSpace()`<br>`getUsableSpace()`<br>`getPrefixLength()`                                  | Check existence/type/details     |
| ⚖️ **Compare / Equal**    | `equals(Object)`<br>`compareTo(File)`<br>`compareTo(Object)`<br>`hashCode()`                                                                                                                                                           | Compare files or hash            |
| 🧾 **Misc**               | `getName()`<br>`toString()`<br>`readObject(ObjectInputStream)`<br>`writeObject(ObjectOutputStream)`<br>`slashify(String, boolean)`<br>`normalizedList()`                                                                               | Utility / serialization          |


✅ Summary Table
| Term               | Method               | Description                                                                                      | Resolves Symlinks? | Removes `.` and `..`? | Throws IOException? |
| ------------------ | -------------------- | ------------------------------------------------------------------------------------------------ | ------------------ | --------------------- | ------------------- |
| **Path**           | `getPath()`          | Returns the **path string** as passed to the `File` constructor (can be relative or absolute)    | ❌                  | ❌                     | ❌                   |
| **Absolute Path**  | `getAbsolutePath()`  | Returns the **absolute path** by appending the current working directory if the path is relative | ❌                  | ❌                     | ❌                   |
| **Canonical Path** | `getCanonicalPath()` | Returns the **standard, unique path** — resolves symbolic links and removes `.` & `..`           | ✅                  | ✅                     | ✅                   |


✅ What is Externalization in Java?
- Externalization is an advanced form of serialization that gives you full control over the serialization and deserialization process of an object. It is done     using the Externalizable interface.

🧠 Difference Between Serialization and Externalization

| Feature             | Serialization (`Serializable`)                      | Externalization (`Externalizable`)                   |
| ------------------- | --------------------------------------------------- | ---------------------------------------------------- |
| Control             | Partial (defaultWriteObject)                        | Full control (must write and read all data manually) |
| Interface           | `Serializable` (marker interface)                   | `Externalizable` (has two abstract methods)          |
| Performance         | Slower (writes all non-transient fields by default) | Faster (you choose what to write/read)               |
| Flexibility         | Less flexible                                       | More flexible                                        |
| Default Constructor | Not required                                        | **Required** (mandatory public no-arg constructor)   |


