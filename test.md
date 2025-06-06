```mermaid
classDiagram
    %% "is-a" relationship (Inheritance)
    class Animal {
        +eat()
    }
    class Dog {
        +bark()
    }
    Animal <|-- Dog   %% Dog **is-a** Animal

    %% "has-a" relationship (Composition/Aggregation)
    class Engine {
        +start()
    }
    class Car {
        +drive()
        -engine : Engine
    }
    Car *-- Engine   %% Car **has-a** Engine (composition)

