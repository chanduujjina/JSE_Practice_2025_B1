```mermaid
stateDiagram-v2
    [*] --> Instantaiation
    Instantaiation --> Contructor_will-_all
    Contructor-will-call --> instance_varibles_will_load
    nstance_varibles_will_load -> GC
    GC --> [*]




