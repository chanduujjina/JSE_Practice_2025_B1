## TypeCasting:
✅ Quick Summary Table:
| Operation  | Description                          | Automatic? |
| ---------- | ------------------------------------ | ---------- |
| Widening   | Small → Large primitive (int → long) | ✅ Yes      |
| Narrowing  | Large → Small primitive (long → int) | ❌ No       |
| Autoboxing | Primitive → Wrapper (int → Integer)  | ✅ Yes      |
| Unboxing   | Wrapper → Primitive (Integer → int)  | ✅ Yes      |

🧠 Java's Preference Order (Overloading Resolution)
# When choosing among overloaded methods, Java follows this priority:
- Exact match

- Widening primitive

- Autoboxing

- Var-args

