# Inheritance

 ## Single Ineheritance

```mermaid
graph TD;
    Parent-->|is-a|Child
    
```

## Mutil Level Ineheritance

```mermaid
graph TD;
    GrandParent-->|is-a|Parent;
    Parent-->|is-a|Child
    
```

## Hierarchical  Ineheritance

```mermaid
graph TD;
    A-->|is-a|B;
    A-->|is-a|C
    
```
## Hybrid  Ineheritance
```mermaid
graph TD;
    A-->|is-a|B;
    B-->|is-a|C
    B-->|is-a|D
    
```
## Multiple Inheritance
### Diamond Problem
```mermaid
graph TD;
    A-->|is-a|B;
    A-->|is-a|C;
    B-->|is-a|D
    C-->|is-a|D
    
```


