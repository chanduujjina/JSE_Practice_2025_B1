```mermaid
stateDiagram-v2
    [*] --> Instantaiation
    Instantaiation --> Contructor_will_all
     Contructor_will_all --> instance_varibles_will_load
    instance_varibles_will_load -> GC
    GC --> [*]




