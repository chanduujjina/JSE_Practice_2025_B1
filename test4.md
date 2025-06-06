```mermaid
stateDiagram-v2
    [*] --> Instantaiation
    Instantaiation --> Contructor will call
    Contructor will call --> instance varibles will load
    instance varibles will load -> GC
    GC --> [*]




