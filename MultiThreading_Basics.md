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


```java
public class CustomThread  extends Thread {
	
	private int id;
	
	public CustomThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		
		 System.out.println("Thread started: " + Thread.currentThread() + " ID: " + id);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted: " + id);
		}
		
		System.out.println("Thread finished: " + Thread.currentThread() + " ID: " + id);
		
	}

}

for (int i = 1;i<10;i++) {
			CustomThread customThread = new CustomThread(i);
			customThread.start();
		}

```

## 🔍 What This Output Shows:

| What Happened                       | What It Means                                                          |
| ----------------------------------- | ---------------------------------------------------------------------- |
| **Started in random order**         | JVM scheduled threads independently; not guaranteed sequential         |
| **Finished in different order**     | Some threads finished earlier depending on CPU and sleep timing        |
| **Thread IDs (`#29`, `#30`, etc.)** | Internally assigned by JVM (unique per thread)                         |
| **Thread Names (`Thread-0`, etc.)** | Default names; auto-incremented                                        |
| **`main`** group                    | All threads are part of `main` thread group unless custom group is set |


