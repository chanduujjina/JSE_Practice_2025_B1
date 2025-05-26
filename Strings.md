

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



