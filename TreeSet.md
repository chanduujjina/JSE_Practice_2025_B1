```mermaid
flowchart TD
  A[TreeSet Navigation Methods]
  A --> B1[lower(E)<br>Greatest element < E]
  A --> B2[floor(E)<br>Greatest element ≤ E]
  A --> B3[ceiling(E)<br>Least element ≥ E]
  A --> B4[higher(E)<br>Least element > E]
  A --> C[Edge Cases]
  C --> C1[Empty TreeSet → all return null]
  C --> C2[No such element → null, not exception]

```
