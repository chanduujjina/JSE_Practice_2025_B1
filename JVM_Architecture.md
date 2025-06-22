```mermaid
Java Source Code (.java)
        ↓
  Javac Compiler
        ↓
   Bytecode (.class)
        ↓
   ┌───────────────────────────────┐
   │     Java Virtual Machine      │
   ├───────────────────────────────┤
   │ Class Loader Subsystem        │
   │ Runtime Data Areas:           │
   │   - Method Area               │
   │   - Heap                      │
   │   - Java Stack                │
   │   - PC Register               │
   │   - Native Method Stack       │
   │ Execution Engine:             │
   │   - Interpreter               │
   │   - JIT Compiler              │
   │   - Garbage Collector         │
   │ Native Interface (JNI)        │
   │ Native Method Libraries       │
   └───────────────────────────────┘

```
