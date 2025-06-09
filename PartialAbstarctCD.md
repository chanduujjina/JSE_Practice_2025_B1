```mermaid
classDiagram
    class Bank {
        -String bankName
        +Bank(String bankName)
        +String getBankName()
        +double getRateOfInterest()
        +double calculateInterest(double principal, double time)
    }

    class HDFC {
        +HDFC()
        +double getRateOfInterest()
    }

    class SBI {
        +SBI()
        +double getRateOfInterest()
    }

    class ICICI {
        +ICICI()
        +double getRateOfInterest()
    }

    Bank <|-- HDFC
    Bank <|-- SBI
    Bank <|-- ICICI
