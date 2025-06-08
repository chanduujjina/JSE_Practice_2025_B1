```mermaid
classDiagram

    class Hospital {
        -name: String
        +addDepartment(d: Department)
    }

    class Department {
        -name: String
    }

    class Doctor {
        -name: String
        +treat(p: Patient)
    }

    class Patient {
        -name: String
        -record: MedicalRecord
    }

    class MedicalRecord {
        -diagnosis: String
        -prescriptions: List~String~
    }

    Hospital "1" o-- "*" Department : has
    Doctor "1" --> "*" Patient : treats
    Patient "1" *-- "1" MedicalRecord : contains
