# 🔍 Java Regular Expressions (Regex)

## ✅ What is a Regular Expression?
A **regular expression (regex)** is a pattern used to match sequences of characters in strings.

Java provides built-in support via:
- `String.matches()`
- `String.replaceAll()`
- `String.replaceFirst()`
- `String.split()`
- And the `java.util.regex` package

---

## ✅ Basic Syntax & Metacharacters

| Pattern | Description                     | Example Match       |
|---------|----------------------------------|---------------------|
| `.`     | Any character                   | `a`, `1`, `@`       |
| `\d`    | Digit [0-9]                     | `0` to `9`          |
| `\D`    | Non-digit                       | `a`, `@`, ` `       |
| `\w`    | Word character [a-zA-Z0-9_]     | `abc`, `123`, `_`   |
| `\W`    | Non-word character              | `#`, `-`, ` `       |
| `\s`    | Whitespace                      | space, tab, newline |
| `\S`    | Non-whitespace                  | `a`, `1`, `#`       |
| `^`     | Start of string                 | `^abc` → `abcdef`   |
| `$`     | End of string                   | `abc$` → `xxabc`    |
| `[]`    | Character class                 | `[abc]` matches `a` |
| `[^]`   | Negation in class               | `[^abc]`            |
| `|`     | OR                              | `cat|dog`           |
| `()`    | Grouping                        | `(ab)+`             |
| `*`     | 0 or more times                 | `a*` matches `""`, `a`, `aaa` |
| `+`     | 1 or more times                 | `a+` matches `a`, `aa` |
| `?`     | 0 or 1 time                     | `a?` matches `""`, `a` |
| `{n}`   | Exactly `n` times               | `a{3}` matches `aaa` |
| `{n,}`  | At least `n` times              | `a{2,}`             |
| `{n,m}` | Between `n` and `m` times       | `a{2,4}` matches `aa`, `aaa`, `aaaa` |

> ⚠️ Escape special characters in Java with double backslashes: `\\d`, `\\w`, etc.

---

# Java Regex Patterns

This document provides commonly used regular expressions in Java for:

1. **Number**
2. **Alphabets**
3. **Alphanumeric**

---

## 1. Number

### Pattern:
```java
String regexNumber = "^-?\\d+$";

String regexAlphabets = "^[a-zA-Z]+$";

String regexAlphanumeric = "^[a-zA-Z0-9]+$";

## ✅ DOB Validation Regex (MM/DD/YYYY Format)

```regex
^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/(19|20)\d{2}$
```








