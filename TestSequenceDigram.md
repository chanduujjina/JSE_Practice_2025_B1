# Life Cycle of Object
```mermaid
stateDiagram-v2
    [*] --> Instantatied
    Instantatied --> ConstctorCall
    ConstctorCall --> LoadDataToInstanceVariable
    LoadDataToInstanceVariable --> GC
    GC --> [*]
