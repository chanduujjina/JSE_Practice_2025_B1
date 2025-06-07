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
    Parent-->|is-a|Child1;
    Parent-->|is-a|Child2
    
```
## Hybrid  Ineheritance
```mermaid
graph TD;
    GrandParent-->|is-a|Parent;
    Parent-->|is-a|Child1
    Parent-->|is-a|Child2
    
```
## Multiple Inheritance
### Diamond Problem
```mermaid
graph TD;
    GrandParent-->|is-a|Parent1;
    GrandParent-->|is-a|Parent2;
    Parent1-->|is-a|Child
    Child-->|is-a|SubChild
    
```


