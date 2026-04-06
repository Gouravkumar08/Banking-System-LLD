# Banking System – Low-Level Design

A console-based banking system built in Java to practice **Low Level Design (LLD)** concepts,
design patterns, and SOLID principles.

## Design Patterns Used

- **Strategy Pattern** – `PaymentStrategy` interface with `UPIStrategy` and `CreditCardStrategy.`
  as concrete implementations, allowing new payment modes to be added without touching existing code.
- **Factory Pattern** – `PaymentStrategyFactory` selects the correct payment strategy at runtime
  based on the payment mode string, decoupling object creation from business logic.

## SOLID Principles Applied

- **S** – Each class has one responsibility: `Account` manages its own balance and transactions,
  `BankService` orchestrates operations, `Transaction` holds record data.
- **O** – New payment methods can be added by implementing `PaymentStrategy` with zero changes
  to `BankService` or `Account`.
- **D** – `BankService` depends on the `PaymentStrategy` interface, not on concrete implementations.

## Project Structure

```
Banking-System-LLD/
├── src/
│   ├── model/
│   │   ├── Account.java
│   │   └── Transaction.java
│   ├── enums/
│   │   └── TransactionType.java
│   ├── strategies/
│   │   ├── PaymentStrategy.java
│   │   ├── PaymentStrategyFactory.java
│   │   ├── UPIStrategy.java
│   │   └── CreditCardStrategy.java
│   ├── service/
│   │   └── BankService.java
│   └── Main.java
└── README.md
```

## Features

- Create bank accounts
- Deposit and withdraw funds
- Transfer funds via **UPI** or **Credit Card**
- View account details and full transaction history

## How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/Gouravkumar08/Banking-System-LLD.git
   ```
2. Open the project in IntelliJ IDEA
3. Run `Main.java`

## Sample Output

```
---------- Bank ----------
Account created: 101
Deposit successful: 14000.0
Account created: 102
Successfully paid via UPI from AccNo: 101 to AccNo: 102
Withdrawal successful: 500.0
Balance: 2000.0
Balance: 21000.0
Account number: 101, Account holder name: Gourav Kumar
Transaction History:
DEPOSIT: 14000.0 at 2026-04-06T...
WITHDRAW: 2000.0 at 2026-04-06T...
WITHDRAW: 500.0 at 2026-04-06T...
DEPOSIT: 10000.0 at 2026-04-06T...
```
