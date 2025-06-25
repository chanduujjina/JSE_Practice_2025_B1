## 📘 Java Collections Summary Table



| Collection Type | Interface | Allows Duplicates | Maintains Order | Sorted | Thread Safe | Best Used When... |
|-----------------|-----------|-------------------|------------------|--------|--------------|--------------------|
| **ArrayList**   | List      | Yes               | Yes (Insertion)  | No     | No           | You need fast random access and dynamic array size |
| **LinkedList**  | List, Deque | Yes             | Yes (Insertion)  | No     | No           | You frequently add/remove elements from beginning/middle |
| **Vector**      | List      | Yes               | Yes (Insertion)  | No     | Yes          | Thread safety is required in a list |
| **Stack**       | List      | Yes               | LIFO             | No     | Yes (extends Vector) | You need LIFO (Last-In-First-Out) behavior |
| **HashSet**     | Set       | No                | No               | No     | No           | You need unique elements, no order required |
| **LinkedHashSet**| Set      | No                | Yes (Insertion)  | No     | No           | You need unique elements in insertion order |
| **TreeSet**     | Set, SortedSet | No          | Yes (Sorted)     | Yes    | No           | You need sorted unique elements |
| **PriorityQueue**| Queue    | Yes               | No               | Yes (Natural/Custom) | No | You need elements processed by priority |
| **ArrayDeque**  | Deque     | Yes               | Yes (FIFO/LIFO)  | No     | No           | You need stack or queue without size restrictions |
| **HashMap**     | Map       | Keys No, Values Yes | No            | No     | No           | You need fast access to key-value pairs |
| **LinkedHashMap**| Map      | Keys No, Values Yes | Yes (Insertion) | No     | No           | You need key-value pairs with insertion order |
| **TreeMap**     | Map, SortedMap | Keys No, Values Yes | Yes (Sorted Keys) | Yes | No      | You need key-value pairs sorted by keys |
| **Hashtable**   | Map       | Keys No, Values Yes | No            | No     | Yes          | You need a legacy thread-safe map |
| **Properties**  | Map       | Keys/Values as Strings | No         | No     | Yes          | You need config-like key-value storage (e.g., .properties files) |
