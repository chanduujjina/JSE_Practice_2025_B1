```mermaid
stateDiagram-v2
    [*] --> Instantaiation
    Instantaiation --> ContructorCall
     ContructorCall --> InstanceStateLoad
    InstanceStateLoad --> GC
    GC --> [*]




