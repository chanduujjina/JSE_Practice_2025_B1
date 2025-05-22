## Java Data Types: Primitive vs Non-Primitive

<img src="java-data-types.png" alt="Flowers in Chania">



In Java, data types are broadly classified into two categories:

---

### ✅ Primitive Data Types

- Built-in types provided by the Java language.
- Store **simple values** (not objects).
- Fast and memory-efficient.
- Stored on the **stack**.

#### 🔹 Examples:

| Type     | Size     | Description                 |
|----------|----------|-----------------------------|
| `byte`   | 1 byte   | Small integer (−128 to 127) |
| `short`  | 2 bytes  | Medium integer              |
| `int`    | 4 bytes  | Standard integer            |
| `long`   | 8 bytes  | Large integer               |
| `float`  | 4 bytes  | Decimal (single precision)  |
| `double` | 8 bytes  | Decimal (double precision)  |
| `char`   | 2 bytes  | Single character (Unicode)  |
| `boolean`| ~1 bit   | `true` or `false`           |

---



### ✅ Non-Primitive Data Types

- Also called **reference types**.
- Can store **multiple values** and **methods** (like objects).
- Stored on the **heap**, with references on the stack.
- Can be `null`.
- Created using **classes**, **arrays**, **interfaces**, etc.

#### 🔹 Examples:
- `String`
- Arrays (`int[]`, `String[]`)
- User-defined classes (`MyClass`)
- Collections (`List`, `Map`, `Set`)
- Interfaces

---

### 🆚 Key Differences

| Feature             | Primitive           | Non-Primitive             |
|---------------------|---------------------|----------------------------|
| Memory              | Stack               | Heap                      |
| Nullability         | Cannot be `null`    | Can be `null`             |
| Methods             | No methods          | Can have methods          |
| Mutability          | Immutable           | Mutable (mostly)          |
| Example             | `int x = 10;`       | `String s = "Hello";`     |

---

> 🧠 **Tip**: Use primitives for performance-critical tasks, and non-primitives when you need objects or collections of data.




### 📊 Java Data Types Summary

| Type     | Size     | Typical Use Case               |
|----------|----------|--------------------------------|
| `byte`   | 1 byte   | Small numbers, binary data     |
| `short`  | 2 bytes  | Rare use, legacy or tight memory |
| `int`    | 4 bytes  | Default for integers           |
| `long`   | 8 bytes  | Large numbers, timestamps      |
| `float`  | 4 bytes  | Decimal numbers, less precision |
| `double` | 8 bytes  | Default for decimal numbers    |
| `boolean`| ~1 bit   | True/false flags               |
| `char`   | 2 bytes  | Single Unicode characters      |


| Data Type  | Minimum Value                           | Maximum Value                          | Notes                                  |
|------------|-----------------------------------------|----------------------------------------|----------------------------------------|
| **byte**   | -128                                    | 127                                    | 8-bit signed integer                   |
| **short**  | -32,768                                 | 32,767                                 | 16-bit signed integer                  |
| **int**    | -2,147,483,648                          | 2,147,483,647                          | 32-bit signed integer                  |
| **long**   | -9,223,372,036,854,775,808              | 9,223,372,036,854,775,807              | 64-bit signed integer                  |
| **float**  | ~1.4E-45 (positive min)                 | ~3.4E+38                               | 32-bit IEEE 754 floating point         |
| **double** | ~4.9E-324 (positive min)                | ~1.7E+308                              | 64-bit IEEE 754 floating point         |
| **char**   | 0                                       | 65,535 (unsigned 16-bit)               | Unicode character                      |
| **boolean**| false                                   | true                                   | Only two values                        |




## Why Choosing the Right Data Type Matters

Choosing the appropriate data type in Java (or any typed language) can significantly affect your application's performance, readability, and reliability.

---

### ✅ Memory Efficiency
- Using smaller types like `byte` or `short` reduces memory usage.
- Helps when dealing with large arrays or memory-constrained environments.
- Example: `byte` takes 1 byte vs `int` which takes 4 bytes.

---

### ✅ Performance
- Correct data types minimize type conversions and reduce runtime overhead.
- Prevents overflow and other arithmetic errors.
- Leads to faster execution in loops and calculations.
- Example: Using `long` instead of `int` for very large numbers avoids overflow.

---

### ✅ Code Clarity
- Data types express developer intent clearly (e.g., `boolean` for flags).
- Makes the code easier to read, understand, and maintain.
- Helps others quickly understand what kind of data is expected or stored.

---

### 🧠 Tip:
> Always use the smallest type that fits your data and use domain-appropriate types (e.g., `boolean` for true/false).

### Diffrences b/w float and double
| Feature           | **float**                           | **double**                           |
|------------------|-------------------------------------|--------------------------------------|
| **Size**          | 32 bits (4 bytes)                  | 64 bits (8 bytes)                    |
| **Precision**     | ~7 decimal digits                  | ~15–16 decimal digits                |
| **Range**         | ±1.4 × 10<sup>−45</sup> to ±3.4 × 10<sup>38</sup> | ±4.9 × 10<sup>−324</sup> to ±1.7 × 10<sup>308</sup> |
| **Default type**  | No (in most languages)             | Yes (in most languages like Java, C#)|
| **Memory usage**  | Lower                              | Higher                               |
| **Performance**   | Slightly faster on some systems    | Slightly slower but more precise     |
| **Use case**      | Less precision needed (e.g., graphics) | High precision needed (e.g., scientific calculations) |


<a href="https://gist.github.com/igorbotian/ace3863672fb182c07ea88c57b355b98/">Click here for Java data types</a>

<a href="https://www.geeksforgeeks.org/data-types-in-java/">Click here for Java detailed data types</a>

<h3>Data Types Quiz</h3>
<a href="Questions.md">Click here to take quiz on data type</a>

