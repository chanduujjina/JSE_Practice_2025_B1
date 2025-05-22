# Java Operators Quiz

Test your understanding of Java operators. Click **See Answer** to view the correct choice and explanation.

---

### 1. What is the result of: `5 & 3`?

- [ ] 7  
- [ ] 0  
- [ ] 1  
- [ ] 3  

<details>
  <summary><strong>See Answer</strong></summary>

✅ **Answer:** `1`  
`5 & 3` → `0101 & 0011 = 0001` → `1` in decimal.

</details>

---

### 2. What is the result of: `5 | 3`?

- [ ] 0  
- [ ] 7  
- [ ] 1  
- [ ] 3  

<details>
  <summary><strong>See Answer</strong></summary>

✅ **Answer:** `7`  
`5 | 3` → `0101 | 0011 = 0111` → `7` in decimal.

</details>

---

### 3. What does the `^` (XOR) operator do?

- [ ] Sets bits to 1 where both are 1  
- [ ] Inverts all bits  
- [ ] Sets bits to 1 where bits differ  
- [ ] Shifts bits left  

<details>
  <summary><strong>See Answer</strong></summary>

✅ **Answer:** Sets bits to 1 where bits differ  
XOR compares each bit and sets it to 1 only if the bits are different.

</details>

---

### 4. What is the result of: `~5` in Java?

- [ ] -6  
- [ ] 6  
- [ ] -5  
- [ ] 5  

<details>
  <summary><strong>See Answer</strong></summary>

✅ **Answer:** `-6`  
`~5` flips all bits: `~00000101` → `11111010` → `-6` in two's complement.

</details>

---

### 5. What does the `>>` operator do?

- [ ] Left shift with sign  
- [ ] Right shift with sign  
- [ ] Right shift with zero-fill  
- [ ] Bitwise OR  

<details>
  <summary><strong>See Answer</strong></summary>

✅ **Answer:** Right shift with sign  
The `>>` operator shifts bits to the right, preserving the sign bit (arithmetic shift).

</details>

---

### 6. What does the `>>>` operator do?

- [ ] Unsigned right shift  
- [ ] Signed right shift  
- [ ] Logical AND  
- [ ] Bitwise NOT  

<details>
  <summary><strong>See Answer</strong></summary>

✅ **Answer:** Unsigned right shift  
The `>>>` operator performs a logical (zero-fill) right shift.

</details>

---

### 7. What is the result of: `5 << 1`?

- [ ] 2  
- [ ] 10  
- [ ] 5  
- [ ] 8  

<details>
  <summary><strong>See Answer</strong></summary>

✅ **Answer:** `10`  
`5 << 1` shifts left by one bit: `0101` → `1010` = `10`

</details>
