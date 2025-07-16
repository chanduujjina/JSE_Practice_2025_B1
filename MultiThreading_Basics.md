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
