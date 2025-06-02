📘 Composition vs Aggregation in OOP
Both Composition and Aggregation represent "Has-a" relationships in OOP, but they differ in terms of ownership and object lifecycle.

🧱 1. Composition (Strong Has-a)
✅ Definition:
A Composition relationship means one object owns another object, and the owned object cannot exist independently of the owner.

🧠 Key Points:
Strong association.

If the container object is destroyed, the contained object is also destroyed.

Implemented by instantiating the dependent object inside the class.

2. Aggregation (Weak Has-a)
✅ Definition:
An Aggregation relationship means one object uses another object, but the used object can exist independently of the user.

🧠 Key Points:
Weak association.

Lifecycle is not tightly bound.

Object is usually passed in via constructor or setter.

🔁 Comparison Table:

| Feature         | Composition                       | Aggregation                 |
| --------------- | --------------------------------- | --------------------------- |
| Type            | Strong Has-a                      | Weak Has-a                  |
| Ownership       | Owns the object                   | Uses the object             |
| Lifespan        | Part’s lifecycle depends on whole | Independent lifecycle       |
| Object Creation | Created inside the class          | Passed externally           |
| Example         | Human has-a Heart                 | University has-a Department |

