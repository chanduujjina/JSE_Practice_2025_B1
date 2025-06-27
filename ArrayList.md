# 📦 Java `ArrayList` Method Categorization

A categorized overview of commonly used methods in `java.util.ArrayList`.

---

## 🔹 1. Create (Add Elements)

| Method                      | Description                                |
|-----------------------------|--------------------------------------------|
| `add(E e)`                  | Appends the element to the end of the list |
| `add(int index, E element)` | Inserts element at the specified index     |
| `addAll(Collection c)`      | Appends all elements from the given collection |
| `addAll(int index, Collection c)` | Inserts all at specified index       |

---

## 🔹 2. Read / Search (Retrieve/Check Elements)

| Method              | Description                                  |
|---------------------|----------------------------------------------|
| `get(int index)`    | Returns element at specified index           |
| `contains(Object o)`| Returns true if list contains the element    |
| `indexOf(Object o)` | Returns first index of element               |
| `lastIndexOf(Object o)` | Returns last index of element           |
| `size()`            | Returns number of elements                   |
| `isEmpty()`         | Checks if the list is empty                  |
| `toArray()`         | Converts list to array                       |
| `subList(int from, int to)` | Returns portion of the list          |

---

## 🔹 3. Update (Modify Elements)

| Method                      | Description                             |
|-----------------------------|-----------------------------------------|
| `set(int index, E element)` | Replaces element at the specified index |

---

## 🔹 4. Delete (Remove Elements)

| Method                      | Description                                 |
|-----------------------------|---------------------------------------------|
| `remove(int index)`         | Removes element at the specified index      |
| `remove(Object o)`          | Removes the first occurrence of the object  |
| `clear()`                   | Removes all elements from the list          |
| `removeAll(Collection c)`   | Removes all elements in the specified collection |
| `retainAll(Collection c)`   | Keeps only elements also in specified collection |

---

## 🔹 5. Sort

| Method                            | Description                             |
|-----------------------------------|-----------------------------------------|
| `Collections.sort(list)`          | Sorts using natural order               |
| `Collections.sort(list, comp)`    | Sorts using custom comparator           |
| `list.sort(Comparator)` *(Java 8+)* | In-place sorting using comparator     |

---

## 🔹 6. Aggregators (Manual in Java 7)

| Operation           | How to Perform (Java 7)                  |
|---------------------|------------------------------------------|
| Sum                 | Loop and accumulate manually             |
| Min / Max           | Use `Collections.min(list)` / `max(list)`|
| Count               | Use `list.size()`                        |
| Average             | `(sum / list.size())` after loop         |

---

## 🔹 7. Iteration / Traversal

| Method               | Description                             |
|----------------------|-----------------------------------------|
| `iterator()`         | Basic forward iteration (read-only)     |
| `listIterator()`     | Forward & backward traversal, editable  |
| `for` / `for-each`   | Enhanced loop for reading elements       |

---

## 🔹 8. Filter (Manual in Java 7)

| Technique                      | Description                                |
|--------------------------------|--------------------------------------------|
| Loop with `if(condition)`      | Filter based on condition                  |
| Build new list manually        | Add matching elements to a new list        |

