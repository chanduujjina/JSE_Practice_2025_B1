# Java Relationships

Below diagram shows:

- `Animal <|-- Dog` means Dog **is-a** Animal (inheritance).


```mermaid
classDiagram
    class Animal {
        +eat()
    }
    class Dog {
        +bark()
    }
    Animal <|-- Dog

    class Cat {
        +bark()
    }
    Animal <|-- Cat
  


