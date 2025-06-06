```mermaid
sequenceDiagram
    Unstaged->>Staged: git add
    Staged-->>Unstaged: git reset --cached
    Unstaged->>Staged: Are you coming to the party?
    Staged-->>Unstaged: Yes, see you there!


