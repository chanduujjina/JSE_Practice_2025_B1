```mermaid
classDiagram
    class Bank {
        <<interface>>
        +getRateOfInterest(): double
    }

    class HDFC {
        +getRateOfInterest(): double
    }

    class SBI {
        +getRateOfInterest(): double
    }

    class ICICI {
        +getRateOfInterest(): double
    }

    class InterestCalculator {
        +calculateInterest(p: double, r: double, t: double): double
    }

    Bank <|.. HDFC
    Bank <|.. SBI
    Bank <|.. ICICI
    InterestCalculator --> Bank : uses
