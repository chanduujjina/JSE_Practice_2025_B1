# 🔗 Java `LinkedList` Method Categorization

A categorized overview of commonly used methods in `java.util.LinkedList`.

---

## 🔹 1. Create (Add Elements)

| Method                          | Description                                         |
|---------------------------------|-----------------------------------------------------|
| `add(E e)`                      | Appends element to the end of the list              |
| `add(int index, E element)`     | Inserts element at specified position               |
| `addFirst(E e)`                 | Inserts element at the beginning                    |
| `addLast(E e)`                  | Inserts element at the end                          |
| `offer(E e)`                    | Adds element to the tail (queue style)              |
| `offerFirst(E e)`               | Adds element to the front                           |
| `offerLast(E e)`                | Adds element to the end                             |
| `addAll(Collection c)`          | Appends all elements from another collection        |
| `addAll(int index, Collection c)` | Inserts all at specific position                  |

---

## 🔹 2. Read / Search (Retrieve/Check Elements)

| Method                  | Description                                     |
|-------------------------|-------------------------------------------------|
| `get(int index)`        | Returns element at specified index              |
| `getFirst()`            | Returns first element                           |
| `getLast()`             | Returns last element                            |
| `peek()`                | Retrieves head without removing (null if empty) |
| `peekFirst()`           | Retrieves first element (null if empty)         |
| `peekLast()`            | Retrieves last element (null if empty)          |
| `element()`             | Like `peek()` but throws exception if empty     |
| `contains(Object o)`    | Checks if list contains the object              |
| `indexOf(Object o)`     | First index of element                          |
| `lastIndexOf(Object o)` | Last index of element                           |
| `size()`                | Number of elements                              |
| `isEmpty()`             | Checks if the list is empty                     |

---

## 🔹 3. Update (Modify Elements)

| Method                        | Description                                |
|-------------------------------|--------------------------------------------|
| `set(int index, E element)`   | Replaces element at specified index        |
| `ListIterator.set(E e)`       | Replaces last returned element during iteration |

---

## 🔹 4. Delete (Remove Elements)

| Method                    | Description                                      |
|---------------------------|--------------------------------------------------|
| `remove()`                | Removes head element                             |
| `remove(int index)`       | Removes element at index                         |
| `remove(Object o)`        | Removes first occurrence of object               |
| `removeFirst()`           | Removes first element                            |
| `removeLast()`            | Removes last element                             |
| `poll()`                  | Retrieves and removes head (null if empty)       |
| `pollFirst()`             | Retrieves and removes first element              |
| `pollLast()`              | Retrieves and removes last element               |
| `clear()`                 | Removes all elements                             |
| `removeAll(Collection c)` | Removes all elements in the given collection     |
| `retainAll(Collection c)` | Retains only elements in the given collection    |

---

## 🔹 5. Sort

| Method                                | Description                                |
|---------------------------------------|--------------------------------------------|
| `Collections.sort(list)`              | Sorts list using natural order             |
| `Collections.sort(list, Comparator)`  | Sorts list with custom comparator          |
| `list.sort(Comparator)` *(Java 8+)*   | In-place sorting using comparator          |

---

## 🔹 6. Aggregators (Manual in Java 7)

| Operation       | How to Perform (Java 7)                   |
|-----------------|-------------------------------------------|
| Sum             | Loop through list and accumulate manually |
| Min / Max       | Use `Collections.min(list)` / `max(list)` |
| Count           | Use `list.size()`                         |
| Average         | `(sum / list.size())` after loop          |

---

## 🔹 7. Iteration / Traversal

| Method               | Description                             |
|----------------------|-----------------------------------------|
| `iterator()`         | Basic forward iterator                  |
| `descendingIterator()` | Iterates from tail to head            |
| `listIterator()`     | Bidirectional iteration                 |
| `for-each loop`      | Enhanced for-loop                       |

---

## 🔹 8. Filter (Manual in Java 7)

| Technique                      | Description                                  |
|--------------------------------|----------------------------------------------|
| Loop with `if(condition)`      | Filter elements based on logic               |
| Build new list manually        | Add filtered elements to a new list          |

## 🔹 offer() Methods in LinkedList
| Method            | Description                                                    |
| ----------------- | -------------------------------------------------------------- |
| `offer(E e)`      | Adds element to the **end** (tail) of the list (Queue style)   |
| `offerFirst(E e)` | Adds element to the **front** (head) of the list (Deque style) |
| `offerLast(E e)`  | Adds element to the **end** (tail), same as `offer(e)`         |


🔁 LinkedList Dual Nature
- LinkedList implements both:

- List interface (like ArrayList)

- Deque (Double-Ended Queue) interface

  - This makes it behave like:

  - A Queue (FIFO)
  - A Stack (LIFO)

## 🔷 Queue-Like Behavior (FIFO)

| Method         | Adds Where?  | Behavior                                                          |
| -------------- | ------------ | ----------------------------------------------------------------- |
| `offer(e)`     | End (tail)   | Queue-style insert (safe)                                         |
| `add(e)`       | End (tail)   | Same as `offer`, but throws exception if full (in bounded queues) |
| `offerLast(e)` | End (tail)   | Same as `offer(e)`                                                |
| `poll()`       | Front (head) | Removes and returns first element                                 |
| `peek()`       | Front (head) | Returns first element without removing                            |

## 🔷 Stack-Like Behavior (LIFO)
| Method        | Adds Where?  | Behavior                       |
| ------------- | ------------ | ------------------------------ |
| `push(e)`     | Front (head) | Stack-style push (LIFO)        |
| `addFirst(e)` | Front (head) | Same as `push`                 |
| `pop()`       | Front (head) | Stack-style pop (removes head) |
| `peekFirst()` | Front (head) | Top of stack (no remove)       |

## 🔍 Difference Between poll(), peek(), pop(), peekFirst()
| Method        | Removes? | Throws Exception if Empty?       | From Where? | Interface       | Use Case     |
| ------------- | -------- | -------------------------------- | ----------- | --------------- | ------------ |
| `poll()`      | ✅ Yes    | ❌ No (returns `null`)            | Head        | `Queue`         | Queue (FIFO) |
| `peek()`      | ❌ No     | ❌ No (returns `null`)            | Head        | `Queue`         | Queue (FIFO) |
| `pop()`       | ✅ Yes    | ✅ Yes (`NoSuchElementException`) | Head        | `Deque` / Stack | Stack (LIFO) |
| `peekFirst()` | ❌ No     | ❌ No (returns `null`)            | Head        | `Deque`         | Stack/Deque  |

## 🔁 Summary:

- poll(): safe removal from front — returns null if empty.

- peek(): safe lookup from front — returns null if empty.

- pop(): stack-style removal from front — throws exception if empty.

- peekFirst(): like peek(), just more explicit for deque usage.

- 💡 Use poll() and peek() in queues, and pop() and push() in stacks.

## 📘 Remove element

| You Want To...                   | Use This Method          |
| -------------------------------- | ------------------------ |
| Remove safely from front         | `poll()`                 |
| Remove safely from back          | `pollLast()`             |
| Remove with exception from front | `pop()`                  |
| Remove with exception from back  | `removeLast()`           |
| Just look at front               | `peek()` / `peekFirst()` |
| Just look at back                | `peekLast()`             |


