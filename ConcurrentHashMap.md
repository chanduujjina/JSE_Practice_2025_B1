# ✅ What is ConcurrentHashMap?

- ConcurrentHashMap is a thread-safe, high-performance Map implementation from java.util.concurrent package, introduced in Java 5.
- Unlike Hashtable or Collections.synchronizedMap, it allows multiple threads to read and write without locking the entire map, enabling much better concurrency.

  ## 🧵 How It Accommodates Threads Efficiently

| Feature                | Explanation                                           |
| ---------------------- | ----------------------------------------------------- |
| **Read operations**    | Mostly **lock-free** using volatile variables         |
| **Write operations**   | **Fine-grained locking**, only locks required portion |
| **Internal structure** | Changes between Java 7 and Java 8 (explained below)   |

## 🏗️ Internal Working: Java 7 (Segmented Locking)
### 🔸 Structure
- The map is internally divided into Segments
- Each Segment extends ReentrantLock
- A Segment contains its own HashEntry[] (bucket array)

