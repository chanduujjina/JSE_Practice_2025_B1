
# Java Identifiers

## ✅ What is an Identifier?

An **identifier** is the name used for:
- Classes
- Methods
- Variables
- Packages
- Interfaces
- Enums, etc.

---

## 🎯 Rules for Valid Identifiers

| Rule | Description |
|------|-------------|
| 1    | Must begin with a **letter (A–Z or a–z)**, **dollar sign `$`**, or **underscore `_`** |
| 2    | Subsequent characters can be **letters**, **digits (0–9)**, `$`, or `_` |
| 3    | **Cannot begin with a digit** (e.g., `1name` is invalid) |
| 4    | **Cannot be a Java keyword or reserved word** (e.g., `class`, `int`, `static`) |
| 5    | **No spaces** or special characters like `@`, `#`, `%`, etc. |
| 6    | Java identifiers are **case-sensitive** (`Variable` ≠ `variable`) |

---



## ✅ Examples of Valid Identifiers

- `myVar`
- `_name`
- `$amount`
- `employee123`
- `MAX_SIZE`

---

## ❌ Examples of Invalid Identifiers

| Identifier    | Reason                      |
|---------------|-----------------------------|
| `123name`     | Starts with a digit         |
| `void`        | Java keyword                |
| `user-name`   | Contains invalid character `-` |
| `first name`  | Contains a space            |

---
## ❌ Characters **Not Allowed** in Identifiers

### Special Characters (Invalid):
- `@` `#` `%` `^` `&` `*` `(` `)` `-` `+` `=` `{` `}` `[ `]` `:` `;` `'` `"` `<` `>` `,` `.` `?` `/` `\` `|` `~`

## 💡 Best Practices

- Use **camelCase** for variables and methods: `myVariable`, `calculateSum()`
- Use **PascalCase** for class names: `EmployeeDetails`
- Avoid starting identifiers with `_` or `$` unless required by conventions or frameworks
- Choose **meaningful names** that describe purpose

---

## 📌 Reserved Keywords (Cannot Be Used)

Some Java keywords include:  
`class`, `public`, `void`, `static`, `int`, `if`, `else`, `new`, `return`, `try`, `catch`, `final`, etc.

---


# Java Keywords

These are **reserved keywords** in Java and **cannot be used as identifiers** (e.g., variable or method names).

| Keyword       | Keyword      | Keyword       | Keyword       |
|---------------|--------------|---------------|---------------|
| abstract      | continue     | for           | new           |
| assert        | default      | goto*         | package       |
| boolean       | do           | if            | private       |
| break         | double       | implements    | protected     |
| byte          | else         | import        | public        |
| case          | enum         | instanceof    | return        |
| catch         | extends      | int           | short         |
| char          | final        | interface     | static        |
| class         | finally      | long          | strictfp      |
| const*        | float        | native        | super         |
| synchronized  | this         | throw         | volatile      |
| transient     | try          | throws        | while         |
| switch        | void         | true**        | false**       |
| null**        |              |               |               |

---

## Notes:
- `*` `const` and `goto` are **reserved but not currently used**.
- `**` `true`, `false`, and `null` are **literals**, not technically keywords, but they also **cannot be used as identifiers**.


<h3>Quiz</h3>
<a href="IdentifierQuestions.md">Click here to take quiz</a>
