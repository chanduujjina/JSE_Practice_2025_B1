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
    class Cat {
        +bark()
    }
  


