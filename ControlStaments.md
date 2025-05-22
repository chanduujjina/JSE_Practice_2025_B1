# Java Control Statements

In Java, control statements are used to alter the flow of execution of the program based on conditions or repetitions. They are categorized into three main types:

---

## 1. Conditional Statements (Decision-Making)

These statements evaluate conditions and execute specific blocks of code based on whether the condition is true or false.

### 🔹 if Statement
Executes a block if the condition is true.

```java
if (condition) {
    // code to execute
}

int number = 10;
if (number > 0) {
    System.out.println("Positive number");
}
```

### 🔹  if-else Statement

```java
if (condition) {
    // code block if condition is true
} else {
    // code block if condition is false
}
```
### 🔹 if-else-if Ladder

```java
if (condition1) {
    // code block 1
} else if (condition2) {
    // code block 2
} else {
    // default code block
}
```

### 🔹 switch Statement
Allows selection among multiple values of an expression.

```java
switch (expression) {
    case value1:
        // block of code
        break;
    case value2:
        // block of code
        break;
    default:
        // default block
}
```
### 🔹 for Loop
``` java
for (initialization; condition; update) {
    // loop body
}

```

### 🔹 while Loop
```java
while (condition) {
    // loop body
}

```

### 🔹 do-while Loop
```java
do {
    // loop body
} while (condition);

```

### 🔹 Jumping or branching statements

### 🔹 break Statement
   Terminates the current loop or switch statement.
```java
for (int i = 0; i < 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

###🔹 Continue Statement
Skips the current iteration and proceeds to the next one.


