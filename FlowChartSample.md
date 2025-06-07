```mermaid
flowchart TD
    A[Start] --> B[Login]
    B --> C{Valid Credentials?}
    C -- Yes --> D[Show Dashboard]
    C -- No --> E[Show Error]
    D --> F[Logout]
    E --> B
    F --> G[End]
