# 🔐 ConcurrentHashMap in Java

## ✅ Overview

`ConcurrentHashMap` is a thread-safe, high-performance implementation of the `Map` interface.  
It is part of the `java.util.concurrent` package and designed for concurrent use in multithreaded environments.

---

## 🔧 Internal Working

### Java 7:
- Used **Segmented Locking**
- Divided map into segments, each with its own lock

### Java 8:
- Removed segments
- Uses **bucket-level locks** and **CAS (Compare-And-Swap)** for writes
- **Lock-free reads** and **fine-grained locking**

---

## 🧠 Key Features

| Feature                  | Details                         |
|--------------------------|---------------------------------|
| Thread-safe              | ✅ Yes                          |
| Null keys/values         | ❌ Not allowed                 |
| Read operations          | Lock-free                      |
| Write operations         | Synchronized on bucket         |
| Performance              | High in concurrent access       |
| Iterator behavior        | Fail-safe                      |

---

## ⚙️ Common Operations

```java
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

map.put("a", 1);
map.get("a");
map.putIfAbsent("b", 2);
map.remove("a");
map.compute("a", (k, v) -> v + 1);
