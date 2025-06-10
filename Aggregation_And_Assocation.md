```mermaid
classDiagram
    class Library {
        -books: List~Book~
        +addBook(book: Book)
        +removeBook(bookId: int)
    }

    class Book {
        -id: int
        -title: String
        -author: String
        -isAvailable: boolean
    }

    class Member {
        -memberId: int
        -name: String
        +borrowBook(book: Book)
        +returnBook(book: Book)
    }

    Library "1" o-- "*" Book
    Member "1" --> "*" Book : borrows
