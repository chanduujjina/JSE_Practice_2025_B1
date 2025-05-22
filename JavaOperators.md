# ✅ Java Operators Overview

In Java, **operators** are special symbols used to perform operations on variables and values.

---

## 🔹 1. Arithmetic Operators

| Operator | Description         | Example (`a = 10`, `b = 3`) | Result |
|----------|---------------------|------------------------------|--------|
| `+`      | Addition             | `a + b`                      | `13`   |
| `-`      | Subtraction          | `a - b`                      | `7`    |
| `*`      | Multiplication       | `a * b`                      | `30`   |
| `/`      | Division             | `a / b`                      | `3`    |
| `%`      | Modulus (Remainder)  | `a % b`                      | `1`    |

---

## 🔹 2. Relational (Comparison) Operators

| Operator | Description              | Example    | Result   |
|----------|--------------------------|------------|----------|
| `==`     | Equal to                 | `a == b`   | `false`  |
| `!=`     | Not equal to             | `a != b`   | `true`   |
| `>`      | Greater than             | `a > b`    | `true`   |
| `<`      | Less than                | `a < b`    | `false`  |
| `>=`     | Greater than or equal to | `a >= b`   | `true`   |
| `<=`     | Less than or equal to    | `a <= b`   | `false`  |

---


## 🔹 3. Logical Operators

| Operator | Name         | Description                                      | Example           | Result   |
|----------|--------------|--------------------------------------------------|-------------------|----------|
| `&&`     | Logical AND  | Returns `true` only if **both** operands are true| `true && false`   | `false`  |
| `\\`     | Logical OR   | Returns `true` if **any one** operand is true    | `true \\ false`   | `true`   |
| `!`      | Logical NOT  | Inverts the `boolean` value                      | `!true`           | `false`  |

---

## 🔹 4. Assignment Operators

| Operator | Description         | Example    | Equivalent To    |
|----------|---------------------|------------|------------------|
| `=`      | Assignment          | `a = b`    | —                |
| `+=`     | Add and assign      | `a += b`   | `a = a + b`      |
| `-=`     | Subtract and assign | `a -= b`   | `a = a - b`      |
| `*=`     | Multiply and assign | `a *= b`   | `a = a * b`      |
| `/=`     | Divide and assign   | `a /= b`   | `a = a / b`      |
| `%=`     | Modulus and assign  | `a %= b`   | `a = a % b`      |

---

## 🔹 5. Unary Operators

| Operator | Description                | Example | Result  |
|----------|----------------------------|---------|---------|
| `+`      | Unary plus (positive sign) | `+a`    | `+10`   |
| `-`      | Unary minus (negation)     | `-a`    | `-10`   |
| `++`     | Increment                  | `++a`   | `11`    |
| `--`     | Decrement                  | `--a`   | `9`     |
| `!`      | Logical complement         | `!true` | `false` |

---

## 🔹 6. Bitwise Operators

| Operator | Description     | Example    |
|----------|-----------------|------------|
| `&`      | Bitwise AND     | `a & b`    |
| `|`      | Bitwise OR      | `a | b`    |
| `^`      | Bitwise XOR     | `a ^ b`    |
| `~`      | Bitwise NOT     | `~a`       |
| `<<`     | Left shift      | `a << 2`   |
| `>>`     | Right shift     | `a >> 2`   |
| `>>>`    | Unsigned shift  | `a >>> 2`  |

---

## 🔹 7. Ternary Operator

| Operator | Description        | Example                    | Result   |
|----------|--------------------|----------------------------|----------|
| `?:`     | Ternary condition  | `(a > b) ? a : b`          | `10`     |

---

## 🔹 8. instanceof Operator

| Operator      | Description                          | Example            |
|---------------|--------------------------------------|--------------------|
| `instanceof`  | Checks if object is instance of class | `obj instanceof String` |

---

> 📘 Use these operators in Java to perform mathematical, logical, and comparison operations on variables.

# Bitwise Operators in Java

Bitwise operators perform operations on individual bits of integer types (`int`, `long`, `short`, `byte`, and `char`). They are useful for low-level programming tasks, such as manipulating flags, encoding, or optimizing performance.

---

## Types of Bitwise Operators

| Operator | Description                            | Example            | Result Explanation                      |
|----------|------------------------------------|--------------------|---------------------------------------|
| `&`      | Bitwise AND                        | `5 & 3`            | Performs AND on each bit: `0101 & 0011 = 0001` (decimal 1) |
| `|`      | Bitwise OR                         | `5 \| 3`           | Performs OR on each bit: `0101 \| 0011 = 0111` (decimal 7)  |
| `^`      | Bitwise XOR (exclusive OR)         | `5 ^ 3`            | Performs XOR on each bit: `0101 ^ 0011 = 0110` (decimal 6) |
| `~`      | Bitwise NOT (one’s complement)     | `~5`               | Flips all bits: `~0101 = 1010` (decimal -6 in 2’s complement) |
| `<<`     | Left shift                        | `5 << 1`           | Shifts bits left by 1: `0101 << 1 = 1010` (decimal 10)    |
| `>>`     | Right shift (sign-propagating)     | `5 >> 1`           | Shifts bits right by 1: `0101 >> 1 = 0010` (decimal 2)    |
| `>>>`    | Unsigned right shift (zero-fill)   | `-5 >>> 1`         | Shifts bits right by 1, fills left with 0                 |

---

## Examples

```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;    // binary: 0101
        int b = 3;    // binary: 0011

        System.out.println("a & b = " + (a & b));   // 1
        System.out.println("a | b = " + (a | b));   // 7
        System.out.println("a ^ b = " + (a ^ b));   // 6
        System.out.println("~a = " + (~a));         // -6 (2's complement)
        System.out.println("a << 1 = " + (a << 1)); // 10
        System.out.println("a >> 1 = " + (a >> 1)); // 2
        System.out.println("-a >>> 1 = " + (-a >>> 1)); // Unsigned right shift
    }
}

