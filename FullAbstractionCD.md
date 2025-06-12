```mermaid
classDiagram
    class PaymentGateway {
        <<interface>>
        +initiatePayment(double amount)
        +verifyPayment(String transactionId)
    }

    class PayPal {
        +initiatePayment(double amount)
        +verifyPayment(String transactionId)
    }

    class Razorpay {
        +initiatePayment(double amount)
        +verifyPayment(String transactionId)
    }

    PaymentGateway <|.. PayPal
    PaymentGateway <|.. Razorpay
