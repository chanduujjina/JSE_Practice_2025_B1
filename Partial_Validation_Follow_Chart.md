```mermaid
flowchart TD
    A[Start] --> B[Enter Username and Password]
    B --> C{Are credentials are not empty?}
    C -- Yes --> D[Show Login Successful Message]
    C -- No --> E[Show Error Message]
    E --> F[Retry Login]
    F --> B
   
```
