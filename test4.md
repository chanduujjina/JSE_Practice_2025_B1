```mermaid
sequenceDiagram
    participant Dev as Developer
    participant WS as Working Directory
    participant Index as Staging Area
    participant Repo as Git Repository

    Dev->>WS: Modify files (Unstaged)
    Dev->>Index: git add (Stage files)
    Index-->>Dev: Files staged
    Dev->>Repo: git commit
    Repo-->>Dev: Commit created


