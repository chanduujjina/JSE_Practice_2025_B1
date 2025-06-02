📘 Composition vs Aggregation in OOP
Both Composition and Aggregation represent "Has-a" relationships in OOP, but they differ in terms of ownership and object lifecycle.

🧱 1. Composition (Strong Has-a)
✅ Definition:
A Composition relationship means one object owns another object, and the owned object cannot exist independently of the owner.

🧠 Key Points:
Strong association.

If the container object is destroyed, the contained object is also destroyed.

Implemented by instantiating the dependent object inside the class.

[Human] ---owns---> [Heart]
