#🎨 Complete Design Patterns Classification in Java
## 🔷 1. Creational Patterns
| Pattern              | Purpose                                              | Real-world Java Use Case                              |
| -------------------- | ---------------------------------------------------- | ----------------------------------------------------- |
| **Singleton**        | Ensure a class has only one instance                 | Logger, DB connection manager, config class           |
| **Factory Method**   | Creates objects without exposing instantiation logic | JDBC `DriverManager.getConnection()`                  |
| **Abstract Factory** | Provides an interface for creating related objects   | GUI Toolkit (e.g., create buttons for different OSes) |
| **Builder**          | Builds complex objects step by step                  | `StringBuilder`, constructing HTML/XML objects        |
| **Prototype**        | Clones existing objects                              | Object cloning via `clone()`                          |

## 🔶 2. Structural Patterns

| Pattern       | Purpose                                     | Real-world Java Use Case                               |
| ------------- | ------------------------------------------- | ------------------------------------------------------ |
| **Adapter**   | Converts one interface to another           | `InputStreamReader`, `Arrays.asList()`                 |
| **Decorator** | Adds behavior to objects dynamically        | `BufferedReader` wraps `FileReader`                    |
| **Facade**    | Simplifies complex subsystem                | `javax.faces.context.FacesContext`                     |
| **Proxy**     | Controls access to object                   | Lazy loading, security, logging in DAO                 |
| **Composite** | Treats groups of objects as a single object | `Swing` UI Components (e.g., JPanel contains buttons)  |
| **Bridge**    | Separates abstraction from implementation   | JDBC API (`Connection` is abstraction, driver is impl) |
| **Flyweight** | Shares common objects to save memory        | `Integer.valueOf()`, `String` pool                     |


## 🔁 3. Behavioral Patterns

| Pattern                     | Purpose                                         | Real-world Java Use Case                                        |
| --------------------------- | ----------------------------------------------- | --------------------------------------------------------------- |
| **Strategy**                | Select an algorithm at runtime                  | `Comparator` / sorting strategies                               |
| **Observer**                | Notify objects automatically when state changes | `ActionListener` in Swing, `EventBus`, `PropertyChangeListener` |
| **Command**                 | Encapsulates requests as objects                | GUI menu actions, undo operations                               |
| **Template Method**         | Defines steps of an algorithm in a base class   | `AbstractList`, JDBC template-style design                      |
| **Iterator**                | Provides a way to traverse collections          | `Iterator`, `ListIterator` in Java Collections                  |
| **Chain of Responsibility** | Pass request along a chain of handlers          | Servlet Filters, Exception Handling chains                      |
| **Mediator**                | Central object that handles interactions        | Chat Room example, Air traffic controller pattern               |
| **State**                   | Change behavior based on internal state         | Thread lifecycle (`NEW`, `RUNNABLE`, etc.)                      |
| **Memento**                 | Save and restore object state (undo)            | IDEs, Text editors — undo/redo                                  |
| **Visitor**                 | Separate algorithm from object structure        | File system operations, AST parsing                             |
| **Interpreter**             | Implements grammar/interpretation rules         | Expression evaluators, DSLs                                     |


## 🧠 Summary Matrix (All Design Patterns)
| Type           | Design Patterns                                                                                                                 |
| -------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| **Creational** | Singleton, Factory Method, Abstract Factory, Builder, Prototype                                                                 |
| **Structural** | Adapter, Decorator, Facade, Proxy, Composite, Bridge, Flyweight                                                                 |
| **Behavioral** | Strategy, Observer, Command, Template Method, Iterator, Chain of Responsibility, Mediator, State, Memento, Visitor, Interpreter |

### 🧱 Singleton Design Pattern
- ✅ Purpose:
   - Ensure that a class has only one instance and provide a global point of access to it.

### 🏭 Factory Method Design Pattern in Java
- ✅ Purpose:
   - Defines an interface for creating an object, but lets subclasses decide which class to instantiate.

   - This promotes loose coupling and follows Open/Closed Principle — new types can be added without modifying existing code.
