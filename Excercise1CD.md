```mermaid
classDiagram
    class Person {
        -name : String
        -age : int
        +getName() : String
        +setName(name : String) : void
    }

    class Student {
        -studentId : int
        +getStudentId() : int
    }

    Person <|-- Student
