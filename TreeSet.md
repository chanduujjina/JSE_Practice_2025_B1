```mermaid
TreeSet Navigation
|
|-- lower(E)        -> Greatest element strictly < E
|-- floor(E)        -> Greatest element ≤ E
|-- ceiling(E)      -> Least element ≥ E
|-- higher(E)       -> Least element strictly > E
|
|-- Edge Cases
     |-- Empty TreeSet → All return null
     |-- No such element → Return null (not exception)
|
|-- Real Use Cases
     |-- Get just smaller or just higher range values
     |-- Scheduling, Slot Matching, Leaderboards
```
