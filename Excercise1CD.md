```mermaid
classDiagram
    class BaseEmployee {
        -name : String
        -age : int
        -gender:String
    }

    class PermamentEmployee {
        -doj : String
         -salary: Double
         +getSalary()
    }

    BaseEmployee <|-- PermamentEmployee

    class ContractEmployee {
        -payRollCompany : String
         -contractEndDate: Double
    }
    BaseEmployee <|-- ContractEmployee

   class InternEmployee {
        -collegeName : String
         -lastDate: String
    }
    BaseEmployee <|-- InternEmployee
