# BankingJUnitProject

## Project Description
BankingJUnitProject is a simple banking application developed using Java, Maven, and JUnit. It demonstrates basic banking operations and exception handling. JUnit is used to test the functionality of the application.

## Technologies Used
- **Programming Language:** Java
- **Build Tool:** Apache Maven
- **Testing Framework:** JUnit 4
- **IDE:** Eclipse
- **Version Control:** Git and GitHub

## Features
- Check account balance
- Deposit money into an account
- Withdraw money from an account
- Handle insufficient balance using a custom exception
- Validate deposit and withdrawal amounts
- Perform automated unit testing using JUnit

## Project Structure

```text
BankingJUnitProject/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           ├── BankAccount.java
│   │           ├── InsufficientFundsException.java
│   │           └── BankingApp.java
│   └── test/
│       └── java/
│           └── com/example/
│               └── BankAccountTest.java
└── README.md
```

## Prerequisites
- Java Development Kit (JDK)
- Eclipse IDE
- Apache Maven
- Git (for version control)

## How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/BankingJUnitProject.git
```

Replace `YOUR-USERNAME` with your GitHub username.

### 2. Open in Eclipse
1. Open Eclipse IDE.
2. Select **File → Import**.
3. Select **Maven → Existing Maven Projects**.
4. Browse to the cloned project folder.
5. Select `pom.xml` and click **Finish**.

### 3. Run the Tests
Right-click the project and select **Run As → Maven test**.

Alternatively, run `BankAccountTest.java` using **Run As → JUnit Test**.

### 4. Build the Project
Right-click the project and select **Run As → Maven build**.

Enter the following goal:

```bash
clean package
```

### 5. Run the Executable JAR
If the executable JAR is configured in `pom.xml`, run:

```bash
java -jar target/BankingJUnitProject-1.0-SNAPSHOT.jar
```

## Unit Tests
The project includes four JUnit test cases:
1. Test deposit operation.
2. Test withdrawal operation.
3. Test insufficient funds exception.
4. Test invalid deposit amount.

## Expected Result
All four JUnit tests should pass successfully when the project is configured correctly.

## Learning Outcomes
- Understanding Java classes and objects.
- Implementing exception handling.
- Managing dependencies using Maven.
- Writing unit tests using JUnit.
- Building and managing projects with Eclipse.
- Using GitHub for source code management.

## Author
MCA Student

## License
This project is created for educational and academic purposes.
