# Java Relationships

Below diagram shows:

- `Animal <|-- Dog` means Dog **is-a** Animal (inheritance).
- `Car --* Engine` means Car **has-a** Engine (composition).

```mermaid
classDiagram
    class Animal {
        +eat()
    }
    class Dog {
        +bark()
    }
    Animal <|-- Dog

    class Engine {
        +start()
    }
    class Car {
        +drive()
        -engine : Engine
    }
    Car --|> Engine

