# Assignment 53 - Competitive Coding

This assignment contains competitive coding and logic-building problems based on real-world scenarios. The programs focus on developing problem-solving skills by applying conditional statements, input validation, arithmetic operations, and logical conditions.

## Questions

### Q1 - Parking Fee Calculation

Calculate the parking fee based on the total number of hours a vehicle stays in a shopping mall parking area.

- First 2 hours → ₹20 flat
- After 2 hours → ₹10 per extra hour
- More than 10 hours → Additional ₹50 penalty
- Negative hours → Invalid input

**File:** `ParkFee.java`

### Q2 - Personal Loan Eligibility

Check whether a customer is eligible for a personal loan based on different eligibility conditions.

- Age must be between 21 and 60
- Monthly income must be at least ₹25,000
- Credit score must be at least 700
- Customer must not have an existing unpaid loan
- Invalid input should be handled

**File:** `LoanCheck.java`

### Q3 - Stock Availability

Check whether the requested quantity of a product is available in the warehouse.

- Requested quantity greater than available stock → Order fails
- Otherwise, deduct the requested quantity from the stock
- If remaining stock is less than 5 → Display low stock alert
- Stock cannot be negative
- Requested quantity must be greater than 0

**File:** `StockCheck.java`

### Q4 - Traffic Fine Calculation

Calculate the total traffic fine based on different rule violations.

- No helmet → ₹500
- No license → ₹1000
- Overspeeding → ₹1500
- Multiple violations → Add all applicable fines
- Input must be either Yes or No

**File:** `TrafficFine.java`

### Q5 - Income Tax Calculation

Calculate annual income tax using progressive tax slabs.

- Up to ₹2,50,000 → 0%
- ₹2,50,001 to ₹5,00,000 → 5%
- ₹5,00,001 to ₹10,00,000 → 20%
- Above ₹10,00,000 → 30%
- Negative income → Invalid input

**File:** `IncomeTax.java`

## Concepts Practiced

- Conditional Statements
- If-Else Statements
- Nested Conditions
- Logical Operators
- Arithmetic Operations
- Input Validation
- Progressive Slab Calculations
- Real-World Problem Solving
- Competitive Coding Logic

## Technologies Used

- Java
- Visual Studio Code
- Git & GitHub

## Repository Structure

```text
Assignment53/
│
├── ParkFee.java
├── LoanCheck.java
├── StockCheck.java
├── TrafficFine.java
├── IncomeTax.java
└── README.md
