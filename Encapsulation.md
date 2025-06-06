# Encapsulation

- **Encapsulation** binds data and methods together.  
- It **hides the internal state** of an object and **protects it from unauthorized access**.  
- Achieved using **private variables** and **public getter/setter methods**.
  
<img src="Encapsulation.jpg" alt="Flowers in Chania">

✅ Steps to Achieve Encapsulation in Java
 - Declare class variables as private
 - Provide public getter and setter methods to access and update those variables
 ```java
   public class BankAccount {
    private String accountHolder;     // private = encapsulated
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
    }
}
```



# Benefits of Encapsulation
 - Improved security: Direct access to data is restricted

- Flexibility: You can change the internal implementation without affecting other classes

- Validation: You can validate data before modifying the fields

- Code Maintainability: Easier to update and maintain
---
