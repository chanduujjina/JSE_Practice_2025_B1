# 🧵 Multithreading in Java – Complete Notes

---

## 🔹 What is Multithreading?

Multithreading is the ability of a CPU to execute multiple threads concurrently. A thread is a lightweight sub-process, the smallest unit of processing.

### ✅ Benefits:
- Better CPU utilization
- Concurrent processing
- Faster execution for I/O-heavy apps

---

## 🔹 Key Terms

| Term         | Description |
|--------------|-------------|
| Thread       | Smallest unit of execution |
| Process      | A running program |
| Concurrency  | Executing multiple tasks together (not always parallel) |
| Parallelism  | Running tasks truly at the same time (multi-core CPUs) |

---

## 🔹 Ways to Create Threads in Java

### 1. By Extending `Thread` Class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

MyThread t1 = new MyThread();
t1.start();
```

## 🔹 Thread Lifecycle
- New

- Runnable

- Running

- Blocked / Waiting

- Terminated

```
Thread[#33,Thread-4,5,main]
```

| Value        | Meaning                          |
| ------------ | -------------------------------- |
| **#33**      | JVM thread ID (incremental)      |
| **Thread-4** | 5th thread created (starts at 0) |
| **5**        | Default priority                 |
| **main**     | Belongs to main thread group     |

