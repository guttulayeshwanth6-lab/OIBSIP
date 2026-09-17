# ATM Interface – Java Console-Based Banking System

## 📌 Project Overview

The ATM Interface is a Java-based console application that simulates the basic operations of an Automated Teller Machine (ATM).

The project allows a user to log in using an Account ID and PIN and perform common banking operations such as checking balance, depositing money, withdrawing money, and viewing transaction history.

This project was developed as part of my Java internship to practice Java programming, Object-Oriented Programming (OOP), conditional statements, loops, methods, user input, and basic banking operations.

---

## 🎯 Objectives

The main objectives of this project are:

- To develop a simple ATM banking application using Java.
- To understand and implement Object-Oriented Programming concepts.
- To perform basic banking transactions.
- To implement user authentication using Account ID and PIN.
- To maintain transaction history.
- To practice Java classes, objects, methods, loops, and conditional statements.
- To develop a menu-driven console application.

---

## ✨ Features

### 1. 🔐 User Login

The application provides a simple login system using:

- Account ID
- PIN

If the entered credentials are incorrect, the application displays an error message and terminates.

### 2. 💰 Check Balance

Users can check their current account balance at any time after logging in.

### 3. ➕ Deposit Money

Users can enter an amount to deposit into their account.

The application:

- Validates the amount.
- Adds the amount to the account balance.
- Displays the updated balance.
- Stores the transaction in transaction history.

### 4. 💸 Withdraw Money

Users can withdraw money from their account.

The application:

- Checks whether the entered amount is valid.
- Checks whether sufficient balance is available.
- Deducts the amount from the account.
- Displays the remaining balance.
- Stores the transaction in transaction history.

### 5. 📜 Transaction History

The application maintains a list of transactions performed during the session.

Users can view:

- Deposit transactions
- Withdrawal transactions

### 6. 🚪 Exit

The user can safely exit the ATM application by selecting the Exit option.

---

## 🛠️ Technologies Used

- **Programming Language:** Java
- **JDK Version:** JDK 21
- **IDE:** Visual Studio Code
- **Input:** Java Scanner
- **Data Structure:** ArrayList
- **Concepts:** Object-Oriented Programming, Classes, Objects, Methods, Loops, Conditional Statements

---

## 📂 Project Structure

```text
ATM-Interface/
│
├── Account.java
├── Bank.java
├── ATM.java
├── Transaction.java
├── Main90.java
└── README.md
