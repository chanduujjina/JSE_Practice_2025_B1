# 🔍 ConcurrentSkipListMap
- The ConcurrentSkipListMap and ConcurrentSkipListSet are part of the java.util.concurrent package.
- and they are sorted, thread-safe, non-blocking concurrent collections based on a Skip List data structure.

# 🧠 Advantages
| Feature                     | Description                                                                |
| --------------------------- | -------------------------------------------------------------------------- |
| ✅ **Thread-safe**           | Concurrent access with internal synchronization                            |
| ✅ **Sorted**                | Elements are maintained in **natural order** or using a custom comparator  |
| ✅ **Lock-free reads**       | Very efficient in read-heavy applications                                  |
| ✅ **Non-blocking behavior** | Readers and writers do **not block** each other                            |
| 🔁 **Navigable**            | Implements `NavigableMap` / `NavigableSet`                                 |
| 🔢 **Skip List-based**      | Balanced performance and sorted structure (alternative to tree-based maps) |


# 🔐 Comparison with Other Maps
| Feature              | `HashMap`  | `TreeMap`      | `ConcurrentHashMap` | `ConcurrentSkipListMap` |
| -------------------- | ---------- | -------------- | ------------------- | ----------------------- |
| Thread-safe          | ❌          | ❌              | ✅                   | ✅                       |
| Sorted               | ❌          | ✅              | ❌                   | ✅                       |
| Lock-free Reads      | ❌          | ❌              | ✅                   | ✅                       |
| Underlying Structure | Hash Table | Red-Black Tree | Hash Table          | Skip List               |
