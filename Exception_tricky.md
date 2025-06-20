📜 Constructor Exception Handling Rules – Summary

| **Superclass Constructor** Throws | **Subclass Constructor** Throws | **Allowed?** | **Explanation**                                                                       |
| --------------------------------- | ------------------------------- | ------------ | ------------------------------------------------------------------------------------- |
| `Exception` (checked)             | `IOException` (subclass)        | ✅ Yes        | Subclass can declare a **narrower** checked exception.                                |
| `IOException`                     | `Exception` (superclass)        | ❌ No         | Subclass **cannot broaden** checked exception.                                        |
| `IOException`                     | `SQLException` (unrelated)      | ❌ No         | Cannot introduce **new** checked exceptions not declared in superclass.               |
| `IOException`                     | *(no exception)*                | ✅ Yes        | You can **suppress** checked exceptions in subclass.                                  |
| *(no exception)*                  | `IOException` (checked)         | ❌ No         | Cannot declare **new checked** exception in subclass if superclass doesn’t throw any. |
| `Exception`                       | `RuntimeException` (unchecked)  | ✅ Yes        | Unchecked exceptions are **not restricted**.                                          |
| *(no exception)*                  | `RuntimeException` (unchecked)  | ✅ Yes        | Subclass can throw unchecked exceptions freely.                                       |

Overriding method Exception Handling Rules – Summary
| Parent throws         | Child can throw                    | OK?   |
| --------------------- | ---------------------------------- | ----- |
| `Exception` (checked) | `IOException` (subclass)           | ✅ Yes |
| `IOException`         | `Exception` (superclass)           | ❌ No  |
| `IOException`         | `SQLException` (different checked) | ❌ No  |
| `IOException`         | `RuntimeException` (unchecked)     | ✅ Yes |
| Nothing               | `Exception`                        | ❌ No  |
