```mermaid
classDiagram
    class LoginHandler {
        +void startLogin()
        +void enterCredentials(String username, String password)
    }

    class Validator {
        +boolean areCredentialsValid(String username, String password)
    }

    class ErrorHandler {
        +void showError(String message)
        +void retry()
    }

    LoginHandler --> Validator : uses
    LoginHandler --> ErrorHandler : on failure
  ```
