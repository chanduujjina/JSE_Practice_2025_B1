# Java Relationships

Below diagram shows:

- `Animal <|-- Dog` means Dog **is-a** Animal (inheritance).


```mermaid
classDiagram
    class BaseEmplyee {
       -name : String
        -age : int
    }
    class Permanent {
        -id : int
    }
    BaseEmplyee <|-- Permanent

    class Contract {
       -ct1: int
    }
    BaseEmplyee <|-- Contract
  


