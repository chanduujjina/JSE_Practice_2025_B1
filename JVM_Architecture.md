```mermaid
flowchart TB
    A[Java Source Code (.java)] --> B[Javac Compiler]
    B --> C[Bytecode (.class)]
    C --> D[JVM]
    
    subgraph Java Virtual Machine (JVM)
        D1[Class Loader Subsystem]
        D2[Runtime Data Areas]
        D3[Execution Engine]
        D4[Native Interface (JNI)]
        D5[Native Method Libraries]
        
        D --> D1
        D --> D2
        D --> D3
        D3 --> D4
        D4 --> D5
    end

    subgraph Runtime Data Areas
        D2a[Method Area]
        D2b[Heap]
        D2c[Java Stack]
        D2d[PC Register]
        D2e[Native Method Stack]
    end

    subgraph Execution Engine
        D3a[Interpreter]
        D3b[JIT Compiler]
        D3c[Garbage Collector]
    end

    D2 --> D2a
    D2 --> D2b
    D2 --> D2c
    D2 --> D2d
    D2 --> D2e
    
    D3 --> D3a
    D3 --> D3b
    D3 --> D3c
```
