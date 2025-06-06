

## ✅ 1. Introduction to Strings
- What is a `String`?
- String is **immutable** in Java.
- String creation:
  - Using string literals: `String s = "Hello";`
  - Using `new` keyword: `String s = new String("Hello");`

## ✅ 2. Common String Methods
- `length()`
- `charAt(int index)`
- `substring(int beginIndex, int endIndex)`
- `toUpperCase()`
- `toLowerCase()`
- `trim()`
- `equals(String other)`
- `equalsIgnoreCase(String other)`
- `contains(String sequence)`
- `startsWith(String prefix)`
- `endsWith(String suffix)`
- `indexOf(String str)`
- `lastIndexOf(String str)`

## ✅ 3. String Concatenation
- Using `+` operator: `"Hello" + "World"`
- Using `concat()`: `"Hello".concat("World")`
- Performance comparison:
  - `String` vs `StringBuilder` vs `StringBuffer`

## ✅ 4. String Comparison
- `==` vs `.equals()`
- `compareTo(String anotherString)`

## ✅ 5. String Conversion
- Convert primitives to string:
  - `String.valueOf(int)`
  - `Integer.toString(int)`
- Convert string to primitive:
  - `Integer.parseInt(String)`
  - `Double.parseDouble(String)`

## ✅ 6. StringBuilder & StringBuffer
- Mutable alternatives to `String`
- Methods:
  - `append()`
  - `insert()`
  - `delete()`
  - `replace()`
  - `reverse()`
  - `toString()`
- Difference between `StringBuilder` and `StringBuffer` (thread safety)

## ✅ 7. Splitting and Joining Strings
- `split(String regex)`:
  - Example: `"a,b,c".split(",")`
- `String.join(CharSequence delimiter, CharSequence... elements)`
  - Example: `String.join("-", "2025", "05", "26")`

## ✅ 8. String Formatting
- `String.format(String format, Object... args)`
  - Example: `String.format("Name: %s, Age: %d", "Alice", 25)`
- `System.out.printf()`

## ✅ 9. Regular Expressions (Basic)
- `matches(String regex)`
- `replaceAll(String regex, String replacement)`
- `replaceFirst(String regex, String replacement)`

## ✅ 10. String Practice Problems
- ✅ Reverse a string
- ✅ Check if a string is a palindrome
- ✅ Count vowels and consonants
- ✅ Remove duplicate characters
- ✅ Word count using `split(" ")`
- ✅ Find the first non-repeating character

---

#### Java String class methods

The java.lang.String class provides many useful methods to perform operations on sequence of char values.

|No|	Method	|Description|
|-------|--------|---------|
|1|	char charAt(int index)	|returns char value for the particular index
|2|	int length()	|returns string length
|3|	static String format(String format, Object... args)	|returns a formatted string.
|4|	static String format(Locale l, String format, Object... args)|	returns formatted string with given locale.
|5|	String substring(int beginIndex)|	returns substring for given begin index.
|6|	String substring(int beginIndex, int endIndex)	|returns substring for given begin index and end index.
|7|	boolean contains(CharSequence s)|	returns true or false after matching the sequence of char value.
|8|	static String join(CharSequence delimiter, CharSequence... elements)	|returns a joined string.
|9|	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)	|returns a joined string.
|10|	boolean equals(Object another)	|checks the equality of string with the given object.
|11	|boolean isEmpty()|	checks if string is empty.
|12	|String concat(String str)	|concatenates the specified string.
|13	|String replace(char old, char new)	|replaces all occurrences of the specified char value.
|14	|String replace(CharSequence old, CharSequence new)	|replaces all occurrences of the specified CharSequence.
|15	|static String equalsIgnoreCase(String another)	|compares another string. It doesn't check case.
|16	|String[] split(String regex)	|returns a split string matching regex.
|17	|String[] split(String regex, int limit)	|returns a split string matching regex and limit.
|18	|String intern()|	returns an interned string.
|19	|int indexOf(int ch)	|returns the specified char value index.
|20	|int indexOf(int ch, int fromIndex)	|returns the specified char value index starting with given index.
|21	|int indexOf(String substring)	|returns the specified substring index.
|22	|int indexOf(String substring, int fromIndex) |	returns the specified substring index starting with given index.
|23	|String toLowerCase() |	returns a string in lowercase.
|24	|String toLowerCase(Locale l) |	returns a string in lowercase using specified locale.
|25	|String toUpperCase() |	returns a string in uppercase.
|26	|String toUpperCase(Locale l) |	returns a string in uppercase using specified locale.
|27	|String trim() |	removes beginning and ending spaces of this string.
|28	|static String valueOf(int value) | 	converts given type into string. It is an overloaded method.

---

## 🧩 Common Format Specifiers

| Format | Description                            | Used With                   | Example                      |
|--------|----------------------------------------|-----------------------------|------------------------------|
| `%s`   | String                                  | `String`, `Object`          | `String.format("%s", "Java")` → `"Java"` |
| `%d`   | Decimal integer                         | `byte`, `short`, `int`, `long` | `"%d".formatted(42)` → `"42"` |
| `%f`   | Floating-point number (decimal format) | `float`, `double`           | `String.format("%.2f", 3.14)` → `"3.14"` |
| `%c`   | Single character                        | `char`                      | `String.format("%c", 'A')` → `"A"` |
| `%b`   | Boolean value                           | `boolean`, `Boolean`        | `String.format("%b", true)` → `"true"` |
| `%n`   | Line separator (platform-independent)  | —                           | `System.out.printf("Line1%nLine2")` |

---


