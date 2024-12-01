# Bank Management System

## Overview
The **Bank Management System** is a Java-based desktop application developed using **Java Swing**, **AWT**, and **MySQL**. This project provides basic banking functionalities like account creation, login, and transaction management, mimicking the features of an ATM system.

---

## Features

### 1. **Login System**
- **Sign Up**: New users can register by providing personal and account details.
- **Sign In**: Registered users can log in using their card number and PIN.
- **Clear**: Clear all fields in the login form.

### 2. **Account Creation Process**
- **Step 1: Personal Details Form**: Users provide their basic personal information.
- **Step 2: Additional Details Form**: Users provide supplementary details.
- **Step 3: Account Details Form**: Users select the account type and services.
- **Submit**: After successful submission, the system generates a:
  - **16-digit Card Number**.
  - **4-digit PIN Number**.

### 3. **ATM Functionalities**
After a successful login, users can access various banking operations:
- **Deposit**: Add funds to the account.
- **Withdraw**: Withdraw funds from the account.
- **Balance Enquiry**: Check the current account balance.
- **Fast Cash**: Withdraw predefined amounts quickly.
- **Mini Statement**: View the latest transaction history.
- **PIN Change**: Update the account PIN.
- **Exit**: Logout of the system.

---

## Database Details
- The application uses **MySQL** for storing data.
- Key Tables:
  - **User Table**: Stores personal, additional, and account details.
  - **Transaction History Table**: Logs transactions with details like date, type (deposit/withdrawal), amount, and PIN number.
- All tables are connected using the **PIN Number** as a unique identifier.

---

## Technologies Used
- **Programming Language**: Java
- **UI Frameworks**: Java Swing and AWT
- **Database**: MySQL

---

## How It Works
1. **Sign Up**:
   - New users register by filling out personal, additional, and account details forms.
   - Upon submission, the system generates a card number and PIN, stored in the database.

2. **Login**:
   - Users log in using their card number and PIN.
   - If the credentials are invalid, an error message is displayed.

3. **ATM Functionalities**:
   - Any action (deposit, withdrawal, etc.) updates the database in real time.
   - Transaction details are stored in the **Transaction History Table**.

---
